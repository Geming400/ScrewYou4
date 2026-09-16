package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.GameLoadTimesEvent.Measurement.class)
public class Measurement_659353396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__249272873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249272873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1429776920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429776920L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1216705486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216705486L))
            info.setReturnValue(1401896673);
    }

    @Inject(at = @At("HEAD"), method = "millis()I", cancellable = true)
    private void millis__1751275885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751275885L))
            info.setReturnValue(839532284);
    }


}
