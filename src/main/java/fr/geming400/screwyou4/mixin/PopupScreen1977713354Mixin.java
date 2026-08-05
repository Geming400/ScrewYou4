package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PopupScreen.class)
public class PopupScreen1977713354Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_271075453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271075453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1091238460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1091238460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage_305870616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305870616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__915799409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-915799409L))
            info.cancel();
    }


}
