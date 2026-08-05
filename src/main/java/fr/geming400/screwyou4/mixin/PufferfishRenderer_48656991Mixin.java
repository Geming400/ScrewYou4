package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PufferfishRenderer.class)
public class PufferfishRenderer_48656991Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_276248875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(276248875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1418723854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418723854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__698359031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-698359031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2051293623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051293623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1506591833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506591833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_275776009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(275776009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/Pufferfish;Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;F)V", cancellable = true)
    private void extractRenderState__1820617811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1820617811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1068521193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068521193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PufferfishRenderState;", cancellable = true)
    private void createRenderState__289380823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289380823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__539979454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539979454L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
