package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.TextureInput.class)
public class TextureInput94031596Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1479543855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479543855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1041428379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041428379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_132294338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132294338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_132293842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132293842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/client/renderer/texture/AbstractTexture;", cancellable = true)
    private void texture_851823367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851823367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture(Ljava/util/Map;)Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texture__123443713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123443713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_132293842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132293842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName__1041428875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041428875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_132310179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132310179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToPass(Lcom/mojang/blaze3d/framegraph/FramePass;Ljava/util/Map;)V", cancellable = true)
    private void addToPass_1421006974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421006974L))
            info.cancel();
    }


}
