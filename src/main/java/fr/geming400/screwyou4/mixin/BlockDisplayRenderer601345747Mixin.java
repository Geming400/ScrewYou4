package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DisplayRenderer.BlockDisplayRenderer.class)
public class BlockDisplayRenderer601345747Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__866035097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-866035097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/BlockDisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner__24640291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-24640291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_1983105430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1983105430L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display;Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1821172463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1821172463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display$BlockDisplay;Lnet/minecraft/client/renderer/entity/state/BlockDisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1292629987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1292629987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_828464766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(828464766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BlockDisplayEntityRenderState;", cancellable = true)
    private void createRenderState__1116748660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116748660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_12709303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12709303L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
