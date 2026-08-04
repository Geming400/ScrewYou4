package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.LazyEnum.class)
public class LazyEnum431840121Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1817352380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817352380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__703619854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703619854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/function/Supplier;", cancellable = true)
    private void values__37318470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37318470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_470102863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(470102863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue()Ljava/util/function/Function;", cancellable = true)
    private void validateValue__1494332626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494332626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__578016757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578016757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier__1584395741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584395741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_39874495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39874495L))
            info.setReturnValue(null);
    }


}
