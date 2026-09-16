package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TropicalFishRenderer.class)
public class TropicalFishRenderer_906939085Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_940017439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940017439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__170553736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-170553736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1368457615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368457615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1160110063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160110063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;", cancellable = true)
    private void createRenderState__1018803288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018803288L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TropicalFishRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1415513377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415513377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_468644975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468644975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_344717277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344717277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fish/TropicalFish;Lnet/minecraft/client/renderer/entity/state/TropicalFishRenderState;F)V", cancellable = true)
    private void extractRenderState_2099438209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2099438209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__763534403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-763534403L))
            info.cancel();
    }


}
