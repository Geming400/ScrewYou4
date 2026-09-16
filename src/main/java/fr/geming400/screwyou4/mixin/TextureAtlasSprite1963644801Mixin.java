package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureAtlasSprite.class)
public class TextureAtlasSprite1963644801Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1560899466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560899466L))
            info.setReturnValue("]{68\uB610]_'_\uB964M`9\uB953@<$<Y\"i\uB2C7-\uD446>F.o\u862B\uB893`}\u214F!c\u2D39da/\uB270Hx23iED\u64D5\uC1A6+\u550A9g");
    }

    @Inject(at = @At("HEAD"), method = "wrap(Lcom/mojang/blaze3d/vertex/VertexConsumer;)Lcom/mojang/blaze3d/vertex/VertexConsumer;", cancellable = true)
    private void wrap_1321150634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321150634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__150930628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-150930628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/client/renderer/texture/SpriteContents;", cancellable = true)
    private void contents__1013700614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013700614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getU1()F", cancellable = true)
    private void getU1_905341202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905341202L))
            info.setReturnValue(4.123474E8F);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY__1427885180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427885180L))
            info.setReturnValue(-374766394);
    }

    @Inject(at = @At("HEAD"), method = "getU(F)F", cancellable = true)
    private void getU_675384473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675384473L))
            info.setReturnValue(4.133492E8F);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX__1456514331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456514331L))
            info.setReturnValue(-226898839);
    }

    @Inject(at = @At("HEAD"), method = "uploadFirstFrame(Lcom/mojang/blaze3d/textures/GpuTexture;I)V", cancellable = true)
    private void uploadFirstFrame_391728727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(391728727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAnimationState(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;I)Lnet/minecraft/client/renderer/texture/SpriteContents$AnimationState;", cancellable = true)
    private void createAnimationState_830697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uploadSpriteUbo(Ljava/nio/ByteBuffer;IIIII)V", cancellable = true)
    private void uploadSpriteUbo_1548769290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548769290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAnimated()Z", cancellable = true)
    private void isAnimated__2062571413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062571413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "transparency()Lcom/mojang/blaze3d/platform/Transparency;", cancellable = true)
    private void transparency_1437819454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437819454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getU0()F", cancellable = true)
    private void getU0_876712051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876712051L))
            info.setReturnValue(4.133492E8F);
    }

    @Inject(at = @At("HEAD"), method = "getV(F)F", cancellable = true)
    private void getV_1562888154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562888154L))
            info.setReturnValue(4.133492E8F);
    }

    @Inject(at = @At("HEAD"), method = "getV1()F", cancellable = true)
    private void getV1_1792844883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792844883L))
            info.setReturnValue(4.133492E8F);
    }

    @Inject(at = @At("HEAD"), method = "getV0()F", cancellable = true)
    private void getV0_1764215732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764215732L))
            info.setReturnValue(4.133492E8F);
    }

    @Inject(at = @At("HEAD"), method = "atlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasLocation_1820805160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820805160L))
            info.setReturnValue(null);
    }


}
