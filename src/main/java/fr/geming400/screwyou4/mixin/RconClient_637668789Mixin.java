package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.RconClient.class)
public class RconClient_637668789Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1400780988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1400780988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__2080195163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2080195163L))
            info.cancel();
    }


}
