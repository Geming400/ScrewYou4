package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.ColoredRectangleRenderState.class)
public class ColoredRectangleRenderState1594923760Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1314531277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314531277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_459463785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459463785L))
            info.setReturnValue("\"g.L-Ax'6@_탒lk|1%@[:N>N%_nὪSRJOBE쌇f`u桷F\"8uA䋸A1=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1633186502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186502L))
            info.setReturnValue(-2069424204);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1525018232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525018232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1514534965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514534965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "col2()I", cancellable = true)
    private void col2_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "col1()I", cancellable = true)
    private void col1_1633186006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633186006L))
            info.setReturnValue(-1866276784);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1525018232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525018232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices__1576987624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576987624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup__2109326105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109326105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1702635324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702635324L))
            info.setReturnValue(null);
    }


}
