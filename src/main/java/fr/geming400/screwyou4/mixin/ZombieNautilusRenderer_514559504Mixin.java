package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieNautilusRenderer.class)
public class ZombieNautilusRenderer_514559504Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__562933317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562933317L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_976078034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(976078034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_273764043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273764043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1062437211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062437211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1807892958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807892958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__47662304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47662304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilus;Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;F)V", cancellable = true)
    private void extractRenderState_1080003471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1080003471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1155913984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1155913984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;", cancellable = true)
    private void createRenderState_1945539746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945539746L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.NautilusRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_767730482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767730482L))
            info.setReturnValue(null);
    }


}
