package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.ClientTelemetryManager.class)
public class ClientTelemetryManager701244349Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1413331080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1413331080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOutsideSessionSender()Lnet/minecraft/client/telemetry/TelemetryEventSender;", cancellable = true)
    private void getOutsideSessionSender__356856439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356856439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLogDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getLogDirectory__486708070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-486708070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWorldSessionManager(ZLjava/time/Duration;Ljava/lang/String;Ljava/util/UUID;)Lnet/minecraft/client/telemetry/WorldSessionTelemetryManager;", cancellable = true)
    private void createWorldSessionManager_2023158846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023158846L))
            info.setReturnValue(null);
    }


}
