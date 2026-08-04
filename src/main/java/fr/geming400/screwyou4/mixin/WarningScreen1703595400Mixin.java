package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.DialogScreen.WarningScreen.class)
public class WarningScreen1703595400Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/dialog/DialogConnectionAccess;Lnet/minecraft/client/gui/screens/Screen;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private static void create_1907156463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907156463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "returnScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void returnScreen__746154668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746154668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateReturnScreen(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void updateReturnScreen_763713562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(763713562L))
            info.cancel();
    }


}
