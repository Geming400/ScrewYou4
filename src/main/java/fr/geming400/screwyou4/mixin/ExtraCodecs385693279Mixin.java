package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.class)
public class ExtraCodecs385693279Mixin {
        @Inject(at = @At("HEAD"), method = "converter(Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void converter_875397927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875397927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temporalCodec(Ljava/time/format/DateTimeFormatter;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void temporalCodec__1074163750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074163750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalAlwaysPresentFieldOf(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/Object;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void optionalAlwaysPresentFieldOf_1239569312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239569312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalAlwaysPresentFieldOf(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/Object;Z)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void optionalAlwaysPresentFieldOf__5846160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5846160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyList(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyList_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyMap_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intRange(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void intRange__880125827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880125827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatRange(FF)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void floatRange_869610717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869610717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compactListCodec(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void compactListCodec__694342833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694342833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compactListCodec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void compactListCodec_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "object2BooleanMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void object2BooleanMap_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dispatchOptionalValue(Ljava/lang/String;Ljava/lang/String;Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void dispatchOptionalValue__396694706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-396694706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orCompressed(Lcom/mojang/serialization/MapCodec;Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void orCompressed_858400659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858400659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orCompressed(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void orCompressed__694342833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694342833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLifecycle(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void overrideLifecycle__2023424202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023424202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideLifecycle(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void overrideLifecycle__1110400932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110400932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "catchDecoderException(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void catchDecoderException_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orElsePartial(Ljava/lang/Object;)Lcom/mojang/serialization/Codec$ResultFunction;", cancellable = true)
    private static void orElsePartial_1196719366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196719366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asOptionalLong(Lcom/mojang/serialization/MapCodec;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void asOptionalLong_1365659554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365659554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optionalEmptyMap(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void optionalEmptyMap_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intervalCodec(Lcom/mojang/serialization/Codec;Ljava/lang/String;Ljava/lang/String;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void intervalCodec_1473196375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473196375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guardedPathCodec(Ljava/nio/file/Path;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void guardedPathCodec_2040243806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040243806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeLimitedMap(Lcom/mojang/serialization/Codec;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void sizeLimitedMap_1609995595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609995595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strictUnboundedMap(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lnet/minecraft/util/ExtraCodecs$StrictUnboundedMapCodec;", cancellable = true)
    private static void strictUnboundedMap_259138002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259138002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idResolverCodec(Lcom/mojang/serialization/Codec;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void idResolverCodec__2023424202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023424202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "idResolverCodec(Ljava/util/function/ToIntFunction;Ljava/util/function/IntFunction;I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void idResolverCodec__854483171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854483171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyHolderSet(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void nonEmptyHolderSet_869371254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869371254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "legacyEnum(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void legacyEnum_779143061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779143061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "longRange(II)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void longRange__880125827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880125827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pathCodec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void pathCodec_779143061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779143061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureHomogenous(Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void ensureHomogenous_121105940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121105940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retrieveContext(Ljava/util/function/Function;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void retrieveContext_1442750203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442750203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relaiveNormalizedSubPathCodec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void relaiveNormalizedSubPathCodec_779143061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779143061L))
            info.setReturnValue(null);
    }


}
