package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerReconfigScreen.class)
public class ServerReconfigScreen1764658932Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1634975274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1634975274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1175562554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175562554L))
            info.setReturnValue(false);
    }


}
