package fr.geming400.screwyou4.generator;

import com.google.common.base.Ascii;
import com.google.gson.*;
import com.ibm.icu.impl.ClassLoaderUtil;
import fr.geming400.screwyou4.ScrewYou4;
import fr.geming400.screwyou4.Utils;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import jdk.jfr.Event;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.commons.text.StringEscapeUtils;
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
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Generator {
    private static final boolean TEST_MODE = false;
    private static final int TEST_MODE_MAX_ITER = 25;

    private static final ClassLoader CLASS_LOADER = ClassLoaderUtil.getClassLoader(Generator.class);

    private static final String MOD_PACKAGE = "fr.geming400.screwyou4";
    private static final String[] PACKAGES_TO_MIXIN = {
            "net.minecraft"
    };

    private final Path mixinFolder;
    private final Path resourceFolder;
    private final Map<String, List<SerializedMethod>> foundMethods = new HashMap<>();

    Generator(Path mixinFolder, Path resourceFolder) {
        this.mixinFolder = mixinFolder;
        this.resourceFolder = resourceFolder;
    }

    private String injectMethod(Method method) {
        LineArrayList lines = new LineArrayList();

        CallbackInfoType callbackInfoType = CallbackInfoType.get(method);

        // We need to do this because mixins like private functions
        String modifierString = Modifier.isStatic(method.getModifiers())
                ? " static"
                : "";

        lines.addLine("    @Inject(at = @At(\"HEAD\"), method = \"%s\", cancellable = true)".formatted(Utils.getMixinSignature(method)));
        lines.addLine("    private%s void %s_%s(%s info) {".formatted(modifierString, method.getName(), Utils.getSafeUniqueMethodID(method), callbackInfoType.getObjectClassName()));
        lines.addLine("        if (!ScrewYou4.isMethodAlive(%sL))".formatted(Utils.getUniqueMethodID(method)));
        lines.addLine("            %s;".formatted(callbackInfoType.getCancelCall("info", getReplacedReturnVal(method))));
//        lines.addLine("        } else {");
//        lines.addLine("            ");
//        lines.addLine("        }");
        lines.addLine("    }");
        lines.addLine();

        return lines.joinLines();
    }

    @Nullable
    private List<String> getMixinContent(Class<?> clazz) throws IOException, URISyntaxException {
        if (!canMixinClass(clazz))
            return null;

        StringBuilder mixinContent = new StringBuilder();
        for (Method method : clazz.getDeclaredMethods()) {
            if (canMixinMethod(method)) {
                this.foundMethods.get(clazz.getName())
                        .add(new SerializedMethod(Utils.getMixinSignature(method), method.getDeclaringClass().getTypeName(), Utils.getUniqueMethodID(method)));

                mixinContent.append(this.injectMethod(method));
            }
        }

        if (Arrays.stream(clazz.getDeclaredMethods()).noneMatch(Generator::canMixinMethod)) {
            return null;
        }

        URI templateMixinFile = Objects.requireNonNull(CLASS_LOADER.getResource("TemplateMixin.java")).toURI();
        String templateContent = Files.readString(Paths.get(templateMixinFile)).formatted(
                clazz.getTypeName().replace("$", "."),
                getMixinClassName(clazz),
                mixinContent.toString()
        );

        return LineArrayList.fromString(templateContent);
    }

    private boolean createFile(Class<?> clazz) {
        try {
            Path mixinFilePath = Paths.get(this.mixinFolder.toString(), getMixinFileName(clazz));

            if (Files.exists(mixinFilePath)) {
                ScrewYou4.LOGGER.warn("Mixin already exists for class {}. Ignoring.", clazz);
                return false;
            } else {
                this.foundMethods.put(clazz.getName(), new ArrayList<>());

                List<String> content = this.getMixinContent(clazz);
                if (content != null) {
                    Path file = Files.createFile(mixinFilePath);
                    Files.write(file, content);
                }

                return content != null;
            }
        } catch (Exception e) {
            //noinspection StringConcatenationArgumentToLogCall
            ScrewYou4.LOGGER.error("Got an error while trying to create file " + getMixinFileName(clazz), e);
            return false;
        }
    }

    public MixinConfig getMixinConfig() {
        try {
            Path path = this.resourceFolder.resolve("screw-you-4.mixins.json");
            String mixinConfig = Files.readString(path);

            return new MixinConfig(path, mixinConfig);
        } catch (IOException e) {
            ScrewYou4.LOGGER.error("Got an error while trying to parse mixin config", e);
            throw new RuntimeException(e);
        }
    }

    public void generate() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        ScrewYou4.LOGGER.info("Finding classes...");
        Set<Class<?>> mcClasses = getAllMinecraftClasses(true);
        ScrewYou4.LOGGER.info("Found {} classes", mcClasses.size());

        AtomicInteger mixinedClassesCount = new AtomicInteger();
        JsonArray registeredMixins = new JsonArray();
        mcClasses.forEach(clazz -> {
            if (this.createFile(clazz)) {
                mixinedClassesCount.addAndGet(1);
                registeredMixins.add(getMixinClassName(clazz));
            }
        });

        ScrewYou4.LOGGER.info("Finished creating all mixins ! Now adding them to the mixin config + taking a snapshot");

        // Mixin config adder
        MixinConfig mixinConfig = this.getMixinConfig();
        JsonObject mixinJsonConfig = mixinConfig.asJson();

        mixinJsonConfig.add("mixins", registeredMixins);

        try {
            mixinConfig.write(mixinJsonConfig);
        } catch (IOException e) {
            ScrewYou4.LOGGER.error("Got an error while trying to write new mixin config", e);
            throw new RuntimeException(e);
        }

        try {
            // Snapshot thingy idk
            Path foundClassesFiles = this.resourceFolder.resolve("foundMethods.json");

            Files.writeString(foundClassesFiles, new Gson().toJson(this.foundMethods));
        } catch (IOException e) {
            ScrewYou4.LOGGER.error("Caught an error while trying to read foundMethods.json file");
            throw new RuntimeException(e);
        }

        stopWatch.stop();
        ScrewYou4.LOGGER.info("Finished process in {} seconds !", stopWatch.getDuration().getSeconds());

        AtomicLong mixinedMethodsCount = new AtomicLong();
        this.foundMethods.forEach((clazz, methods) ->
                mixinedMethodsCount.addAndGet(methods.size()));

        ScrewYou4.LOGGER.info("Mixined {} classes, {} methods, with a {}% mixin rate on all mc classess", mixinedClassesCount, mixinedMethodsCount, ((double) mixinedClassesCount.get() / mcClasses.size()) * 100);
    }

    public static Set<Class<?>> getAllMinecraftClasses(boolean checkForMixinability) {
        ClassGraph classGraph = new ClassGraph();
        classGraph.acceptPackages(PACKAGES_TO_MIXIN);

        Set<Class<?>> res = new HashSet<>();

        int addedClassesCount = 0;
        try (ScanResult scanResult = classGraph.scan()) {
            for (ClassInfo classInfo : scanResult.getAllClasses()) {
                Class<?> clazz = classInfo.loadClass();
                if (checkForMixinability && canMixinClass(clazz)) {
                   res.add(clazz);

                   if (TEST_MODE) {
                       if (addedClassesCount > TEST_MODE_MAX_ITER) {
                           break;
                       } else {
                           addedClassesCount++;
                       }
                   }
                } else if (!checkForMixinability) {
                    res.add(clazz);
                }
            }
        }

        return res;
    }

    private static String getMixinClassName(Class<?> clazz) {
        return clazz.getSimpleName() + Utils.getSafeUniqueClassID(clazz) + "Mixin";
    }

    private static String getMixinFileName(Class<?> clazz) {
        return getMixinClassName(clazz) + ".java";
    }

    private static boolean canMixinClass(Class<?> clazz) {
        int modifiers = clazz.getModifiers();

        return !clazz.isHidden()
                && !clazz.isLocalClass()
                && !Modifier.isAbstract(modifiers)
                && Modifier.isPublic(modifiers)
                && !Utils.isPrivateOrHasPrivateEnclosingClass(clazz)
                && !Event.class.isAssignableFrom(clazz);
    }

    private static boolean canMixinMethod(Method method) {
//        boolean hasPrivateType = !Modifier.isPublic(method.getModifiers());
//        for (Class<?> parameter : method.getParameterTypes()) {
//            if (hasPrivateType)
//                break;
//
//            hasPrivateType = !Modifier.isPublic(method.getModifiers());
//        }

        return !Utils.isLambda(method) && Modifier.isPublic(method.getModifiers());
    }

    private static String getReplacedReturnVal(Method method) {
        long methodID = Utils.getUniqueMethodID(method);
        Random rng = new Random(methodID);
        Class<?> returnType = method.getReturnType();

        if (returnType.isPrimitive()) {
            if (returnType == byte.class) {
                byte[] byteArray = new byte[5];
                rng.nextBytes(byteArray);

                return Byte.toString(byteArray[rng.nextInt(byteArray.length)]);
            } else if (returnType == char.class) {
                return "(char) " + rng.nextInt(Character.MAX_VALUE);
            } else if (returnType == short.class) {
                return "(short) " + rng.nextInt(Short.MAX_VALUE);
            } else if (returnType == int.class) {
                return String.valueOf(rng.nextInt() + LocalTime.now().getNano());
            } else if (returnType == long.class) {
                return (rng.nextLong() + LocalTime.now().getNano()) + "L";
            } else if (returnType == float.class) {
                return (rng.nextFloat() + LocalTime.now().getNano()) + "F";
            } else if (returnType == double.class) {
                return (rng.nextDouble() + LocalTime.now().getNano()) + "D";
            } else if (returnType == boolean.class) {
                return String.valueOf(rng.nextBoolean());
            }
        } else if (returnType == String.class) {
            char[] characters = new char[rng.nextInt(100)];
            for (int i = 0; i < characters.length; i++) {
                int upperBound;
                if (rng.nextFloat() > 0.85) {
                    upperBound = Character.MAX_VALUE;
                } else {
                    upperBound = Ascii.MAX - 1;
                }

                characters[i] = (char) rng.nextInt(32, upperBound);
            }

            String res = "\"%s\""
                    .formatted(StringEscapeUtils.escapeJava(String.copyValueOf(characters)
                            .replaceAll("\\p{C}", "")
                            .replaceAll("\\\\[^\"]", "")
                    ));

            // Rare case when the string finishes with '\"'
            if (res.endsWith("\\\""))
                res += "\"";

            return res;
        } else {
            if (returnType.isEnum()) {
                //noinspection unchecked
                Class<Enum<?>> enumReturnType = (Class<Enum<?>>) returnType;

                Enum<?>[] enumValues = enumReturnType.getEnumConstants();

                Enum<?> chosenEnumValue = enumValues[rng.nextInt(enumValues.length)];
                return enumReturnType.getTypeName().replace("$", ".") + "." + chosenEnumValue.name();
            }

            if (Utils.hasDefaultAccessibleConstructor(returnType)) {
                if (rng.nextFloat() > 0.3)
                    return "new %s()".formatted(returnType.getTypeName());
            }
        }

        return "null";
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

        public String getObjectClassName() {
            return this.hasReturnType
                    ? this.clazz.getSimpleName() + "<Object>"
                    : this.clazz.getSimpleName();
        }

        public String getClassName(Method method) {
            Class<?> returnType = method.getReturnType();

            String genericType = returnType.getTypeName().replace("$", ".");

            if (Utils.hasDefaultAccessibleConstructor(method.getReturnType())) {
                genericType = "Object";
            } else {
                // Remapping them to their boxed values
                if (returnType == byte.class) {
                    genericType = Byte.class.getTypeName();
                } else if (returnType == char.class) {
                    genericType = Character.class.getTypeName();
                } else if (returnType == short.class) {
                    genericType = Short.class.getTypeName();
                } else if (returnType == int.class) {
                    genericType = Integer.class.getTypeName();
                } else if (returnType == long.class) {
                    genericType = Long.class.getTypeName();
                } else if (returnType == float.class) {
                    genericType = Float.class.getTypeName();
                } else if (returnType == double.class) {
                    genericType = Double.class.getTypeName();
                } else if (returnType == boolean.class) {
                    genericType = Boolean.class.getTypeName();
                } else if (returnType == String.class) {
                    genericType = String.class.getTypeName();
                }
            }

            return this.hasReturnType
                    ? this.clazz.getSimpleName() + "<%s>".formatted(genericType)
                    : this.clazz.getSimpleName();
        }

        public static CallbackInfoType get(Method method) {
            return Utils.isVoid(method.getReturnType())
                    ? NO_RETURN_TYPE
                    : HAS_RETURN_TYPE;
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

    public record SerializedMethod(
            String signature,
            String className,
            long uniqueID
    ) {}
}
