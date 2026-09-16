package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConfirmLinkScreen.class)
public class ConfirmLinkScreen_1383136104Mixin {
        @Inject(at = @At("HEAD"), method = "copyToClipboard()V", cancellable = true)
    private void copyToClipboard__1697643724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1697643724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;Z)V", cancellable = true)
    private static void confirmLinkNow__532388873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-532388873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;Z)V", cancellable = true)
    private static void confirmLinkNow__1164383649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1164383649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;)V", cancellable = true)
    private static void confirmLinkNow_1597049559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1597049559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;)V", cancellable = true)
    private static void confirmLinkNow_1853757295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1853757295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink_2058216323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058216323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;Z)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink_269673015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269673015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;Z)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink_724148895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724148895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink__1974316821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974316821L))
            info.setReturnValue(null);
    }


}
