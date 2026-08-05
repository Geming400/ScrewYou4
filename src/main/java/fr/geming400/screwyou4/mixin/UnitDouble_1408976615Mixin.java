package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.UnitDouble.class)
public class UnitDouble_1408976615Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/OptionInstance$UnitDouble;", cancellable = true)
    private static void values_61344260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61344260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/OptionInstance$UnitDouble;", cancellable = true)
    private static void valueOf__244216949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244216949L))
            info.setReturnValue(net.minecraft.client.OptionInstance.UnitDouble.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_2023762291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023762291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Double;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__1994853307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994853307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Double;)D", cancellable = true)
    private void toSliderValue__1410347236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410347236L))
            info.setReturnValue(3.855394004329202E8D);
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Object;)D", cancellable = true)
    private void toSliderValue__1069673426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069673426L))
            info.setReturnValue(3.8553940078535587E8D);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Double;", cancellable = true)
    private void fromSliderValue__934406027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934406027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Object;", cancellable = true)
    private void fromSliderValue__1617720825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617720825L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__395732926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395732926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xmap(Ljava/util/function/DoubleFunction;Ljava/util/function/ToDoubleFunction;)Lnet/minecraft/client/OptionInstance$SliderableValueSet;", cancellable = true)
    private void xmap__845264803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845264803L))
            info.setReturnValue(null);
    }


}
