package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.rcon.thread.RconClient.class)
public class RconClient_637668789Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_675943527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(675943527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_675943527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(675943527L))
            info.cancel();
    }


}
