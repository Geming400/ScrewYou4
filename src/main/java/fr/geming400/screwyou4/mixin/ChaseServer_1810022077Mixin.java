package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.chase.ChaseServer.class)
public class ChaseServer_1810022077Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1848296815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848296815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1848296815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1848296815L))
            info.cancel();
    }


}
