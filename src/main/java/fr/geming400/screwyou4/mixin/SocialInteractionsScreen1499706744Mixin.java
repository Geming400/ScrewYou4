package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsScreen.class)
public class SocialInteractionsScreen1499706744Mixin {
        @Inject(at = @At("HEAD"), method = "added()V", cancellable = true)
    private void added__206931157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-206931157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1569245070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1569245070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__172135994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172135994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1808380910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1808380910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen__2059438153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059438153L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1393806019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1393806019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1468653113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468653113L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onRemovePlayer(Ljava/util/UUID;)V", cancellable = true)
    private void onRemovePlayer_2051811451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2051811451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onAddPlayer(Lnet/minecraft/client/multiplayer/PlayerInfo;)V", cancellable = true)
    private void onAddPlayer_572110545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(572110545L))
            info.cancel();
    }


}
