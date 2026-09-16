package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConfirmScreen.class)
public class ConfirmScreen_1535681282Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1405997623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1405997623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1504627650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504627650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDelay(I)V", cancellable = true)
    private void setDelay__2005823570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2005823570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__136161457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136161457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_946584903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946584903L))
            info.setReturnValue(true);
    }


}
