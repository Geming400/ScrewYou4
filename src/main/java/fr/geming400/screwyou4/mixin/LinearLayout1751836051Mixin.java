package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LinearLayout.class)
public class LinearLayout1751836051Mixin {
        @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY__1639693930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639693930L))
            info.setReturnValue(476349699);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Lnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__189147963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-189147963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_1781234477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781234477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/LayoutElement;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_2002634587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002634587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX__1668323081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668323081L))
            info.setReturnValue(1264101726);
    }

    @Inject(at = @At("HEAD"), method = "newCellSettings()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void newCellSettings__1219837445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219837445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultCellSetting()Lnet/minecraft/client/gui/layouts/LayoutSettings;", cancellable = true)
    private void defaultCellSetting_59934419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59934419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements()V", cancellable = true)
    private void arrangeElements_918655331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918655331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren_2139184090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2139184090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeChildren()V", cancellable = true)
    private void removeChildren__1323195517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1323195517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__186060439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186060439L))
            info.setReturnValue(-1647088185);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_26218876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26218876L))
            info.setReturnValue(-1512759930);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_770710645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(770710645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_1658214326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658214326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "vertical()Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private static void vertical__941683776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941683776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private static void horizontal__986426286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986426286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spacing(I)Lnet/minecraft/client/gui/layouts/LinearLayout;", cancellable = true)
    private void spacing_108132218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(108132218L))
            info.setReturnValue(null);
    }


}
