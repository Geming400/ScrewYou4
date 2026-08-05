package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.FrameLayout.class)
public class FrameLayout_1366391831Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_408699445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408699445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1444907363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444907363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1654827143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654827143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "centerInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;IIII)V", cancellable = true)
    private static void centerInRectangle_834300520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(834300520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centerInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private static void centerInRectangle__946508699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-946508699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_1404666569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1404666569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1404666569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1404666569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinHeight(I)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinHeight_764902462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764902462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_2047408243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2047408243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinWidth(I)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinWidth_764902462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764902462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIIFF)V", cancellable = true)
    private static void alignInRectangle_1915657064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915657064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "alignInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/navigation/ScreenRectangle;FF)V", cancellable = true)
    private static void alignInRectangle__45018587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-45018587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newChildLayoutSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newChildLayoutSettings_1301412035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301412035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultChildLayoutSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultChildLayoutSetting_1301412035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301412035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignInDimension(IIILjava/util/function/Consumer;F)V", cancellable = true)
    private static void alignInDimension_1962733798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1962733798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinDimensions(II)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinDimensions_207515895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(207515895L))
            info.setReturnValue(null);
    }


}
