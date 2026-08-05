package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.UnsupportedGraphicsWarningScreen.class)
public class UnsupportedGraphicsWarningScreen_1888815376Mixin {
        @Inject(at = @At("HEAD"), method = "init()V", cancellable = true)
    private void init_1927090114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1927090114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__288093790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288093790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1927093958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927093958L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_929128003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929128003L))
            info.cancel();
    }


}
