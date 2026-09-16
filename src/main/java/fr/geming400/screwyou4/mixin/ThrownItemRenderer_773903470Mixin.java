package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ThrownItemRenderer.class)
public class ThrownItemRenderer_773903470Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_182930113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(182930113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__303589351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-303589351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;", cancellable = true)
    private void createRenderState__2144877464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144877464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1027074448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027074448L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/ThrownItemRenderState;F)V", cancellable = true)
    private void extractRenderState_163202470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163202470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_211681662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(211681662L))
            info.cancel();
    }


}
