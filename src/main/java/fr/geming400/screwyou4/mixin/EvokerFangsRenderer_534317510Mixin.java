package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EvokerFangsRenderer.class)
public class EvokerFangsRenderer_534317510Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__933063335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-933063335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1067061397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1067061397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_761436528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(761436528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/EvokerFangs;Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;F)V", cancellable = true)
    private void extractRenderState_1164405752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1164405752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;", cancellable = true)
    private void createRenderState_135760197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135760197L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EvokerFangsRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__54318935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54318935L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
