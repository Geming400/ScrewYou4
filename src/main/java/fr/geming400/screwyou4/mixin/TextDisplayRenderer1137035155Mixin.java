package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DisplayRenderer.TextDisplayRenderer.class)
public class TextDisplayRenderer1137035155Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_59542335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59542335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display;Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__324276937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-324276937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_574813348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(574813348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display$TextDisplay;Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_135780691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(135780691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_1926070983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926070983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_768776308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768776308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TextDisplayEntityRenderState;", cancellable = true)
    private void createRenderState_1477510119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477510119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1390206134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390206134L))
            info.setReturnValue(null);
    }


}
