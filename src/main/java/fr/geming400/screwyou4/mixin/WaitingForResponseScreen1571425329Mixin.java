package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.WaitingForResponseScreen.class)
public class WaitingForResponseScreen1571425329Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1609700068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1609700068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1609700068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1609700068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1609703912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609703912L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "previousScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void previousScreen__878324739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878324739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1609703912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1609703912L))
            info.setReturnValue(true);
    }


}
