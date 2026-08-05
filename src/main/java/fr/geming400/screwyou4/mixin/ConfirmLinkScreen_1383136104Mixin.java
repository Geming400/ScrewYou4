package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConfirmLinkScreen.class)
public class ConfirmLinkScreen_1383136104Mixin {
        @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;)V", cancellable = true)
    private static void confirmLinkNow_1807976763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1807976763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;)V", cancellable = true)
    private static void confirmLinkNow__759732269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-759732269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;Z)V", cancellable = true)
    private static void confirmLinkNow_1711387155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711387155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;Z)V", cancellable = true)
    private static void confirmLinkNow__578181509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-578181509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyToClipboard()V", cancellable = true)
    private void copyToClipboard_1421410842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421410842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink_912558237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912558237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;Z)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink__431513403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431513403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;Z)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink__1971199139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971199139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confirmLink(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;)Lnet/minecraft/client/gui/components/Button$OnPress;", cancellable = true)
    private static void confirmLink__1492413691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492413691L))
            info.setReturnValue(null);
    }


}
