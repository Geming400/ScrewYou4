package fr.geming400.screwyou4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import fr.geming400.screwyou4.generator.Generator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLevelEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class ScrewYou4 implements ModInitializer {
	public static final String MOD_ID = "screw-you-4";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Map<String, List<Generator.SerializedMethod>> METHODS_BY_CLASS;
	public static final SequencedSet<Long> METHODS = new LinkedHashSet<>();
	public static final SequencedSet<Long> KILLED_METHODS = new LinkedHashSet<>();

	private static ResourceManager resourceManager = ResourceManager.Empty.INSTANCE;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from the mod that will Screw You (4) !");

		// FIXME
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
			LOGGER.error("Dedicated servers are not supported yet");
			throw new RuntimeException("Dedicated servers are not supported yet");
		}

		onLocalPlayerRespawn(player -> {
			Generator.SerializedMethod toKill = getRandomMethod(player.getRandom());
			killMethod(toKill.uniqueID());

			LOGGER.info("Killed method {} (CLIENT)", toKill);
		});

		onDedicatedServerPlayerRespawn(player -> {
			Generator.SerializedMethod toKill = getRandomMethod(player.getRandom());
			killMethod(toKill.uniqueID());

			LOGGER.info("Killed method {} (DEDICATED SERVER)", toKill);
		});

		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
				resourceManager = client.getResourceManager();
				this.setMethodsFromPrecomputedFile();
			});
		} else {
			ServerLevelEvents.LOAD.register((server, level) -> {
				resourceManager = server.getResourceManager();
				this.setMethodsFromPrecomputedFile();
			});
		}
	}

	private void computeClasses() {
		Thread thread = new Thread(() -> {
			LOGGER.info("Starting search for Minecraft classes...");
			Set<Class<?>> classes = Generator.getAllMinecraftClasses(false);
			LOGGER.info("Found {} classes !", classes.size());

			for (Class<?> clazz : classes) {
				if (!Generator.canMixinClass(clazz))
					continue;

				List<Generator.SerializedMethod> methods = new ArrayList<>();
				for (Method method : clazz.getDeclaredMethods()) {
					if (!Generator.canMixinMethod(method))
						continue;

					methods.add(Generator.SerializedMethod.of(method));
				}

				METHODS_BY_CLASS.put(clazz.getTypeName(), methods);
			}

			LOGGER.info("Found {} methods !", METHODS.size());
		});

		thread.setName("Class computation thread");
		thread.start();
	}

	private void setMethodsFromPrecomputedFile() {
		LOGGER.info("Reading found methods file");

		if (METHODS_BY_CLASS != null) {
			LOGGER.info("Already parsed SerializedMethods, won't parse it again !");
			return;
		}

		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
			LOGGER.info("Dedicated environment server detected ! Computing classes on the fly to not have a desync in the classes that are server only");
			this.computeClasses();
			return;
		}

		try {
			Optional<Resource> foundMethodsResource = resourceManager.getResource(ScrewYou4.id("found_methods.json"));

			if (foundMethodsResource.isEmpty()) {
				LOGGER.error("Couldn't find 'found_methods.json'. Computing methods on the fly instead");
				this.computeClasses();

				return;
			}

			Map<String, List<Generator.SerializedMethod>> foundMethods = new Gson().fromJson(foundMethodsResource.get().openAsReader(), new TypeToken<>() {});
			METHODS_BY_CLASS = foundMethods;

			AtomicLong foundClassesCount = new AtomicLong();
			AtomicLong foundMethodsCount = new AtomicLong();
			foundMethods.forEach((clazz, methods) -> {
				foundClassesCount.addAndGet(1);
				foundMethodsCount.addAndGet(methods.size());

				METHODS.addAll(methods
						.stream()
						.map(Generator.SerializedMethod::uniqueID)
						.toList());
			});

			LOGGER.info("Found {} classes and {} methods from precomputed 'found_methods.json' file !", foundClassesCount, foundMethodsCount);
		} catch (IOException e) {
			LOGGER.error("Got an error while trying to read found_methods.json", e);
		}
	}

	private static void onLocalPlayerRespawn(RespawnCallback onRespawn) {
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			AtomicBoolean isDead = new AtomicBoolean();
			ClientTickEvents.START_CLIENT_TICK.register(client -> {
				Player player = client.player;
				if (player != null) {
					if (player.isDeadOrDying()) {
						isDead.set(true);
					} else if (isDead.get()) {
						LOGGER.debug("Local player {} has respawned !", player);
						isDead.set(false);

						onRespawn.onRespawn(player);
					}
				}
			});
		}
	}

	private static void onDedicatedServerPlayerRespawn(RespawnCallback onRespawn) {
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.SERVER) {
			AtomicReference<Map<Integer, Boolean>> deadState = new AtomicReference<>(new HashMap<>());
			ServerTickEvents.START_SERVER_TICK.register(server -> {
				for (ServerPlayer player : PlayerLookup.all(server)) {
					if (player.isDeadOrDying()) {
						deadState.get().put(player.getId(), true);
					} else if (deadState.get().getOrDefault(player.getId(), false)) {
						LOGGER.debug("Local player {} has respawned !", player);
						deadState.get().put(player.getId(), false);

						onRespawn.onRespawn(player);
					}
				}
			});
		}
	}

	public static List<Generator.SerializedMethod> getAllSerializedMethods() {
		if (METHODS_BY_CLASS == null || METHODS_BY_CLASS.isEmpty()) {
			LOGGER.warn("Tried getting all serialized methods but ScrewYou4.METHODS_BY_CLASS is null or empty !");
			LOGGER.info("METHODS_BY_CLASS == null: {}", METHODS_BY_CLASS == null);
			LOGGER.info("METHODS_BY_CLASS.isEmpty(): {}", METHODS_BY_CLASS.isEmpty());
			return List.of();
		}

		List<Generator.SerializedMethod> res = new ArrayList<>();
		METHODS_BY_CLASS.forEach((clazz, methods) ->
				res.addAll(methods)
		);

		return res;
	}

	public static Generator.SerializedMethod getRandomMethod(RandomSource rng) {
		List<Generator.SerializedMethod> serializedMethods = getAllSerializedMethods();
		return serializedMethods.get(rng.nextInt(serializedMethods.size()));
	}

	public static List<Long> getAliveMethods() {
		List<Long> classes = new ArrayList<>(METHODS);
		classes.removeAll(KILLED_METHODS);

		return classes;
	}

	public static void killMethod(Method method) {
		killMethod(Utils.getUniqueMethodID(method));
	}

	public static void killMethod(long method) {
		KILLED_METHODS.add(method);
		if (KILLED_METHODS.size() == METHODS.size())
			LOGGER.info("Gg. You have destroyed everything. Wait, how are you even playing the game...");
	}

	public static boolean isMethodAlive(long method) {
		return !KILLED_METHODS.contains(method);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	@FunctionalInterface
	interface RespawnCallback {
		void onRespawn(@NotNull Player player);
	}
}
