package fr.geming400.screwyou4.generator;

import fr.geming400.screwyou4.ScrewYou4;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

class GeneratorEntrypoint {
    private GeneratorEntrypoint() {}

    static void main(String[] args) {
        if (args.length == 2) {
            try {
                Path mixinPath = Path.of(args[0]);
                Path resourcePath = Path.of(args[1]);
                ScrewYou4.LOGGER.info("Mixin folder is {}", mixinPath);
                ScrewYou4.LOGGER.info("Resource folder is {}", resourcePath);

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

                    new Generator(mixinPath, resourcePath).generate();
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
            ScrewYou4.LOGGER.error("You are required to add 2 path arguments: the mixin folder and the resource folder");
        }
    }
}
