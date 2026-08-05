package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.FileFixerAbortedScreen.class)
public class FileFixerAbortedScreen2104246525Mixin {
        @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__72662640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72662640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_2142525108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142525108L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1187610811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187610811L))
            info.setReturnValue(true);
    }


}
