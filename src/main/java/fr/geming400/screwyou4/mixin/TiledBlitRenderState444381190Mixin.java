package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.TiledBlitRenderState.class)
public class TiledBlitRenderState444381190Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1829893449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829893449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__691078785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691078785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_482643932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1_482640553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482640553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_1619406494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619406494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1_482640553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482640553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0_482640553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482640553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0_482640553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482640553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_1619406494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619406494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_1567437102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1567437102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_1035098621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035098621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tileWidth()I", cancellable = true)
    private void tileWidth_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tileHeight()I", cancellable = true)
    private void tileHeight_482643436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482643436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline_1441789402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441789402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2f;", cancellable = true)
    private void pose__1774980720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774980720L))
            info.setReturnValue(null);
    }


}
