package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.MouseHandler.class)
public class MouseHandler_2099887847Mixin {
        @Inject(at = @At("HEAD"), method = "setup(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void setup__238432182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-238432182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAccumulatedMovement()V", cancellable = true)
    private void handleAccumulatedMovement_1660033136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660033136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursorEntered()V", cancellable = true)
    private void cursorEntered_1622470904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1622470904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIgnoreFirstMove()V", cancellable = true)
    private void setIgnoreFirstMove_143504780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143504780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMouseGrabbed()Z", cancellable = true)
    private void isMouseGrabbed__358732733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358732733L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fillMousePositionDetails(Lnet/minecraft/CrashReportCategory;Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void fillMousePositionDetails_1751862448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1751862448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLeftPressed()Z", cancellable = true)
    private void isLeftPressed__1125757780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125757780L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getScaledXPos(Lcom/mojang/blaze3d/platform/Window;)D", cancellable = true)
    private void getScaledXPos_1860903401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1860903401L))
            info.setReturnValue(1.2298800040395157E7D);
    }

    @Inject(at = @At("HEAD"), method = "getScaledXPos(Lcom/mojang/blaze3d/platform/Window;D)D", cancellable = true)
    private static void getScaledXPos__990361007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990361007L))
            info.setReturnValue(1.2298800025428584E7D);
    }

    @Inject(at = @At("HEAD"), method = "isRightPressed()Z", cancellable = true)
    private void isRightPressed_1687037421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687037421L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getScaledYPos(Lcom/mojang/blaze3d/platform/Window;)D", cancellable = true)
    private void getScaledYPos_160162922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160162922L))
            info.setReturnValue(1.2298800198703002E7D);
    }

    @Inject(at = @At("HEAD"), method = "getScaledYPos(Lcom/mojang/blaze3d/platform/Window;D)D", cancellable = true)
    private static void getScaledYPos_2121258992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121258992L))
            info.setReturnValue(1.2298800775941439E7D);
    }

    @Inject(at = @At("HEAD"), method = "isMiddlePressed()Z", cancellable = true)
    private void isMiddlePressed__1735362886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735362886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "drawDebugMouseInfo(Lnet/minecraft/client/gui/Font;Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void drawDebugMouseInfo_848511014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(848511014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "releaseMouse()V", cancellable = true)
    private void releaseMouse__1361801349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1361801349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grabMouse()V", cancellable = true)
    private void grabMouse_760586112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(760586112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xpos()D", cancellable = true)
    private void xpos_639249579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639249579L))
            info.setReturnValue(1.2298800865011083E7D);
    }

    @Inject(at = @At("HEAD"), method = "ypos()D", cancellable = true)
    private void ypos__1168204884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168204884L))
            info.setReturnValue(1.2298800025200423E7D);
    }


}
