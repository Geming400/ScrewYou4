package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.notifications.ServerActivityMonitor.class)
public class ServerActivityMonitor_382547782Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_420822520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(420822520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reportLoginActivity()V", cancellable = true)
    private void reportLoginActivity_420822520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(420822520L))
            info.cancel();
    }


}
