package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieNautilusRenderer.class)
public class ZombieNautilusRenderer_514559504Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__952821341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952821341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__232456518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-232456518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__746472269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-746472269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__74076941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-74076941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;", cancellable = true)
    private void createRenderState_422457891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422457891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_741678522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(741678522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilus;Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;F)V", cancellable = true)
    private void extractRenderState__73825879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-73825879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1534423706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1534423706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1777771160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777771160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_967685025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967685025L))
            info.setReturnValue(null);
    }


}
