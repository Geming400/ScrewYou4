package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.PerformanceMetricsEvent.class)
public class PerformanceMetricsEvent_1959057111Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void tick_434435748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434435748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeSample()V", cancellable = true)
    private void takeSample_1997331849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1997331849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendEvent(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void sendEvent_434435748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434435748L))
            info.cancel();
    }


}
