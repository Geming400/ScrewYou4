package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.WinScreen.class)
public class WinScreen617547930Mixin {
        @Inject(at = @At("HEAD"), method = "removed()V", cancellable = true)
    private void removed_178467565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(178467565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1843563412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1843563412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_487864272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(487864272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInPortal()Z", cancellable = true)
    private void isAllowedInPortal__1579187582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579187582L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyReleased(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyReleased_512862740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512862740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBackgroundMusic()Lnet/minecraft/sounds/Music;", cancellable = true)
    private void getBackgroundMusic__1832286117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1832286117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_1604427572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1604427572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_586494299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586494299L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPauseScreen()Z", cancellable = true)
    private void isPauseScreen_1353370329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353370329L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_2019002463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019002463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1054294808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054294808L))
            info.setReturnValue(null);
    }


}
