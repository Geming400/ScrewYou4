package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventType.Builder.class)
public class Builder_962921096Mixin {
        @Inject(at = @At("HEAD"), method = "register()Lnet/minecraft/client/telemetry/TelemetryEventType;", cancellable = true)
    private void register__1463794198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463794198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Lnet/minecraft/client/telemetry/TelemetryProperty;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void define_1247258010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247258010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "optIn()Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void optIn_1540907443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1540907443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defineAll(Ljava/util/List;)Lnet/minecraft/client/telemetry/TelemetryEventType$Builder;", cancellable = true)
    private void defineAll_256933156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256933156L))
            info.setReturnValue(null);
    }


}
