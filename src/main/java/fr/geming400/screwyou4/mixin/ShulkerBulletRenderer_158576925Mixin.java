package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ShulkerBulletRenderer.class)
public class ShulkerBulletRenderer_158576925Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__918915896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-918915896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__999682271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-999682271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__403644883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-403644883L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/ShulkerBullet;Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;F)V", cancellable = true)
    private void extractRenderState__1625081001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1625081001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ShulkerBulletRenderState;", cancellable = true)
    private void createRenderState_626056742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626056742L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ShulkerBulletRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_411747903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411747903L))
            info.setReturnValue(null);
    }


}
