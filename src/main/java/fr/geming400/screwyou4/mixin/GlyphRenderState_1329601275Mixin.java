package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GlyphRenderState.class)
public class GlyphRenderState_1329601275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1579853763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579853763L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_194141299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194141299L))
            info.setReturnValue("E/hE-yIc}n*w,Pz\u3415tdl|zUWS3^)x?z;.rhx\u28A4o\uC887\uACB0$g18?#e\u642B/?Mp:G@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1367864016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367864016L))
            info.setReturnValue(-1907596507);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1790340718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790340718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_1920318705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920318705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1249212479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249212479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderable()Lnet/minecraft/client/gui/font/TextRenderable;", cancellable = true)
    private void renderable_1578189039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578189039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1967957810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967957810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices__1842310110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1842310110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1790340718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790340718L))
            info.setReturnValue(null);
    }


}
