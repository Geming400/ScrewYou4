package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventType.Builder.class)
public class Builder_962921096Mixin {
        @Inject(at = @At("HEAD"), method = "register()Lnet/minecraft/client/telemetry/TelemetryEventType;", cancellable = true)
    private void register__757130265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757130265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Lnet/minecraft/client/telemetry/TelemetryProperty;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void define__318661313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318661313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defineAll(Ljava/util/List;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void defineAll_2028690046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028690046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optIn()Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void optIn__352222341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352222341L))
            info.setReturnValue(null);
    }


}
