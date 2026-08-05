package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Util.class)
public class Util_1754179192Mixin {
        @Inject(at = @At("HEAD"), method = "name(Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Ljava/util/function/Supplier;", cancellable = true)
    private static void name_1076983088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076983088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name(Ljava/lang/Runnable;Ljava/util/function/Supplier;)Ljava/lang/Runnable;", cancellable = true)
    private static void name_277133462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277133462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "join(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void join_1104318973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104318973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "join([Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void join__1462826653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462826653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefix(Ljava/lang/String;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", cancellable = true)
    private static void prefix_431532070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431532070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "make(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void make__2061708810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061708810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "make(Ljava/lang/Object;Ljava/util/function/Consumer;)Ljava/lang/Object;", cancellable = true)
    private static void make_2108470588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108470588L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toMap()Ljava/util/stream/Collector;", cancellable = true)
    private static void toMap__1763498433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763498433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffle(Ljava/util/List;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void shuffle_887716657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887716657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sequence(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequence_1673850811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673850811L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private static void getRandom__1976778789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976778789L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getRandom([ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private static void getRandom__1636093337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636093337L))
            info.setReturnValue(882493658);
    }

    @Inject(at = @At("HEAD"), method = "getRandom([Ljava/lang/Object;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private static void getRandom__2043438063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043438063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_698440560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698440560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1481808927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481808927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__2088900338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088900338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf()Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1104294461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104294461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__2084225326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084225326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf([Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__692290013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692290013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/List;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__161279700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161279700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__1988151551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988151551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/List;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__161279700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161279700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__692290013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692290013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_1481808927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481808927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf()Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_1104294461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104294461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__2088900338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088900338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_698440560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698440560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__1988151551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988151551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__2084225326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084225326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMillis()J", cancellable = true)
    private static void getMillis_1792442646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792442646L))
            info.setReturnValue(-912747235376837431L);
    }

    @Inject(at = @At("HEAD"), method = "getPropertyName(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void getPropertyName__1133803014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133803014L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "copyAndPut(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", cancellable = true)
    private static void copyAndPut_1619891466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619891466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/stream/LongStream;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize__989852373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989852373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/stream/IntStream;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize_542500456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542500456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/List;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize_834663238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834663238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoize(Ljava/util/function/BiFunction;)Ljava/util/function/BiFunction;", cancellable = true)
    private static void memoize_2127545950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127545950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoize(Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void memoize_1489591852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489591852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toMutableList()Ljava/util/stream/Collector;", cancellable = true)
    private static void toMutableList__1763498433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763498433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseAndValidateUntrustedUri(Ljava/lang/String;)Ljava/net/URI;", cancellable = true)
    private static void parseAndValidateUntrustedUri__411132730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411132730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAllowedExecutorThreads()I", cancellable = true)
    private static void maxAllowedExecutorThreads_1792441685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792441685L))
            info.setReturnValue(705545860);
    }

    @Inject(at = @At("HEAD"), method = "readTypedOrThrow(Lcom/mojang/datafixers/types/Type;Lcom/mojang/serialization/Dynamic;Z)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readTypedOrThrow__1051905600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051905600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readTypedOrThrow(Lcom/mojang/datafixers/types/Type;Lcom/mojang/serialization/Dynamic;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readTypedOrThrow_183540710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183540710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeDescriptionId(Ljava/lang/String;Lnet/minecraft/resources/Identifier;)Ljava/lang/String;", cancellable = true)
    private static void makeDescriptionId__432225882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432225882L))
            info.setReturnValue("9$Zx=MpWSS3^Hw]/>;L(]5g;줯fqt-8-ycTrpGna3)Xet✄O_A-?f(b/d送(_H픿%-4;aLⷑmIjUb㺝 ,'4pGle98矬SV]I묇(%Z,");
    }

    @Inject(at = @At("HEAD"), method = "getEpochMillis()J", cancellable = true)
    private static void getEpochMillis_1792442646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792442646L))
            info.setReturnValue(-912747235373833531L);
    }

    @Inject(at = @At("HEAD"), method = "shutdownExecutors()V", cancellable = true)
    private static void shutdownExecutors_1792454178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792454178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fetchChoiceType(Lcom/mojang/datafixers/DSL$TypeReference;Ljava/lang/String;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void fetchChoiceType_48930700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48930700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "throwAsRuntime(Ljava/lang/Throwable;)V", cancellable = true)
    private static void throwAsRuntime_1561409421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1561409421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nonCriticalIoPool()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void nonCriticalIoPool__1616419854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616419854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeReplaceOrMoveFile(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Z", cancellable = true)
    private static void safeReplaceOrMoveFile__1841208013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841208013L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTimeSource(Lnet/minecraft/util/TimeSource$NanoTimeSource;)V", cancellable = true)
    private static void setTimeSource_2024630386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024630386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSymmetrical(IILjava/util/List;)Z", cancellable = true)
    private static void isSymmetrical__843671817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-843671817L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "localizedDateFormatter(Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;", cancellable = true)
    private static void localizedDateFormatter__1848112039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848112039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpThreadInfo()[Ljava/lang/management/ThreadInfo;", cancellable = true)
    private static void dumpThreadInfo_1584709898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584709898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockUntilDone(Ljava/util/function/Function;Ljava/util/function/Predicate;)Ljava/lang/Object;", cancellable = true)
    private static void blockUntilDone__782507693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782507693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockUntilDone(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void blockUntilDone__1323322492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323322492L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "shutdownTimeSource()V", cancellable = true)
    private static void shutdownTimeSource_1792454178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792454178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "describeError(Ljava/lang/Throwable;)Ljava/lang/String;", cancellable = true)
    private static void describeError__387776275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387776275L))
            info.setReturnValue("'7>떊8;SK븡䥃,썑Rꭩ犅8쿰c:8vy}:9E荺:漸b5cLD赏耜^kPS&$^T8NY3웭r=[8KﱪN");
    }

    @Inject(at = @At("HEAD"), method = "backgroundExecutor()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void backgroundExecutor__1616419854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616419854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlatform()Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void getPlatform_1883474000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883474000L))
            info.setReturnValue(net.minecraft.util.Util.OS.WINDOWS);
    }

    @Inject(at = @At("HEAD"), method = "findNextInIterable(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void findNextInIterable_1994789893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994789893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeName(Ljava/lang/String;Lnet/minecraft/CharPredicate;)Ljava/lang/String;", cancellable = true)
    private static void sanitizeName_481749624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481749624L))
            info.setReturnValue("Ww!=^!c_+B嫱JK8!n龆g쬕1`9䅽wzc5&ztD&cU;V5=");
    }

    @Inject(at = @At("HEAD"), method = "safeReplaceFile(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V", cancellable = true)
    private static void safeReplaceFile_2052450751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052450751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toShuffledList(Ljava/util/stream/Stream;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void toShuffledList__1518363577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518363577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShuffledList(Ljava/util/stream/IntStream;Lnet/minecraft/util/RandomSource;)Lit/unimi/dsi/fastutil/ints/IntArrayList;", cancellable = true)
    private static void toShuffledList__2033891610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033891610L))
            info.setReturnValue(new it.unimi.dsi.fastutil.ints.IntArrayList());
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy(Lit/unimi/dsi/fastutil/objects/ObjectArrayList;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void shuffledCopy_1001676974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001676974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy([Ljava/lang/Object;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void shuffledCopy_1086364262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086364262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOfEnumExcept(Ljava/lang/Enum;)Ljava/util/Set;", cancellable = true)
    private static void allOfEnumExcept_1679878955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679878955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeAndReadTypedOrThrow(Lcom/mojang/datafixers/Typed;Lcom/mojang/datafixers/types/Type;Ljava/util/function/UnaryOperator;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void writeAndReadTypedOrThrow_844309677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844309677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sequenceFailFast(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequenceFailFast_1673850811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673850811L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "findPreviousInIterable(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void findPreviousInIterable_1994789893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994789893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleKeyCache(Ljava/util/function/Function;)Lnet/minecraft/util/SingleKeyCache;", cancellable = true)
    private static void singleKeyCache_1067749271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067749271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetByCodepoints(Ljava/lang/String;II)I", cancellable = true)
    private static void offsetByCodepoints_1948470783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948470783L))
            info.setReturnValue(152872353);
    }

    @Inject(at = @At("HEAD"), method = "createIndexLookup(Ljava/util/List;)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void createIndexLookup_776117719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776117719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeEnumMap(Ljava/lang/Class;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void makeEnumMap__313896628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313896628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIndexIdentityLookup(Ljava/util/List;)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void createIndexIdentityLookup_776117719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776117719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sequenceFailFastAndCancel(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequenceFailFastAndCancel_1673850811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673850811L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "startTimerHackThread()V", cancellable = true)
    private static void startTimerHackThread_1792454178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792454178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeMoveFile(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Z", cancellable = true)
    private static void safeMoveFile__499524595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499524595L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copyBetweenDirs(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V", cancellable = true)
    private static void copyBetweenDirs_2052450751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052450751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFilenameFormattedDateTime()Ljava/lang/String;", cancellable = true)
    private static void getFilenameFormattedDateTime_618718968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618718968L))
            info.setReturnValue("ol.頨ef耥鄦miJa=!➫ꂰ*QBDO㙦*|w_C?aG+%Wcm_cຣ.BeIYT#rcQK燜y&}G[匊̬t;E:K>;U");
    }

    @Inject(at = @At("HEAD"), method = "getNanos()J", cancellable = true)
    private static void getNanos_1792442646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792442646L))
            info.setReturnValue(-912747235373833531L);
    }

    @Inject(at = @At("HEAD"), method = "logAndPauseIfInIde(Ljava/lang/String;)V", cancellable = true)
    private static void logAndPauseIfInIde__1388426708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1388426708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logAndPauseIfInIde(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private static void logAndPauseIfInIde_805070275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805070275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRegisteredName(Lnet/minecraft/core/Registry;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void getRegisteredName_2047101502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047101502L))
            info.setReturnValue("r/W#'Ed$i-锺P⪫ᇆ9Q;#x,ap)9yg?IB6JF鋍Y,䬮4x>6}Fqm:YXSwuY>n.n*y");
    }

    @Inject(at = @At("HEAD"), method = "mapValuesLazy(Ljava/util/Map;Lcom/google/common/base/Function;)Ljava/util/Map;", cancellable = true)
    private static void mapValuesLazy_1626429465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626429465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSafe(Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomSafe__1425818706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425818706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pauseInIde(Ljava/lang/Throwable;)Ljava/lang/Throwable;", cancellable = true)
    private static void pauseInIde_1144772402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144772402L))
            info.setReturnValue(new java.lang.Throwable());
    }

    @Inject(at = @At("HEAD"), method = "ioPool()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void ioPool__1616419854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616419854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runNamed(Ljava/lang/Runnable;Ljava/lang/String;)V", cancellable = true)
    private static void runNamed_1426914602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1426914602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "growByHalf(II)I", cancellable = true)
    private static void growByHalf_758287477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758287477L))
            info.setReturnValue(642570140);
    }

    @Inject(at = @At("HEAD"), method = "timeSource()Lnet/minecraft/util/TimeSource$NanoTimeSource;", cancellable = true)
    private static void timeSource_746344254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746344254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAarch64()Z", cancellable = true)
    private static void isAarch64_1792458022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792458022L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mapValues(Ljava/util/Map;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void mapValues_1218562884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218562884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ifElse(Ljava/util/Optional;Ljava/util/function/Consumer;Ljava/lang/Runnable;)Ljava/util/Optional;", cancellable = true)
    private static void ifElse__1435895644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435895644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd__1673394103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673394103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd__241183758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241183758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd_1253235122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253235122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPause(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void setPause__1859771444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1859771444L))
            info.cancel();
    }


}
