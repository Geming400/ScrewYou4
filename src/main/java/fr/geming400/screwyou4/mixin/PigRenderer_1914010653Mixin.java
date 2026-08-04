package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PigRenderer.class)
public class PigRenderer_1914010653Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1166994631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1166994631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_446629808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(446629808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/PigRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_127413113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127413113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__378320011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378320011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PigRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_373062311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373062311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1361092441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1361092441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2141129671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2141129671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/pig/Pig;Lnet/minecraft/client/renderer/entity/state/PigRenderState;F)V", cancellable = true)
    private void extractRenderState_1649763051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649763051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PigRenderState;", cancellable = true)
    private void createRenderState__771401019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771401019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1325374208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325374208L))
            info.setReturnValue(null);
    }


}
