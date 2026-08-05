package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.FileFixerProgressScreen.class)
public class FileFixerProgressScreen929597041Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_340500663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340500663L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1916476683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1916476683L))
            info.cancel();
    }


}
