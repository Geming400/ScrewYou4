package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ErrorScreen.class)
public class ErrorScreen36874630Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__922812742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-922812742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__922812742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-922812742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_75153213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75153213L))
            info.setReturnValue(null);
    }


}
