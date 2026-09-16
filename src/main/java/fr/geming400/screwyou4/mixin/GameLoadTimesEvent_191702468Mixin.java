package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.GameLoadTimesEvent.class)
public class GameLoadTimesEvent_191702468Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void send__173597927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-173597927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginStep(Lnet/minecraft/client/telemetry/TelemetryProperty;)V", cancellable = true)
    private void beginStep_1479268424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479268424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginStep(Lnet/minecraft/client/telemetry/TelemetryProperty;Lcom/google/common/base/Stopwatch;)V", cancellable = true)
    private void beginStep_63510348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(63510348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endStep(Lnet/minecraft/client/telemetry/TelemetryProperty;)V", cancellable = true)
    private void endStep_521306326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(521306326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBootstrapTime(J)V", cancellable = true)
    private void setBootstrapTime_757858985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(757858985L))
            info.cancel();
    }


}
