package fr.geming400.screwyou4.generator;

import com.google.gson.*;
import com.ibm.icu.impl.ClassLoaderUtil;
import fr.geming400.screwyou4.ScrewYou4;
import fr.geming400.screwyou4.Utils;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import org.apache.commons.lang3.time.StopWatch;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Generator {
    private static final boolean TEST_MODE = false;

    private static final String MINECRAFT_PACKAGE = "net.minecraft";
    private static final String MOD_PACKAGE = "fr.geming400.screwyou4";

    private final Path mixinFolder;

    Generator(Path mixinFolder) {
        this.mixinFolder = mixinFolder;
    }

    private String injectMethod(Method method) {
        LineArrayList lines = new LineArrayList();

        CallbackInfoType callbackInfoType = getCallbackInfoType(method);

        // We need to do this because mixins like private functions
        String modifierString = Modifier.toString(method.getModifiers())
                .replace("public", "private")
                .replace("protected", "private");

        lines.addLine("    @Inject(at = @At(\"HEAD\"), method = \"%s\", cancellable = true)".formatted(Utils.getMixinSignature(method)));
        lines.addLine("    %s void %s(%s info) {".formatted(modifierString, method.getName(), callbackInfoType.getClassName(method)));
        lines.addLine("        if (!ScrewYou4.isMethodAlive(%sL))".formatted(Utils.getUniqueMethodID(method)));
        lines.addLine("            %s;".formatted(callbackInfoType.getCancelCall("info", "null")));
//        lines.addLine("        } else {");
//        lines.addLine("            ");
//        lines.addLine("        }");
        lines.addLine("    }");
        lines.addLine();

        return lines.joinLines();
    }

    private List<String> getMixinContent(Class<?> clazz) throws IOException, URISyntaxException {
        if (!isClassMixinable(clazz))
            return List.of();

        ClassLoader classLoader = ClassLoaderUtil.getClassLoader(Generator.class);

        StringBuilder mixinContent = new StringBuilder();
        for (Method method : clazz.getDeclaredMethods())
            mixinContent.append(this.injectMethod(method));

        URI templateMixinFile = Objects.requireNonNull(classLoader.getResource("TemplateMixin.java")).toURI();
        String templateContent = Files.readString(Paths.get(templateMixinFile)).formatted(
                clazz.getName(),
                getMixinClassName(clazz),
                mixinContent.toString()
        );

        return LineArrayList.fromString(templateContent);
    }

    private Path createFile(Class<?> clazz) {
        try {
            Path mixinFilePath = Paths.get(this.mixinFolder.toString(), getMixinFileName(clazz));
            Path file = Files.createFile(mixinFilePath);
            Files.write(file, this.getMixinContent(clazz));

            return file;
        } catch (Exception e) {
            //noinspection StringConcatenationArgumentToLogCall
            ScrewYou4.LOGGER.error("Got an error while trying to create file " + getMixinFileName(clazz), e);
            throw new RuntimeException(e);
        }
    }

    public void generate() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ScrewYou4.LOGGER.info("Finding classes...");
        Set<Class<?>> mcClasses = getAllMinecraftClasses(true);
        ScrewYou4.LOGGER.info("Found {} classes", mcClasses.size());

        JsonArray registeredMixins = new JsonArray();
        mcClasses.forEach(clazz -> {
            this.createFile(clazz);
            registeredMixins.add(clazz.getSimpleName());
        });

        ScrewYou4.LOGGER.info("Finished creating all mixins ! Now adding them to the config");

        MixinConfig mixinConfig = getMixinConfig();
        JsonObject mixinJsonConfig = mixinConfig.asJson();

        mixinJsonConfig.add("mixins", registeredMixins);

        try {
            mixinConfig.write(mixinJsonConfig);
        } catch (IOException e) {
            ScrewYou4.LOGGER.error("Got an error while trying to write new mixin config", e);
            throw new RuntimeException(e);
        }

        stopWatch.stop();
        ScrewYou4.LOGGER.info("Finished process in {} !", stopWatch.getDuration());
    }

    public static MixinConfig getMixinConfig() {
        ClassLoader classLoader = ClassLoaderUtil.getClassLoader(Generator.class);

        try {
            URI mixinConfigPath = Objects.requireNonNull(classLoader.getResource("screw-you-4.mixins.json")).toURI();
            Path path = Paths.get(mixinConfigPath);
            String mixinConfig = Files.readString(path);

            return new MixinConfig(path, mixinConfig);
        } catch (IOException | URISyntaxException e) {
            ScrewYou4.LOGGER.error("Got an error while trying to parse mixin config", e);
            throw new RuntimeException(e);
        }
    }

    public static Set<Class<?>> getAllMinecraftClasses(boolean checkForMixinability) {
        ClassGraph classGraph = new ClassGraph()
                .acceptPackages(MINECRAFT_PACKAGE);

        Set<Class<?>> res = new HashSet<>();

        try (ScanResult scanResult = classGraph.scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {
                Class<?> clazz = classInfo.loadClass();
                if (checkForMixinability && isClassMixinable(clazz)) {
                   res.add(clazz);

                   if (TEST_MODE)
                       break;
                } else if (!checkForMixinability) {
                    res.add(clazz);
                }
            }
        }

        return res;
    }

    private static CallbackInfoType getCallbackInfoType(Method method) {
        return Utils.isVoid(method.getReturnType())
                ? CallbackInfoType.NO_RETURN_TYPE
                : CallbackInfoType.HAS_RETURN_TYPE;
    }

    private static String getMixinClassName(Class<?> clazz) {
        return clazz.getSimpleName() + "Mixin";
    }

    private static String getMixinFileName(Class<?> clazz) {
        return getMixinClassName(clazz) + ".java";
    }

    private static boolean isClassMixinable(Class<?> clazz) {
        int modifiers = clazz.getModifiers();
        return !clazz.isHidden() && !clazz.isLocalClass() && !Modifier.isAbstract(modifiers);
    }

    private enum CallbackInfoType {
        NO_RETURN_TYPE(false, CallbackInfo.class),
        HAS_RETURN_TYPE(true, CallbackInfoReturnable.class);

        final boolean hasReturnType;
        final Class<? extends CallbackInfo> clazz;

        CallbackInfoType(boolean hasReturnType, Class<? extends CallbackInfo> clazz) {
            this.hasReturnType = hasReturnType;
            this.clazz = clazz;
        }

        public String getCancelCall(@NonNull String callbackInfoVar, @Nullable String toReturn) {
            Objects.requireNonNull(callbackInfoVar);

            return this.hasReturnType
                    ? "%s.setReturnValue(%s)".formatted(callbackInfoVar, Objects.requireNonNull(toReturn))
                    : "%s.cancel()".formatted(callbackInfoVar);
        }

        public String getClassName(Method method) {
            return this.hasReturnType
                    ? this.clazz.getSimpleName() + "<%s>".formatted(Utils.getSimpleNameWithPackage(method.getReturnType()))
                    : this.clazz.getSimpleName();
        }
    }

    public record MixinConfig(
            Path path,
            String content
    ) {
        public JsonObject asJson() {
            return (JsonObject) JsonParser.parseString(this.content);
        }

        public void write(String content) throws IOException {
            Files.writeString(this.path, content);
        }

        public void write(JsonElement jsonElement) throws IOException {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            this.write(gson.toJson(jsonElement));
        }
    }
}
