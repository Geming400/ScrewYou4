package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ExperienceOrbRenderer.class)
public class ExperienceOrbRenderer_2101011478Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_633630633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(633630633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__79365173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-79365173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1966836800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1966836800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/ExperienceOrb;Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;F)V", cancellable = true)
    private void extractRenderState__1791702192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1791702192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1512375033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512375033L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;", cancellable = true)
    private void createRenderState_1554558405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554558405L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ExperienceOrbRenderState());
    }


}
