package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.class)
public class ChatSelectionScreen_495827054Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1721842535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1721842535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1176015685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176015685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1482706695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482706695L))
            info.cancel();
    }


}
