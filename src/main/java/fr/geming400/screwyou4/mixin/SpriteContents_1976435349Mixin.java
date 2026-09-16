package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteContents.class)
public class SpriteContents_1976435349Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name_618174822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618174822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1548108919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548108919L))
            info.setReturnValue("0Q\u44A88v\uB5A3r<3X?Z9");
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__138140081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-138140081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_336287348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336287348L))
            info.setReturnValue(-1125078260);
    }

    @Inject(at = @At("HEAD"), method = "transparency()Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void transparency_1450610001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450610001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_891086771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891086771L))
            info.setReturnValue(504982698);
    }

    @Inject(at = @At("HEAD"), method = "isTransparent(III)Z", cancellable = true)
    private void isTransparent__506626196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506626196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "uploadFirstFrame(Lcom/mojang/blaze3d/textures/GpuTexture;I)V", cancellable = true)
    private void uploadFirstFrame_404519274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(404519274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUniqueFrames()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void getUniqueFrames__1492268360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492268360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeTransparency(FFFF)Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void computeTransparency_1223852520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223852520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "increaseMipLevel(I)V", cancellable = true)
    private void increaseMipLevel__1094613454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1094613454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAnimationState(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;I)Lnet/minecraft/client/renderer/texture/SpriteContents$AnimationState;", cancellable = true)
    private void createAnimationState_13621244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13621244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated__2049780866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049780866L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAdditionalMetadata(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/util/Optional;", cancellable = true)
    private void getAdditionalMetadata_946089148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946089148L))
            info.setReturnValue(null);
    }


}
