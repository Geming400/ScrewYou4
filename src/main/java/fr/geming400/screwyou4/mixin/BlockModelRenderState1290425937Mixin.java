package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelRenderState.class)
public class BlockModelRenderState1290425937Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1328700676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1328700676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1328704520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328704520L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submit__2037134243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037134243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tintLayers()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void tintLayers__2074050264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074050264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupModel(Lorg/joml/Matrix4fc;Z)Ljava/util/List;", cancellable = true)
    private void setupModel_1544027094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544027094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupSpecialModel(Lnet/minecraft/client/renderer/special/SpecialModelRenderer;Lorg/joml/Matrix4fc;)V", cancellable = true)
    private void setupSpecialModel__666908723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-666908723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitOnlyOutline(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submitOnlyOutline__2037134243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037134243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitWithZOffset(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V", cancellable = true)
    private void submitWithZOffset__2037134243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037134243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scratchRandomSource(J)Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void scratchRandomSource__1544414440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544414440L))
            info.setReturnValue(null);
    }


}
