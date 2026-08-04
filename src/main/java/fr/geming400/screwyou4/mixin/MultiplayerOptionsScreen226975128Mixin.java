package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.MultiplayerOptionsScreen.class)
public class MultiplayerOptionsScreen226975128Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_265249867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(265249867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__732712244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-732712244L))
            info.cancel();
    }


}
