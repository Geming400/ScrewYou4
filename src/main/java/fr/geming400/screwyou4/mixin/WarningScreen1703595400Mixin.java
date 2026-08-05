package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.DialogScreen.WarningScreen.class)
public class WarningScreen1703595400Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/dialog/DialogConnectionAccess;Lnet/minecraft/client/gui/screens/Screen;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private static void create__1276988949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276988949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "returnScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void returnScreen_1197240600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197240600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateReturnScreen(Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void updateReturnScreen__934278017(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934278017L))
            info.cancel();
    }


}
