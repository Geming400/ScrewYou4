package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.MultiplayerOptionsScreen.class)
public class MultiplayerOptionsScreen226975128Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1452990610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1452990610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1628429661(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628429661L))
            info.cancel();
    }


}
