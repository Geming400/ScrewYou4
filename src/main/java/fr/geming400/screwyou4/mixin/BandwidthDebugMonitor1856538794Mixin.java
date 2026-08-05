package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.BandwidthDebugMonitor.class)
public class BandwidthDebugMonitor1856538794Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1726855136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726855136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onReceive(I)V", cancellable = true)
    private void onReceive__1348611878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1348611878L))
            info.cancel();
    }


}
