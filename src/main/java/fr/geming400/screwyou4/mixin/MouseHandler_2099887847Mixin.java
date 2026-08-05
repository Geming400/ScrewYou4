package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.MouseHandler.class)
public class MouseHandler_2099887847Mixin {
        @Inject(at = @At("HEAD"), method = "setup(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void setup_1230625319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230625319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grabMouse()V", cancellable = true)
    private void grabMouse_2138162585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138162585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xpos()D", cancellable = true)
    private void xpos_2138145287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138145287L))
            info.setReturnValue(8.172242005071977E8D);
    }

    @Inject(at = @At("HEAD"), method = "ypos()D", cancellable = true)
    private void ypos_2138145287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138145287L))
            info.setReturnValue(8.172242005071977E8D);
    }

    @Inject(at = @At("HEAD"), method = "handleAccumulatedMovement()V", cancellable = true)
    private void handleAccumulatedMovement_2138162585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138162585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursorEntered()V", cancellable = true)
    private void cursorEntered_2138162585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138162585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreFirstMove()V", cancellable = true)
    private void setIgnoreFirstMove_2138162585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138162585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseGrabbed()Z", cancellable = true)
    private void isMouseGrabbed_2138166429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138166429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isMiddlePressed()Z", cancellable = true)
    private void isMiddlePressed_2138166429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138166429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isLeftPressed()Z", cancellable = true)
    private void isLeftPressed_2138166429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138166429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isRightPressed()Z", cancellable = true)
    private void isRightPressed_2138166429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138166429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "drawDebugMouseInfo(Lnet/minecraft/client/gui/Font;Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void drawDebugMouseInfo_1377587946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377587946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillMousePositionDetails(Lnet/minecraft/CrashReportCategory;Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void fillMousePositionDetails_1003939737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1003939737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "releaseMouse()V", cancellable = true)
    private void releaseMouse_2138162585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138162585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScaledXPos(Lcom/mojang/blaze3d/platform/Window;)D", cancellable = true)
    private void getScaledXPos_1230608021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230608021L))
            info.setReturnValue(8.172242004404573E8D);
    }

    @Inject(at = @At("HEAD"), method = "getScaledXPos(Lcom/mojang/blaze3d/platform/Window;D)D", cancellable = true)
    private static void getScaledXPos_945318693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945318693L))
            info.setReturnValue(8.17224200324831E8D);
    }

    @Inject(at = @At("HEAD"), method = "getScaledYPos(Lcom/mojang/blaze3d/platform/Window;)D", cancellable = true)
    private void getScaledYPos_1230608021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230608021L))
            info.setReturnValue(8.172242004404573E8D);
    }

    @Inject(at = @At("HEAD"), method = "getScaledYPos(Lcom/mojang/blaze3d/platform/Window;D)D", cancellable = true)
    private static void getScaledYPos_945318693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945318693L))
            info.setReturnValue(8.17224200324831E8D);
    }


}
