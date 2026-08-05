package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ThrownItemRenderer.class)
public class ThrownItemRenderer_773903470Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1011622231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011622231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__693477375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-693477375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1001022488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1001022488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;F)V", cancellable = true)
    private void extractRenderState_1077922624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077922624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_185267025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185267025L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;", cancellable = true)
    private void createRenderState__1242692183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242692183L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ThrownItemRenderState());
    }


}
