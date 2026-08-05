package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.PrivacyConfirmLinkScreen.class)
public class PrivacyConfirmLinkScreen_311527962Mixin {
        @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/net/URI;)V", cancellable = true)
    private static void confirmLinkNow_782149153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(782149153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "confirmLinkNow(Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/String;)V", cancellable = true)
    private static void confirmLinkNow_525441417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(525441417L))
            info.cancel();
    }


}
