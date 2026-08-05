package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.OversizedItemRenderState.class)
public class OversizedItemRenderState1112124989Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1797330048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797330048L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__23334986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23334986L))
            info.setReturnValue("^*<o?M8^>ZY)j\u765Dwl\uAFA7tl#;1G=\u17C6\u5C0D!AQ.ExU\u3204vWQN#S;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1150387731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150387731L))
            info.setReturnValue(783537847);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_1150384352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150384352L))
            info.setReturnValue(4.663671E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__2007817003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007817003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1150387235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150387235L))
            info.setReturnValue(962061336);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1150387235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150387235L))
            info.setReturnValue(962061336);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1150387235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150387235L))
            info.setReturnValue(962061336);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1150387235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150387235L))
            info.setReturnValue(962061336);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fc;", cancellable = true)
    private void pose_1031736194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031736194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__2007817003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007817003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiItemRenderState()Lnet/minecraft/client/renderer/state/gui/GuiItemRenderState;", cancellable = true)
    private void guiItemRenderState_186030320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186030320L))
            info.setReturnValue(null);
    }


}
