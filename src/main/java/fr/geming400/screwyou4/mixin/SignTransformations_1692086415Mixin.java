package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.SignRenderState.SignTransformations.class)
public class SignTransformations_1692086415Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_783460146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783460146L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1832457357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832457357L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2045528791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045528791L))
            info.setReturnValue(29803745);
    }

    @Inject(at = @At("HEAD"), method = "backText()Lcom/mojang/math/Transformation;", cancellable = true)
    private void backText_479523567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479523567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frontText()Lcom/mojang/math/Transformation;", cancellable = true)
    private void frontText__1275600335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1275600335L))
            info.setReturnValue(null);
    }


}
