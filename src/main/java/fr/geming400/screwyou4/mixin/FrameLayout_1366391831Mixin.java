package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.FrameLayout.class)
public class FrameLayout_1366391831Mixin {
        @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1395790256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395790256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__574592184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574592184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1617190366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617190366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alignInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;IIIIFF)V", cancellable = true)
    private static void alignInRectangle_385121987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385121987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "alignInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/navigation/ScreenRectangle;FF)V", cancellable = true)
    private static void alignInRectangle_80190506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(80190506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centerInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;IIII)V", cancellable = true)
    private static void centerInRectangle_379778515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379778515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centerInRectangle(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private static void centerInRectangle_248033370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(248033370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_533211110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(533211110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinWidth(I)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinWidth_934201192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934201192L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.FrameLayout());
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_1753739869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753739869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinHeight(I)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinHeight_1867117319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867117319L))
            info.setReturnValue(new net.minecraft.client.gui.layouts.FrameLayout());
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren__1708639738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1708639738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "alignInDimension(IIILjava/util/function/Consumer;F)V", cancellable = true)
    private static void alignInDimension_504256866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504256866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultChildLayoutSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultChildLayoutSetting__2031171208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031171208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinDimensions(II)Lnet/minecraft/client/gui/layouts/FrameLayout;", cancellable = true)
    private void setMinDimensions__2008694028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008694028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newChildLayoutSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newChildLayoutSettings_635874426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635874426L))
            info.setReturnValue(null);
    }


}
