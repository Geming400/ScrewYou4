package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.PerformanceMetricsEvent.class)
public class PerformanceMetricsEvent_1959057111Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void tick_266508801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(266508801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeSample()V", cancellable = true)
    private void takeSample__461927656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-461927656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendEvent(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void sendEvent_798747670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(798747670L))
            info.cancel();
    }


}
