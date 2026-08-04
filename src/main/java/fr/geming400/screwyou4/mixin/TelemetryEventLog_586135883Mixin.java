package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventLog.class)
public class TelemetryEventLog_586135883Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_624410621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624410621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logger()Lnet/minecraft/client/telemetry/TelemetryEventLogger;", cancellable = true)
    private void logger__1615215209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615215209L))
            info.setReturnValue(null);
    }


}
