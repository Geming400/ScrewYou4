package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.FileFixerAbortedScreen.class)
public class FileFixerAbortedScreen2104246525Mixin {
        @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1515150147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515150147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_2073192894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073192894L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage_432403787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432403787L))
            info.setReturnValue(null);
    }


}
