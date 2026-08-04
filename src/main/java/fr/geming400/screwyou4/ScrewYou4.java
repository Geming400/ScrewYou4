package fr.geming400.screwyou4;

import fr.geming400.screwyou4.generator.Generator;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.resources.Identifier;

import net.minecraft.util.RandomSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.*;

public class ScrewYou4 implements ModInitializer {
	public static final String MOD_ID = "screw-you-4";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final SequencedSet<Long> METHODS = new LinkedHashSet<>();
	public static final SequencedSet<Long> KILLED_METHODS = new LinkedHashSet<>();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from the mod that will Screw You (4) !");
		this.computeClasses();

		ServerPlayerEvents.AFTER_RESPAWN.register((oldPlayer, newPlayer, alive) -> {
			List<Long> aliveMethods = getAliveMethods();
			RandomSource random = newPlayer.getRandom();

			long toKill = aliveMethods.get(random.nextInt(aliveMethods.size() - 1));
			killMethod(toKill);

			LOGGER.info("Killed method {}", toKill);
		});
	}

	private void computeClasses() {
		Thread thread = new Thread(() -> {
			LOGGER.info("Finding Minecraft classes...");
			Set<Class<?>> classes = Generator.getAllMinecraftClasses(false);
			LOGGER.info("Found {} classes !", classes.size());

			for (Class<?> clazz : classes) {
				for (Method method : clazz.getDeclaredMethods()) {
					if (!Utils.isPackagePrivate(method))
						METHODS.add(Utils.getUniqueMethodID(method));
				}
			}

			LOGGER.info("Found {} methods !", METHODS.size());
        });

		thread.setName("Class computation thread");
		thread.start();
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
	}

	public static boolean isMethodAlive(long method) {
		return !KILLED_METHODS.contains(method);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
