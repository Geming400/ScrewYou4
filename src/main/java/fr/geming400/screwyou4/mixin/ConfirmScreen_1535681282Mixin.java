package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConfirmScreen.class)
public class ConfirmScreen_1535681282Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1573956020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1573956020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDelay(I)V", cancellable = true)
    private void setDelay__1545369043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1545369043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_619045567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(619045567L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__641227884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641227884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1573959864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573959864L))
            info.setReturnValue(false);
    }


}
