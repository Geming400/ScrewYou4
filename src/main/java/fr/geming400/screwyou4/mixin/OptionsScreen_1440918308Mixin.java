package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.OptionsScreen.class)
public class OptionsScreen_1440918308Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_1479193046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479193046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1479193046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479193046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void getLastScreen__1008831761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008831761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onGamemasterPermissionChanged(Z)V", cancellable = true)
    private void onGamemasterPermissionChanged__1624432160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1624432160L))
            info.cancel();
    }


}
