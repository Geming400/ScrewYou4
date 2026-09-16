package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.UnsupportedGraphicsWarningScreen.class)
public class UnsupportedGraphicsWarningScreen_1888815376Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1578128562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1578128562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1299718997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299718997L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1419272279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1419272279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage_216972637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216972637L))
            info.setReturnValue(null);
    }


}
