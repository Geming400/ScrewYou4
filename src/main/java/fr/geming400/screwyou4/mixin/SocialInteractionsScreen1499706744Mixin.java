package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsScreen.class)
public class SocialInteractionsScreen1499706744Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added_1537981483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1537981483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1537981483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1537981483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_540019372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540019372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1537985327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537985327L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_540019372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540019372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__677202421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677202421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_583071030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583071030L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onAddPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;)V", cancellable = true)
    private void onAddPlayer_448744910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(448744910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRemovePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void onRemovePlayer_1142150655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1142150655L))
            info.cancel();
    }


}
