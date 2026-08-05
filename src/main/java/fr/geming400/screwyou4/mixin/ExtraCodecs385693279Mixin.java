package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.class)
public class ExtraCodecs385693279Mixin {
        @Inject(at = @At("HEAD"), method = "converter(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void converter__1730949753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730949753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relaiveNormalizedSubPathCodec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void relaiveNormalizedSubPathCodec__570396579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570396579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalAlwaysPresentFieldOf(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/Object;Z)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void optionalAlwaysPresentFieldOf_988799637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988799637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalAlwaysPresentFieldOf(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/Object;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void optionalAlwaysPresentFieldOf__113818661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-113818661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pathCodec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void pathCodec__490757436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490757436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "legacyEnum(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void legacyEnum__2106444693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106444693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatRange(FF)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void floatRange_579353694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579353694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intRange(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void intRange__1521136501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521136501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longRange(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void longRange__1482070050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482070050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLifecycle(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void overrideLifecycle_1213052852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213052852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLifecycle(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void overrideLifecycle_1679931166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679931166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compactListCodec(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void compactListCodec__1296979196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296979196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compactListCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void compactListCodec__1788206805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788206805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temporalCodec(Ljava/time/format/DateTimeFormatter;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void temporalCodec_546208238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546208238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyMap_370174514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370174514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatchOptionalValue(Ljava/lang/String;Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void dispatchOptionalValue__2126665193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126665193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyList(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyList_873944500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873944500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalEmptyMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void optionalEmptyMap__1426346427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426346427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeLimitedMap(Lcom/mojang/serialization/Codec;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void sizeLimitedMap__475482392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475482392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElsePartial(Ljava/lang/Object;)Lcom/mojang/serialization/Codec$ResultFunction;", cancellable = true)
    private static void orElsePartial__1744886783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744886783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guardedPathCodec(Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void guardedPathCodec__619678549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619678549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intervalCodec(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void intervalCodec__993155802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993155802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveContext(Ljava/util/function/Function;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void retrieveContext_1426618190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426618190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureHomogenous(Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void ensureHomogenous__13729256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13729256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asOptionalLong(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void asOptionalLong_1254887792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254887792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyHolderSet(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyHolderSet__1076853012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076853012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "catchDecoderException(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void catchDecoderException__731088964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-731088964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orCompressed(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void orCompressed__442268593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442268593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orCompressed(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void orCompressed_1670466323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670466323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idResolverCodec(Ljava/util/function/ToIntFunction;Ljava/util/function/IntFunction;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void idResolverCodec_1675330344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675330344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idResolverCodec(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void idResolverCodec__1781809461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781809461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strictUnboundedMap(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lnet/minecraft/util/ExtraCodecs$StrictUnboundedMapCodec;", cancellable = true)
    private static void strictUnboundedMap__714835821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714835821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "object2BooleanMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void object2BooleanMap__1677836483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677836483L))
            info.setReturnValue(null);
    }


}
