package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.WorldUnloadEvent.class)
public class WorldUnloadEvent_1405637223Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;)V", cancellable = true)
    private void send_1040336828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1040336828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTime(J)V", cancellable = true)
    private void setTime_1403296802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403296802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerInfoReceived()V", cancellable = true)
    private void onPlayerInfoReceived_398330890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(398330890L))
            info.cancel();
    }


}
