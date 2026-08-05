package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DisconnectedScreen.class)
public class DisconnectedScreen_1373266641Mixin {
        @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__803642525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803642525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1411545223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411545223L))
            info.setReturnValue(false);
    }


}
