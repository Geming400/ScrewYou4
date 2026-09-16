package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.BlitRenderState.class)
public class BlitRenderState267327048Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__641299220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641299220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1037750573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037750573L))
            info.setReturnValue("T8d8a$PN_U$YbJq\u80AELOitneT\u830EM\uC963>X0\u7265+47GvN\u25AFzK'0$oUqRA+wz';x.t3-%_YG?Rc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_824679139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824679139L))
            info.setReturnValue(2057099819);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1__940333232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-940333232L))
            info.setReturnValue(7.762718E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_2095361995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095361995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_834677013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834677013L))
            info.setReturnValue(-331390254);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_1503978155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503978155L))
            info.setReturnValue(1787846707);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1722180694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722180694L))
            info.setReturnValue(1628281046);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1__1827836913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827836913L))
            info.setReturnValue(7.762718E8F);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0__968962383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968962383L))
            info.setReturnValue(7.762718E8F);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0__1856466064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856466064L))
            info.setReturnValue(7.762718E8F);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_806047862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806047862L))
            info.setReturnValue(1098787040);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1693551543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693551543L))
            info.setReturnValue(-1819150359);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_188057822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188057822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_767961097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(767961097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_2037394039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037394039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_626694625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626694625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__1634962754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634962754L))
            info.setReturnValue(null);
    }


}
