package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ConstantInt.class)
public class ConstantInt_1420025875Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_1458288120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458288120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1489429163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489429163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_284565403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284565403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1458288616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458288616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/util/valueproviders/ConstantInt;", cancellable = true)
    private static void of_381557953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381557953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1139087698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139087698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__287001704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287001704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1458288120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458288120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1458288120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458288120L))
            info.setReturnValue(null);
    }


}
