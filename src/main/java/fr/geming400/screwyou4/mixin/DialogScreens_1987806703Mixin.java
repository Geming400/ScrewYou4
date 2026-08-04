package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.DialogScreens.class)
public class DialogScreens_1987806703Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_2026081689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026081689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFromData(Lnet/minecraft/server/dialog/Dialog;Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/gui/screens/dialog/DialogConnectionAccess;)Lnet/minecraft/client/gui/screens/dialog/DialogScreen;", cancellable = true)
    private static void createFromData__935635116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-935635116L))
            info.setReturnValue(null);
    }


}
