package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.LazyEnum.class)
public class LazyEnum431840121Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__476786147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476786147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1202263646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202263646L))
            info.setReturnValue("y(\uBECC7ard38aX R)#Qx,/R/`^,)\u4AC9cYmBP_yjC\u306B%/`/qrggWi:Kj|.N0b0");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/function/Supplier;", cancellable = true)
    private void values__117399592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117399592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_989192212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989192212L))
            info.setReturnValue(1817953200);
    }

    @Inject(at = @At("HEAD"), method = "validateValue()Ljava/util/function/Function;", cancellable = true)
    private void validateValue_1062039699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062039699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_1046496838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1046496838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1372869419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372869419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier_788740392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788740392L))
            info.setReturnValue(null);
    }


}
