package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.OptionsScreen.class)
public class OptionsScreen_1440918308Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1001837942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1001837942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1628033507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628033507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged_440736370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(440736370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void getLastScreen_901651287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901651287L))
            info.setReturnValue(null);
    }


}
