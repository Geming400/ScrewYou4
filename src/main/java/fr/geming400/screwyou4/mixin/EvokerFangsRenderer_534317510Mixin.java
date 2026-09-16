package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EvokerFangsRenderer.class)
public class EvokerFangsRenderer_534317510Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__543175311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-543175311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1604322899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1604322899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_787488488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787488488L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;", cancellable = true)
    private void createRenderState__2062179738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062179738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/EvokerFangs;Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;F)V", cancellable = true)
    private void extractRenderState_923814482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(923814482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__27904298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-27904298L))
            info.cancel();
    }


}
