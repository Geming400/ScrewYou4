package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.WaitingForResponseScreen.class)
public class WaitingForResponseScreen1571425329Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1497526485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1497526485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1441741671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1441741671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_982328951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982328951L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "previousScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void previousScreen__1504243046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504243046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen__1987719568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987719568L))
            info.setReturnValue(false);
    }


}
