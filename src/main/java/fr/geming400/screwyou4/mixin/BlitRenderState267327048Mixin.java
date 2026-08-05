package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.BlitRenderState.class)
public class BlitRenderState267327048Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1652839307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652839307L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__868132927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868132927L))
            info.setReturnValue("pZd\u9F0BHkw5]\uCF7513\u1138JHTQ(\u8C6B i>\"X..tC\u1DDB2_%\u323BVHqf2>\u314DUGl8<OU.K \u9F03+!+3l-:2\uD1888_7eOd\u4EF4l\uAC47&C$?\uAF42\u477D}$\uD746R*?hd(\u0620/kse");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_305589790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589790L))
            info.setReturnValue(-2071928768);
    }

    @Inject(at = @At("HEAD"), method = "v1()F", cancellable = true)
    private void v1_305586411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305586411L))
            info.setReturnValue(8.961556E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_1442352352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442352352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_305589294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589294L))
            info.setReturnValue(-1893405278);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_305589294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589294L))
            info.setReturnValue(-1893405278);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_305589294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589294L))
            info.setReturnValue(-1893405278);
    }

    @Inject(at = @At("HEAD"), method = "u1()F", cancellable = true)
    private void u1_305586411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305586411L))
            info.setReturnValue(8.961556E8F);
    }

    @Inject(at = @At("HEAD"), method = "v0()F", cancellable = true)
    private void v0_305586411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305586411L))
            info.setReturnValue(8.961556E8F);
    }

    @Inject(at = @At("HEAD"), method = "u0()F", cancellable = true)
    private void u0_305586411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305586411L))
            info.setReturnValue(8.961556E8F);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_305589294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589294L))
            info.setReturnValue(-1893405278);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_305589294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305589294L))
            info.setReturnValue(-1893405278);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_186938253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186938253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline_1264735260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264735260L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_858044479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858044479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_1442352352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442352352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_1390382960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1390382960L))
            info.cancel();
    }


}
