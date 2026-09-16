package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.WorldLoadEvent.class)
public class WorldLoadEvent_1644353262Mixin {
        @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/client/telemetry/TelemetryEventSender;Z)Z", cancellable = true)
    private void send__1046920597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046920597L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;Z)V", cancellable = true)
    private void setGameMode__2013578854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013578854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "wasSent()Z", cancellable = true)
    private void wasSent__1368742109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368742109L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addProperties(Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;)V", cancellable = true)
    private void addProperties__2146636000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2146636000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setServerBrand(Ljava/lang/String;)V", cancellable = true)
    private void setServerBrand__388540632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-388540632L))
            info.cancel();
    }


}
