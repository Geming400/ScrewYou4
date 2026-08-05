package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LinearLayout.class)
public class LinearLayout1751836051Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1790098297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790098297L))
            info.setReturnValue(382836809);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1830351584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1830351584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_794143666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794143666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__1269382922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1269382922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1790098297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790098297L))
            info.setReturnValue(382836809);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__1329214273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1329214273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1790098297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790098297L))
            info.setReturnValue(382836809);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY__1329214273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1329214273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_1790098297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1790098297L))
            info.setReturnValue(382836809);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private static void horizontal_1260890870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260890870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_1790110790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1790110790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting_1686856256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686856256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren__1862114832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1862114832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren_1790110790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1790110790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "vertical()Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private static void vertical_1260890870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260890870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spacing(I)Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private void spacing_703504055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703504055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings_1686856256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686856256L))
            info.setReturnValue(null);
    }


}
