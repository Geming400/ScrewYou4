package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.GenericMessageScreen.class)
public class GenericMessageScreen670980452Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_81884074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81884074L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_2072434985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2072434985L))
            info.cancel();
    }


}
