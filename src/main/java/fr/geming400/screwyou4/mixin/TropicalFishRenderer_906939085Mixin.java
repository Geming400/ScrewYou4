package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TropicalFishRenderer.class)
public class TropicalFishRenderer_906939085Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__560441760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-560441760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__268517113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-268517113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_159923063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(159923063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;", cancellable = true)
    private void createRenderState__1602142039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602142039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_318302640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318302640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1926803287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926803287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1134058103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1134058103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/TropicalFish;Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;F)V", cancellable = true)
    private void extractRenderState_1253545755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1253545755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_498766773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498766773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1385391579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385391579L))
            info.setReturnValue(null);
    }


}
