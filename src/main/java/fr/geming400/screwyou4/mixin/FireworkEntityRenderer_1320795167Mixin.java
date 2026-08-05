package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FireworkEntityRenderer.class)
public class FireworkEntityRenderer_1320795167Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_243302346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(243302346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1906383090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1906383090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/FireworkRocketEntity;Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;F)V", cancellable = true)
    private void extractRenderState_1624665854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1624665854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_758573359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758573359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1573966145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573966145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;", cancellable = true)
    private void createRenderState__1120830055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120830055L))
            info.setReturnValue(null);
    }


}
