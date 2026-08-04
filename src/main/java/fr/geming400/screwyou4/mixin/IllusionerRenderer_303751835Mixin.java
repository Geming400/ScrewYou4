package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.IllusionerRenderer.class)
public class IllusionerRenderer_303751835Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1163629010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1163629010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1424974045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1424974045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__443264187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-443264187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1988578829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988578829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__893439663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893439663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/AbstractIllager;Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;F)V", cancellable = true)
    private void extractRenderState_1537539729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1537539729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/Illusioner;Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;F)V", cancellable = true)
    private void extractRenderState__507575123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-507575123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_530870853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530870853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1323616037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1323616037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllusionerRenderState;", cancellable = true)
    private void createRenderState_2066408489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066408489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__284884610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284884610L))
            info.setReturnValue(null);
    }


}
