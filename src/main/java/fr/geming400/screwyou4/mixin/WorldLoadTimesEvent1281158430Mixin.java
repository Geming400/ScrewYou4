package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.WorldLoadTimesEvent.class)
public class WorldLoadTimesEvent1281158430Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void send__243462932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243462932L))
            info.cancel();
    }


}
