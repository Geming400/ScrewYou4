package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.GameLoadTimesEvent.class)
public class GameLoadTimesEvent_191702468Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void send__1332918895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1332918895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBootstrapTime(J)V", cancellable = true)
    private void setBootstrapTime_1406543952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1406543952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endStep(Lnet/minecraft/client/telemetry/TelemetryProperty;)V", cancellable = true)
    private void endStep__1998691587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998691587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginStep(Lnet/minecraft/client/telemetry/TelemetryProperty;Lcom/google/common/base/Stopwatch;)V", cancellable = true)
    private void beginStep_379106497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(379106497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "beginStep(Lnet/minecraft/client/telemetry/TelemetryProperty;)V", cancellable = true)
    private void beginStep__1998691587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998691587L))
            info.cancel();
    }


}
