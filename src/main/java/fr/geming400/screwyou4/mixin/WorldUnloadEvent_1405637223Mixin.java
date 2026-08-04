package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.WorldUnloadEvent.class)
public class WorldUnloadEvent_1405637223Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void send__118984140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-118984140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime__1674489581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1674489581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerInfoReceived()V", cancellable = true)
    private void onPlayerInfoReceived_1443911961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1443911961L))
            info.cancel();
    }


}
