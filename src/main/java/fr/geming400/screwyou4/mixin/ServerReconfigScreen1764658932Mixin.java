package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerReconfigScreen.class)
public class ServerReconfigScreen1764658932Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1802933671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802933671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1802937515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802937515L))
            info.setReturnValue(null);
    }


}
