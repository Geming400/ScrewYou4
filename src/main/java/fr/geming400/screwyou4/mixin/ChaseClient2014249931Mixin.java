package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.chase.ChaseClient.class)
public class ChaseClient2014249931Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run__1517605165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1517605165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_388084572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(388084572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__703614020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-703614020L))
            info.cancel();
    }


}
