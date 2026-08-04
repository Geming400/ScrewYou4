package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.InclusiveRange.class)
public class InclusiveRange_1653793785Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1255661253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255661253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_518333313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518333313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1692056526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692056526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/util/InclusiveRange;", cancellable = true)
    private void map_358005882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358005882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/util/InclusiveRange;)Z", cancellable = true)
    private void contains_59168892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59168892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void create__117351711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117351711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()Ljava/lang/Comparable;", cancellable = true)
    private void minInclusive__381660776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381660776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()Ljava/lang/Comparable;", cancellable = true)
    private void maxInclusive__381660776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381660776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_2137471759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137471759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1093116339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093116339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValueInRange(Ljava/lang/Comparable;)Z", cancellable = true)
    private void isValueInRange_402673296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402673296L))
            info.setReturnValue(null);
    }


}
