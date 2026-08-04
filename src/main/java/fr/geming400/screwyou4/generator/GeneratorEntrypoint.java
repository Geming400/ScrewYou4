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
        if (args.length == 1) {
            try {
                Path mixinPath = Path.of(args[0]);
                ScrewYou4.LOGGER.info("Mixin folder is {}", mixinPath);

                if (Files.exists(mixinPath)) {
                    ScrewYou4.LOGGER.info("Now starting generation of mixins !");
                    FileUtils.cleanDirectory(mixinPath.toFile());

                    new Generator(mixinPath).generate();
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
            ScrewYou4.LOGGER.error("You are required to add 1 path argument: the mixin folder");
        }
    }
}
