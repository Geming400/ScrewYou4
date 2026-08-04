package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BatRenderer.class)
public class BatRenderer_724561494Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BatRenderState;", cancellable = true)
    private void createRenderState__1519706299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519706299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_135925049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135925049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1744425696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1744425696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_951680512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(951680512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/ambient/Bat;Lnet/minecraft/client/renderer/entity/state/BatRenderState;F)V", cancellable = true)
    private void extractRenderState_674208039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(674208039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1275087609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275087609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1567769170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567769170L))
            info.setReturnValue(null);
    }


}
