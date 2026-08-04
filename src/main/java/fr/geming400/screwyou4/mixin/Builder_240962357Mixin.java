package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryPropertyMap.Builder.class)
public class Builder_240962357Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/telemetry/TelemetryProperty;Ljava/lang/Object;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void put__193651536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193651536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/client/telemetry/TelemetryPropertyMap;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void putAll__1249838480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249838480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/telemetry/TelemetryPropertyMap;", cancellable = true)
    private void build_1094049764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094049764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putIfNotNull(Lnet/minecraft/client/telemetry/TelemetryProperty;Ljava/lang/Object;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void putIfNotNull__193651536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193651536L))
            info.setReturnValue(null);
    }


}
