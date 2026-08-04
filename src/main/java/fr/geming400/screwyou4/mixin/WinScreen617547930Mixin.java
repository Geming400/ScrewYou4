package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.WinScreen.class)
public class WinScreen617547930Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_655822669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(655822669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_655822669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(655822669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_655822669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(655822669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal_655826513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655826513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__342139442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342139442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1559361235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559361235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_655826513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655826513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__342139442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342139442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased__299087784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299087784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundMusic()Lnet/minecraft/sounds/Music;", cancellable = true)
    private void getBackgroundMusic__767703814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767703814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__299087784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299087784L))
            info.setReturnValue(null);
    }


}
