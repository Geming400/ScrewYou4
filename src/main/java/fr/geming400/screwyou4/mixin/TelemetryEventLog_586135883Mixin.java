package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventLog.class)
public class TelemetryEventLog_586135883Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1528439547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528439547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logger()Lnet/minecraft/client/telemetry/TelemetryEventLogger;", cancellable = true)
    private void logger_1904243207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904243207L))
            info.setReturnValue(null);
    }


}
