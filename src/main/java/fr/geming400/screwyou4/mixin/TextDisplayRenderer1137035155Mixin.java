package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DisplayRenderer.TextDisplayRenderer.class)
public class TextDisplayRenderer1137035155Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__330345689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-330345689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner__1776172458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1776172458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_1775299497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1775299497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display$TextDisplay;Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__710111763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-710111763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1364154174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1364154174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display;Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1285483055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1285483055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;", cancellable = true)
    private void createRenderState__1004796026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004796026L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TextDisplayEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_548398711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548398711L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
