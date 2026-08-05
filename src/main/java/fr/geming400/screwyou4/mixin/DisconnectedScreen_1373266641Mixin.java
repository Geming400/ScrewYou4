package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.DisconnectedScreen.class)
public class DisconnectedScreen_1373266641Mixin {
        @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__298576098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298576098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_784170262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784170262L))
            info.setReturnValue(true);
    }


}
