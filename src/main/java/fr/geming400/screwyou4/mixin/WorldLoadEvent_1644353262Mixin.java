package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.WorldLoadEvent.class)
public class WorldLoadEvent_1644353262Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;Z)Z", cancellable = true)
    private void send_1668835059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668835059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;Z)V", cancellable = true)
    private void setGameMode_732094243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(732094243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wasSent()Z", cancellable = true)
    private void wasSent_1682631844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682631844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setServerBrand(Ljava/lang/String;)V", cancellable = true)
    private void setServerBrand__1498252886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1498252886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addProperties(Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;)V", cancellable = true)
    private void addProperties__1123704980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1123704980L))
            info.cancel();
    }


}
