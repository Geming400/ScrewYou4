package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.UnitDouble.class)
public class UnitDouble_1408976615Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/OptionInstance$UnitDouble;", cancellable = true)
    private static void values_2032055782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032055782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/OptionInstance$UnitDouble;", cancellable = true)
    private static void valueOf_1681245795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681245795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_399248696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399248696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Double;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_675600394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675600394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xmap(Ljava/util/function/DoubleFunction;Ljava/util/function/ToDoubleFunction;)Lnet/minecraft/client/OptionInstance$SliderableValueSet;", cancellable = true)
    private void xmap__1120147335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120147335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1017010988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017010988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Object;", cancellable = true)
    private void fromSliderValue_288268237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288268237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Double;", cancellable = true)
    private void fromSliderValue_971583035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971583035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Double;)D", cancellable = true)
    private void toSliderValue__1841044911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841044911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Object;)D", cancellable = true)
    private void toSliderValue__1500371101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500371101L))
            info.setReturnValue(null);
    }


}
