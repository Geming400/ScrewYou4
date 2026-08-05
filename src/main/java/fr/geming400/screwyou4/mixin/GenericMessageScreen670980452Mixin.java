package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.GenericMessageScreen.class)
public class GenericMessageScreen670980452Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_709259035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709259035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__288706920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-288706920L))
            info.cancel();
    }


}
