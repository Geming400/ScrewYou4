package fr.geming400.screwyou4.generator;

import fr.geming400.screwyou4.ScrewYou4;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

class GeneratorEntrypoint {
    private GeneratorEntrypoint() {}

    static void main(String[] args) {
        if (args.length == 2) {
            try {
                Path rootPackagePath = Path.of(args[0]);
                Path resourcePath = Path.of(args[1]);
                Path mixinPath = rootPackagePath.resolve("mixin");
                File foundMethodsFile = rootPackagePath.resolve("FoundMethods.java").toFile();
                ScrewYou4.LOGGER.info("Root package is {}", rootPackagePath);
                ScrewYou4.LOGGER.info("Mixin folder is {}", mixinPath);
                ScrewYou4.LOGGER.info("Resource folder is {}", resourcePath);
                ScrewYou4.LOGGER.info("FoundMethods.java location is {}", foundMethodsFile.getPath());

                if (Files.exists(mixinPath)) {
                    ScrewYou4.LOGGER.info("Cleaning mixin folders");
                    FileUtils.cleanDirectory(mixinPath.toFile());
                    if (!FileUtils.isEmptyDirectory(mixinPath.toFile())) {
                        ScrewYou4.LOGGER.warn("Failed to clean mixin directory ! Will delete its content in an alternative way");

                        ScrewYou4.LOGGER.info("Deleting mixin folder");
                        FileUtils.deleteDirectory(mixinPath.toFile());

                        ScrewYou4.LOGGER.info("Recreating mixin folder");
                        FileUtils.createParentDirectories(mixinPath.toFile());

                        if (!FileUtils.isEmptyDirectory(mixinPath.toFile())) {
                            ScrewYou4.LOGGER.error("Mixin folder is still not empty after trying 2nd method ! Exiting");
                            throw new RuntimeException("Failed to clean directory %s after 2 tries".formatted(mixinPath));
                        }
                    }

                    ScrewYou4.LOGGER.info("Bootstrapping minecraft");
                    SharedConstants.tryDetectVersion();
                    Bootstrap.bootStrap();

                    new Generator(mixinPath, resourcePath, foundMethodsFile).generate();
                } else {
                    ScrewYou4.LOGGER.error("Path {} doesn't exist !", mixinPath.toAbsolutePath());
                }
            } catch (InvalidPathException e) {
                ScrewYou4.LOGGER.error("The provided path {} is not a valid path !", args[0]);
            } catch (IOException e) {
                ScrewYou4.LOGGER.error("Got an error while trying to do an io operation", e);
                throw new RuntimeException(e);
            }
        } else {
            ScrewYou4.LOGGER.error("You are required to add 2 path arguments: the root package folder (ex: 'fr/geming400/screwyou4') and the resource folder");
        }
    }
}
