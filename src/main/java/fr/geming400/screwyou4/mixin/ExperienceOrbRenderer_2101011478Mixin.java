package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ExperienceOrbRenderer.class)
public class ExperienceOrbRenderer_2101011478Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1023518657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1023518657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1269499725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1269499725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__1940784840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940784840L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;", cancellable = true)
    private void createRenderState__1836776794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836776794L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ExperienceOrbRenderState());
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/ExperienceOrb;Lnet/minecraft/client/renderer/entity/state/ExperienceOrbRenderState;F)V", cancellable = true)
    private void extractRenderState__1635910090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1635910090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1538789670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1538789670L))
            info.cancel();
    }


}
