package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PufferfishRenderer.class)
public class PufferfishRenderer_48656991Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1470801219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1470801219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1028835830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1028835830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_510175521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(510175521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1925837933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925837933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2021171825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021171825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__513564817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-513564817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/Pufferfish;Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;F)V", cancellable = true)
    private void extractRenderState_1081115155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1081115155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1621816497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1621816497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;", cancellable = true)
    private void createRenderState__1191566104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191566104L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.PufferfishRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_301827969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301827969L))
            info.setReturnValue(null);
    }


}
