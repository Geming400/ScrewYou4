package fr.geming400.screwyou4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ibm.icu.impl.ClassLoaderUtil;
import fr.geming400.screwyou4.generator.Generator;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.resources.Identifier;

import net.minecraft.util.RandomSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class ScrewYou4 implements ModInitializer {
	public static final String MOD_ID = "screw-you-4";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Map<String, List<Generator.SerializedMethod>> METHODS_BY_CLASS;
	public static final SequencedSet<Long> METHODS = new LinkedHashSet<>();
	public static final SequencedSet<Long> KILLED_METHODS = new LinkedHashSet<>();

	private static final ClassLoader CLASS_LOADER = ClassLoaderUtil.getClassLoader(ScrewYou4.class);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello from the mod that will Screw You (4) !");
		this.setMethodsFromPrecomputedFile();

		ServerPlayerEvents.AFTER_RESPAWN.register((oldPlayer, newPlayer, alive) -> {
			Generator.SerializedMethod toKill = getRandomMethod(newPlayer.getRandom());
			killMethod(toKill.uniqueID());

			LOGGER.info("Killed method {}", toKill);
		});
	}

	private void setMethodsFromPrecomputedFile() {
		LOGGER.info("Reading found methods file");

		try {
			String rawFoundMethods = Files.readString(
					Paths.get(
							Objects.requireNonNull(CLASS_LOADER.getResource("foundMethods.json")).toURI()
					)
			);

			Map<String, List<Generator.SerializedMethod>> foundMethods = new Gson().fromJson(rawFoundMethods, new TypeToken<>() {});
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

			LOGGER.info("Found {} classes and {} methods from precomputed 'foundMethods.json' file !", foundClassesCount, foundMethodsCount);
		} catch (URISyntaxException | IOException e) {
			LOGGER.error("Got an error while trying to read foundMethods.json", e);
		}
	}

	public static List<Generator.SerializedMethod> getAllSerializedMethods() {
		List<Generator.SerializedMethod> res = new ArrayList<>();
		METHODS_BY_CLASS.forEach((clazz, methods) ->
				res.addAll(methods)
		);

		return res;
	}

	public static Generator.SerializedMethod getRandomMethod(RandomSource rng) {
		List<Generator.SerializedMethod> serializedMethods = getAllSerializedMethods();
		return serializedMethods.get(rng.nextInt(serializedMethods.size() - 1));
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
