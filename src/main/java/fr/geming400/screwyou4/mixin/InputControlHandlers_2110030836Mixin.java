package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.input.InputControlHandlers.class)
public class InputControlHandlers_2110030836Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap__2146661474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2146661474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHandler(Lnet/minecraft/server/dialog/input/InputControl;Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/gui/screens/dialog/input/InputControlHandler$Output;)V", cancellable = true)
    private static void createHandler_940772950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940772950L))
            info.cancel();
    }


}
