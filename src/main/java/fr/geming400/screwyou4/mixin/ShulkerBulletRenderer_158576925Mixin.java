package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ShulkerBulletRenderer.class)
public class ShulkerBulletRenderer_158576925Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1308803920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1308803920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_190452281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(190452281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_385695943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385695943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/ShulkerBullet;Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;F)V", cancellable = true)
    private void extractRenderState__2077943299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2077943299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;", cancellable = true)
    private void createRenderState__277575355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277575355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__430059520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430059520L))
            info.setReturnValue(null);
    }


}
