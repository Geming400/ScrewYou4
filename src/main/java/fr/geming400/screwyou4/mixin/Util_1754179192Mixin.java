package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Util.class)
public class Util_1754179192Mixin {
        @Inject(at = @At("HEAD"), method = "name(Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Ljava/util/function/Supplier;", cancellable = true)
    private static void name__1168010299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168010299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "name(Ljava/lang/Runnable;Ljava/util/function/Supplier;)Ljava/lang/Runnable;", cancellable = true)
    private static void name__473841045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473841045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "join(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void join_308350503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308350503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "join([Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void join__335479175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335479175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefix(Ljava/lang/String;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", cancellable = true)
    private static void prefix__95656264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95656264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "make(Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void make_544026952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544026952L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "make(Ljava/lang/Object;Ljava/util/function/Consumer;)Ljava/lang/Object;", cancellable = true)
    private static void make__2710514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2710514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toMap()Ljava/util/stream/Collector;", cancellable = true)
    private static void toMap_217426720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217426720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffle(Ljava/util/List;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void shuffle__49992342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-49992342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sequence(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequence_746514428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746514428L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getRandom([ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private static void getRandom__628011744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628011744L))
            info.setReturnValue(857258101);
    }

    @Inject(at = @At("HEAD"), method = "getRandom([Ljava/lang/Object;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private static void getRandom__1830434678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830434678L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private static void getRandom__1666085374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666085374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__778020775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778020775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__839158230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839158230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf([Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1345685963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345685963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1287841480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287841480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_2049577335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049577335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1717618790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717618790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf()Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf__1632240747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632240747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf(Ljava/util/List;)Ljava/util/function/Predicate;", cancellable = true)
    private static void allOf_1190734468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190734468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_1960201666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960201666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_26267091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26267091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf()Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_1625354848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625354848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__938472975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938472975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/List;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__1490343089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1490343089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf([Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_611219872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611219872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf_808108725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808108725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf(Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void anyOf__731866588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731866588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMillis()J", cancellable = true)
    private static void getMillis__1296717478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296717478L))
            info.setReturnValue(-2588980557464004457L);
    }

    @Inject(at = @At("HEAD"), method = "getPropertyName(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void getPropertyName_135023044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135023044L))
            info.setReturnValue("p\u3D20]7tl&$\u7408OL^Z0!a_:@");
    }

    @Inject(at = @At("HEAD"), method = "makeEnumMap(Ljava/lang/Class;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void makeEnumMap_2054257695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054257695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegisteredName(Lnet/minecraft/core/Registry;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void getRegisteredName_1256085243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256085243L))
            info.setReturnValue("nc-f\uB403R@\u840Dw_\"R,D{K_#E\u08AFgW&FY#tAp`x 4!SB-8fh\\");
    }

    @Inject(at = @At("HEAD"), method = "logAndPauseIfInIde(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private static void logAndPauseIfInIde_747645736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747645736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logAndPauseIfInIde(Ljava/lang/String;)V", cancellable = true)
    private static void logAndPauseIfInIde__19902553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-19902553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyAndPut(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", cancellable = true)
    private static void copyAndPut__1558586153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558586153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/List;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize__1066254181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1066254181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/stream/LongStream;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize__606678538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606678538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedSize(Ljava/util/stream/IntStream;I)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void fixedSize__830612419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830612419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseAndValidateUntrustedUri(Ljava/lang/String;)Ljava/net/URI;", cancellable = true)
    private static void parseAndValidateUntrustedUri__1823049330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823049330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toMutableList()Ljava/util/stream/Collector;", cancellable = true)
    private static void toMutableList_741943720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741943720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoize(Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void memoize__1589051770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589051770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoize(Ljava/util/function/BiFunction;)Ljava/util/function/BiFunction;", cancellable = true)
    private static void memoize_1131653560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131653560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFilenameFormattedDateTime()Ljava/lang/String;", cancellable = true)
    private static void getFilenameFormattedDateTime_963195378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963195378L))
            info.setReturnValue("i=CR1qpCX^G#H\u3BAF%7G\uA576S$ yD1`rWFD)R_.4zuVFG6\u7E60U\"jd1J>%_\"&CdM=2r\u2507QWB\uC201\uAF6A!N\u7580KU?$sOx#}4f\uC11F`D\"6ZQ+cZ$\u92CAMc%.s");
    }

    @Inject(at = @At("HEAD"), method = "mapValuesLazy(Ljava/util/Map;Lcom/google/common/base/Function;)Ljava/util/Map;", cancellable = true)
    private static void mapValuesLazy__1174298457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174298457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSafe(Ljava/util/List;Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private static void getRandomSafe_1895536520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895536520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeSource()Lnet/minecraft/util/TimeSource$NanoTimeSource;", cancellable = true)
    private static void timeSource_413664902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413664902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "growByHalf(II)I", cancellable = true)
    private static void growByHalf__1976097096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976097096L))
            info.setReturnValue(-1802596056);
    }

    @Inject(at = @At("HEAD"), method = "isAarch64()Z", cancellable = true)
    private static void isAarch64_1717508955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717508955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "runNamed(Ljava/lang/Runnable;Ljava/lang/String;)V", cancellable = true)
    private static void runNamed__446932740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-446932740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ifElse(Ljava/util/Optional;Ljava/util/function/Consumer;Ljava/lang/Runnable;)Ljava/util/Optional;", cancellable = true)
    private static void ifElse_1126677614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126677614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd__1395851375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395851375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/util/List;[Ljava/lang/Object;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd_2104270410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104270410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndAdd(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", cancellable = true)
    private static void copyAndAdd_1404697041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404697041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ioPool()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void ioPool__1494998448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494998448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapValues(Ljava/util/Map;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void mapValues__1095412250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095412250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPause(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void setPause_1352097152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1352097152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeReplaceOrMoveFile(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Z", cancellable = true)
    private static void safeReplaceOrMoveFile_2062907690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062907690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blockUntilDone(Ljava/util/function/Function;Ljava/util/function/Predicate;)Ljava/lang/Object;", cancellable = true)
    private static void blockUntilDone_1729452992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729452992L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "blockUntilDone(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void blockUntilDone_2128407281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128407281L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "describeError(Ljava/lang/Throwable;)Ljava/lang/String;", cancellable = true)
    private static void describeError__815279408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815279408L))
            info.setReturnValue("\u3089qq[J\uB42B0]\u5C6E4jy7\u7ABBoOVZ\u98ECOjx:usBPniu-");
    }

    @Inject(at = @At("HEAD"), method = "makeDescriptionId(Ljava/lang/String;Lnet/minecraft/resources/Identifier;)Ljava/lang/String;", cancellable = true)
    private static void makeDescriptionId_1026105103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026105103L))
            info.setReturnValue("QTb\u30233;\u944E?5,cJd\u2BB6}lce_iX]({Q('u1O\u8D1D2q");
    }

    @Inject(at = @At("HEAD"), method = "setTimeSource(Lnet/minecraft/util/TimeSource$NanoTimeSource;)V", cancellable = true)
    private static void setTimeSource__859633432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-859633432L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shutdownTimeSource()V", cancellable = true)
    private static void shutdownTimeSource_702946468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702946468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEpochMillis()J", cancellable = true)
    private static void getEpochMillis_2125305277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125305277L))
            info.setReturnValue(-3299680940027080312L);
    }

    @Inject(at = @At("HEAD"), method = "readTypedOrThrow(Lcom/mojang/datafixers/types/Type;Lcom/mojang/serialization/Dynamic;Z)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readTypedOrThrow__1073959377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073959377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readTypedOrThrow(Lcom/mojang/datafixers/types/Type;Lcom/mojang/serialization/Dynamic;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readTypedOrThrow_1429755287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429755287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backgroundExecutor()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void backgroundExecutor__1272216527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272216527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonCriticalIoPool()Lnet/minecraft/TracingExecutor;", cancellable = true)
    private static void nonCriticalIoPool__2037938652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037938652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shutdownExecutors()V", cancellable = true)
    private static void shutdownExecutors__1130049512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1130049512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "throwAsRuntime(Ljava/lang/Throwable;)V", cancellable = true)
    private static void throwAsRuntime__428739955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-428739955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maxAllowedExecutorThreads()I", cancellable = true)
    private static void maxAllowedExecutorThreads__1220925053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220925053L))
            info.setReturnValue(24619178);
    }

    @Inject(at = @At("HEAD"), method = "localizedDateFormatter(Ljava/time/format/FormatStyle;)Ljava/time/format/DateTimeFormatter;", cancellable = true)
    private static void localizedDateFormatter__661598054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661598054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIndexLookup(Ljava/util/List;)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void createIndexLookup_1255336999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255336999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sanitizeName(Ljava/lang/String;Lnet/minecraft/CharPredicate;)Ljava/lang/String;", cancellable = true)
    private static void sanitizeName_407096420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(407096420L))
            info.setReturnValue("I:\u7D11oo\" p\u7643Esd?UlT2l6E9#a-\u5A74=");
    }

    @Inject(at = @At("HEAD"), method = "copyBetweenDirs(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V", cancellable = true)
    private static void copyBetweenDirs__164480538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-164480538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSymmetrical(IILjava/util/List;)Z", cancellable = true)
    private static void isSymmetrical__1197948449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197948449L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "findNextInIterable(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void findNextInIterable__946625624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946625624L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "safeReplaceFile(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;)V", cancellable = true)
    private static void safeReplaceFile__1354477156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1354477156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offsetByCodepoints(Ljava/lang/String;II)I", cancellable = true)
    private static void offsetByCodepoints_1518811717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518811717L))
            info.setReturnValue(-13142892);
    }

    @Inject(at = @At("HEAD"), method = "sequenceFailFast(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequenceFailFast__1504674634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504674634L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "allOfEnumExcept(Ljava/lang/Enum;)Ljava/util/Set;", cancellable = true)
    private static void allOfEnumExcept__882030855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882030855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startTimerHackThread()V", cancellable = true)
    private static void startTimerHackThread_716521972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(716521972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "singleKeyCache(Ljava/util/function/Function;)Lnet/minecraft/util/SingleKeyCache;", cancellable = true)
    private static void singleKeyCache_1236844258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236844258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy(Lit/unimi/dsi/fastutil/objects/ObjectArrayList;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void shuffledCopy__1135931570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135931570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffledCopy([Ljava/lang/Object;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void shuffledCopy_1732344070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732344070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fetchChoiceType(Lcom/mojang/datafixers/DSL$TypeReference;Ljava/lang/String;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void fetchChoiceType__222999721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222999721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPreviousInIterable(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void findPreviousInIterable__176182228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176182228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIndexIdentityLookup(Ljava/util/List;)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void createIndexIdentityLookup_130046469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130046469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeAndReadTypedOrThrow(Lcom/mojang/datafixers/Typed;Lcom/mojang/datafixers/types/Type;Ljava/util/function/UnaryOperator;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void writeAndReadTypedOrThrow_702360628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702360628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpThreadInfo()[Ljava/lang/management/ThreadInfo;", cancellable = true)
    private static void dumpThreadInfo__284805386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284805386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShuffledList(Ljava/util/stream/Stream;Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void toShuffledList_109600555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109600555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShuffledList(Ljava/util/stream/IntStream;Lnet/minecraft/util/RandomSource;)Lit/unimi/dsi/fastutil/ints/IntArrayList;", cancellable = true)
    private static void toShuffledList__501314614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501314614L))
            info.setReturnValue(new it.unimi.dsi.fastutil.ints.IntArrayList());
    }

    @Inject(at = @At("HEAD"), method = "sequenceFailFastAndCancel(Ljava/util/List;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void sequenceFailFastAndCancel__1267487567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267487567L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "safeMoveFile(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Z", cancellable = true)
    private static void safeMoveFile__2087555673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087555673L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlatform()Lnet/minecraft/util/Util$OS;", cancellable = true)
    private static void getPlatform__715044295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715044295L))
            info.setReturnValue(net.minecraft.util.Util.OS.SOLARIS);
    }

    @Inject(at = @At("HEAD"), method = "pauseInIde(Ljava/lang/Throwable;)Ljava/lang/Throwable;", cancellable = true)
    private static void pauseInIde__813825055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813825055L))
            info.setReturnValue(new java.lang.Throwable());
    }

    @Inject(at = @At("HEAD"), method = "getNanos()J", cancellable = true)
    private static void getNanos__714724307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714724307L))
            info.setReturnValue(-7607830135143196163L);
    }


}
