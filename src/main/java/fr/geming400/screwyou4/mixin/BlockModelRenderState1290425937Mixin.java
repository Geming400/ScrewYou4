package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelRenderState.class)
public class BlockModelRenderState1290425937Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_504598231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504598231L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1945424987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945424987L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submit_1201466485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201466485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupSpecialModel(Lnet/minecraft/client/renderer/special/SpecialModelRenderer;Lorg/joml/Matrix4fc;)V", cancellable = true)
    private void setupSpecialModel_2002368736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2002368736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitWithZOffset(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submitWithZOffset__1964774612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964774612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitOnlyOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submitOnlyOutline_1551045659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551045659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scratchRandomSource(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void scratchRandomSource_1097397232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097397232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void tintLayers__1760162747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760162747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupModel(Lorg/joml/Matrix4fc;Z)Ljava/util/List;", cancellable = true)
    private void setupModel_794924714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794924714L))
            info.setReturnValue(null);
    }


}
