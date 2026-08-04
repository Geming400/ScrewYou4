package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.TargetInput.class)
public class TargetInput_704873854Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2090386112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090386112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__430586122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430586122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_743136595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743136595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void targetId__1738192700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738192700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_743152436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743152436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName__430586618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430586618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useDepthBuffer()Z", cancellable = true)
    private void useDepthBuffer_743152436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743152436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/Set;", cancellable = true)
    private void referencedTargets__1124161633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124161633L))
            info.setReturnValue(null);
    }


}
