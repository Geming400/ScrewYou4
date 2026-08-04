package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.dialog.body.DialogBodyHandlers.class)
public class DialogBodyHandlers1025603719Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_1063878706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1063878706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyElement(Lnet/minecraft/client/gui/screens/dialog/DialogScreen;Lnet/minecraft/server/dialog/body/DialogBody;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private static void createBodyElement_517359734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517359734L))
            info.setReturnValue(null);
    }


}
