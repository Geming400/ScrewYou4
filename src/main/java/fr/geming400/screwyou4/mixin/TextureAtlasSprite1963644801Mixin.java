package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureAtlasSprite.class)
public class TextureAtlasSprite1963644801Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_828184330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828184330L))
            info.setReturnValue(")cn?0E|g9)\"s?");
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lcom/mojang/blaze3d/vertex/VertexConsumer;)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void wrap_1329096288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329096288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_2001919540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2001919540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/client/renderer/texture/SpriteContents;", cancellable = true)
    private void contents_2078654816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2078654816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getU1()F", cancellable = true)
    private void getU1_2001904164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001904164L))
            info.setReturnValue(3.101824E8F);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_2001907047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001907047L))
            info.setReturnValue(588847272);
    }

    @Inject(at = @At("HEAD"), method = "getU(F)F", cancellable = true)
    private void getU__1120191462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120191462L))
            info.setReturnValue(3.101824E8F);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_2001907047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001907047L))
            info.setReturnValue(588847272);
    }

    @Inject(at = @At("HEAD"), method = "getV(F)F", cancellable = true)
    private void getV__1120191462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120191462L))
            info.setReturnValue(3.101824E8F);
    }

    @Inject(at = @At("HEAD"), method = "createAnimationState(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;I)Lnet/minecraft/client/renderer/texture/SpriteContents$AnimationState;", cancellable = true)
    private void createAnimationState__1034612526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034612526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadFirstFrame(Lcom/mojang/blaze3d/textures/GpuTexture;I)V", cancellable = true)
    private void uploadFirstFrame__371324583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-371324583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "uploadSpriteUbo(Ljava/nio/ByteBuffer;IIIII)V", cancellable = true)
    private void uploadSpriteUbo_945447174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945447174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated_2001923384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001923384L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getV1()F", cancellable = true)
    private void getV1_2001904164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001904164L))
            info.setReturnValue(3.101824E8F);
    }

    @Inject(at = @At("HEAD"), method = "transparency()Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void transparency__1974325018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974325018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasLocation__479421752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479421752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getV0()F", cancellable = true)
    private void getV0_2001904164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001904164L))
            info.setReturnValue(3.101824E8F);
    }

    @Inject(at = @At("HEAD"), method = "getU0()F", cancellable = true)
    private void getU0_2001904164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001904164L))
            info.setReturnValue(3.101824E8F);
    }


}
