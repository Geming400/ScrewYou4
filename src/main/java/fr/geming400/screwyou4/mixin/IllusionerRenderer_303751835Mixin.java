package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.IllusionerRenderer.class)
public class IllusionerRenderer_303751835Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__230421701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-230421701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__773740986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-773740986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_765270365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765270365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__30902133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30902133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2018700627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018700627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__258469973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-258469973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/Illusioner;Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;F)V", cancellable = true)
    private void extractRenderState_338317331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(338317331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1366721653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1366721653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/AbstractIllager;Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;F)V", cancellable = true)
    private void extractRenderState__1603598217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1603598217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;", cancellable = true)
    private void createRenderState_1164223208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164223208L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.IllusionerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_556922813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556922813L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
