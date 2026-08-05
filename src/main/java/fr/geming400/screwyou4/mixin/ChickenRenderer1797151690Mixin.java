package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ChickenRenderer.class)
public class ChickenRenderer1797151690Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1050135669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1050135669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_329770846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(329770846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ChickenRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_2139997792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2139997792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__495178973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495178973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ChickenRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1654263246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654263246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2024270709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024270709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1477951403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477951403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/chicken/Chicken;Lnet/minecraft/client/renderer/entity/state/ChickenRenderState;F)V", cancellable = true)
    private void extractRenderState__1655435708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655435708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1208515246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208515246L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ChickenRenderState;", cancellable = true)
    private void createRenderState_422092762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422092762L))
            info.setReturnValue(null);
    }


}
