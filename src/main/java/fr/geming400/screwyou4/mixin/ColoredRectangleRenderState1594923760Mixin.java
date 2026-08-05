package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.ColoredRectangleRenderState.class)
public class ColoredRectangleRenderState1594923760Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_686297492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686297492L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1929620011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929620011L))
            info.setReturnValue("{\u4D13v\uA791]d=u=tf$Nq\uBEEB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2142691445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142691445L))
            info.setReturnValue(89628880);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__872008589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872008589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1__2132693571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132693571L))
            info.setReturnValue(-1431788770);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1__1245189890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245189890L))
            info.setReturnValue(1788517257);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_2133644574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133644574L))
            info.setReturnValue(-498919765);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0__1273819041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273819041L))
            info.setReturnValue(1773156828);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__929976545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-929976545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildVertices(Lcom/mojang/blaze3d/vertex/VertexConsumer;)V", cancellable = true)
    private void buildVertices_2095557809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095557809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1515654534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515654534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "col2()I", cancellable = true)
    private void col2_1759846756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759846756L))
            info.setReturnValue(1480849119);
    }

    @Inject(at = @At("HEAD"), method = "col1()I", cancellable = true)
    private void col1_1731217605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731217605L))
            info.setReturnValue(1293515865);
    }

    @Inject(at = @At("HEAD"), method = "textureSetup()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private void textureSetup_1954291337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954291337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pipeline()Lcom/mojang/blaze3d/pipeline/RenderPipeline;", cancellable = true)
    private void pipeline__307366042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307366042L))
            info.setReturnValue(null);
    }


}
