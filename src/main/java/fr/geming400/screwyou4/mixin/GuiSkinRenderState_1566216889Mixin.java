package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiSkinRenderState.class)
public class GuiSkinRenderState_1566216889Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1343238149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343238149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_430756913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430756913L))
            info.setReturnValue("J0K똧YV@Q錤<dG=\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1604479630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604479630L))
            info.setReturnValue(733530405);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_1604476251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604476251L))
            info.setReturnValue(6.080182E8F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds__1553725104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553725104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_1604479134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604479134L))
            info.setReturnValue(937673725);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1604479134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604479134L))
            info.setReturnValue(937673725);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_1604479134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604479134L))
            info.setReturnValue(937673725);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1604479134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604479134L))
            info.setReturnValue(937673725);
    }

    @Inject(at = @At("HEAD"), method = "rotationY()F", cancellable = true)
    private void rotationY_1604476251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604476251L))
            info.setReturnValue(6.080182E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotationX()F", cancellable = true)
    private void rotationX_1604476251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604476251L))
            info.setReturnValue(6.080182E8F);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__876849665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876849665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea__1553725104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553725104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerModel()Lnet/minecraft/client/model/Model$Simple;", cancellable = true)
    private void playerModel__1610519783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610519783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pivotY()F", cancellable = true)
    private void pivotY_1604476251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604476251L))
            info.setReturnValue(6.080182E8F);
    }


}
