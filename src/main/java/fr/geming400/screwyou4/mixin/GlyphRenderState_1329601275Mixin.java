package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GlyphRenderState.class)
public class GlyphRenderState_1329601275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_420975006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420975006L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2100024799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100024799L))
            info.setReturnValue("K{.YWk,\uB607o\u1F81`#E5D7'3n\u0B2CX0Y%KxY\u5A3C+=KtJw]R/1M`No\u37C5j!(\u7D7ATTW$lo9\uC432\u7DE87X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1886953365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886953365L))
            info.setReturnValue(886824680);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1137331075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137331075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1195299031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195299031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_1830235323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1830235323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1250332048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250332048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_1688968851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688968851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__572688528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572688528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderable()Lnet/minecraft/client/gui/font/TextRenderable;", cancellable = true)
    private void renderable__1286438689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286438689L))
            info.setReturnValue(null);
    }


}
