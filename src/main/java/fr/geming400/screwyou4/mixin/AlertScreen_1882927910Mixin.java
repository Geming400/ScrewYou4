package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.AlertScreen.class)
public class AlertScreen_1882927910Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1293831531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293831531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1425159745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1425159745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage_211085171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211085171L))
            info.setReturnValue(null);
    }


}
