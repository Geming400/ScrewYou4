package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryPropertyMap.Builder.class)
public class Builder_240962357Mixin {
        @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/telemetry/TelemetryProperty;Ljava/lang/Object;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void put_497937153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497937153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putAll(Lnet/minecraft/client/telemetry/TelemetryPropertyMap;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void putAll_1896261890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896261890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/telemetry/TelemetryPropertyMap;", cancellable = true)
    private void build__910374602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910374602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putIfNotNull(Lnet/minecraft/client/telemetry/TelemetryProperty;Ljava/lang/Object;)Lnet/minecraft/client/telemetry/TelemetryPropertyMap$Builder;", cancellable = true)
    private void putIfNotNull__123757406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123757406L))
            info.setReturnValue(null);
    }


}
