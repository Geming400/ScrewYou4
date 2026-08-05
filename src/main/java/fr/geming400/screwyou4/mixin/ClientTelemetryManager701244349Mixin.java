package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.ClientTelemetryManager.class)
public class ClientTelemetryManager701244349Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_739519088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(739519088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOutsideSessionSender()Lnet/minecraft/client/telemetry/TelemetryEventSender;", cancellable = true)
    private void getOutsideSessionSender_316050757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316050757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWorldSessionManager(ZLjava/time/Duration;Ljava/lang/String;Ljava/util/UUID;)Lnet/minecraft/client/telemetry/WorldSessionTelemetryManager;", cancellable = true)
    private void createWorldSessionManager_1698695537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698695537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLogDirectory()Ljava/nio/file/Path;", cancellable = true)
    private void getLogDirectory__433119333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433119333L))
            info.setReturnValue(null);
    }


}
