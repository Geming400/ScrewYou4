package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.SignRenderState.SignTransformations.class)
public class SignTransformations_1692086415Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1217368623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217368623L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_556626439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556626439L))
            info.setReturnValue("rm'E5)S#9W൰2bpi\"TW,d៳Ml2Q)z㬿]]dwঈ.5^*㾬q⽸濾c0.^%,<%䯮벫OW:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1730349156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730349156L))
            info.setReturnValue(-1776585548);
    }

    @Inject(at = @At("HEAD"), method = "frontText()Lcom/mojang/math/Transformation;", cancellable = true)
    private void frontText__1824896453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824896453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backText()Lcom/mojang/math/Transformation;", cancellable = true)
    private void backText__1824896453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824896453L))
            info.setReturnValue(null);
    }


}
