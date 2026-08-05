package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.PopupScreen.class)
public class PopupScreen1977713354Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_2015988093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2015988093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_2015988093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2015988093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__199195811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199195811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_1018025982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1018025982L))
            info.cancel();
    }


}
