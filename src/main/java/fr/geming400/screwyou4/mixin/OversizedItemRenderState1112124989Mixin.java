package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.OversizedItemRenderState.class)
public class OversizedItemRenderState1112124989Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_203498721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203498721L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1882548514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882548514L))
            info.setReturnValue("QOcPfi4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1669477080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669477080L))
            info.setReturnValue(286039707);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale__1311593002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311593002L))
            info.setReturnValue(4150900.0F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1354807360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1354807360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1679474954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679474954L))
            info.setReturnValue(-1094468195);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1__1727988661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727988661L))
            info.setReturnValue(1770071169);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1650845803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650845803L))
            info.setReturnValue(414441712);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0__1756617812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756617812L))
            info.setReturnValue(74435967);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1032855763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032855763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1412775316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412775316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiItemRenderState()Lnet/minecraft/client/renderer/state/gui/GuiItemRenderState;", cancellable = true)
    private void guiItemRenderState__740979267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740979267L))
            info.setReturnValue(null);
    }


}
