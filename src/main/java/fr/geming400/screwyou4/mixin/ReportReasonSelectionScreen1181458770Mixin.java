package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportReasonSelectionScreen.class)
public class ReportReasonSelectionScreen1181458770Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1887493044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1887493044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__2126628884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2126628884L))
            info.cancel();
    }


}
