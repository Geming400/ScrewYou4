package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FishingHookRenderer.class)
public class FishingHookRenderer_630814878Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__416820197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-416820197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__836565967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-836565967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/projectile/FishingHook;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__1308536627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308536627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__131776879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131776879L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_857933896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857933896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/FishingHook;Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;F)V", cancellable = true)
    private void extractRenderState_1306334848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306334848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_42178433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42178433L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FishingHookRenderState;", cancellable = true)
    private void createRenderState__837110459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837110459L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.FishingHookRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getHoldingArm(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void getHoldingArm_633995876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633995876L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.LEFT);
    }


}
