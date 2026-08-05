package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.AlertScreen.class)
public class AlertScreen_1882927910Mixin {
        @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__293981256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293981256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1921206492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921206492L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_923240537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(923240537L))
            info.cancel();
    }


}
