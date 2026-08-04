package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GuardianRenderer.class)
public class GuardianRenderer1629810792Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_162429948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162429948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__87175730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87175730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_882794771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(882794771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__662519871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662519871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_216918332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216918332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1645292301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1645292301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1856929811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856929811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Guardian;Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;F)V", cancellable = true)
    private void extractRenderState__1723804056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1723804056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_867219036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867219036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/monster/Guardian;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__1634847815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634847815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;", cancellable = true)
    private void createRenderState__864831494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-864831494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1041174348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041174348L))
            info.setReturnValue(null);
    }


}
