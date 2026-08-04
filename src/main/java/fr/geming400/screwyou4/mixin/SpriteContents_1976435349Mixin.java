package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteContents.class)
public class SpriteContents_1976435349Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name__466631205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466631205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_840974877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840974877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_2014710087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2014710087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_2014697594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014697594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated_2014713931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014713931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeTransparency(FFFF)Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void computeTransparency__704070023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704070023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadFirstFrame(Lcom/mojang/blaze3d/textures/GpuTexture;I)V", cancellable = true)
    private void uploadFirstFrame__358534036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-358534036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAnimationState(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;I)Lnet/minecraft/client/renderer/texture/SpriteContents$AnimationState;", cancellable = true)
    private void createAnimationState__1021821979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021821979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUniqueFrames()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void getUniqueFrames__1388040853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388040853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTransparent(III)Z", cancellable = true)
    private void isTransparent_1196346788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196346788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "increaseMipLevel(I)V", cancellable = true)
    private void increaseMipLevel__1104614976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1104614976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transparency()Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void transparency__1961534471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961534471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_2014697594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014697594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdditionalMetadata(Lnet/minecraft/server/packs/metadata/MetadataSectionType;)Ljava/util/Optional;", cancellable = true)
    private void getAdditionalMetadata_359483816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(359483816L))
            info.setReturnValue(null);
    }


}
