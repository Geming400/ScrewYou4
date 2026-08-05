package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.events.GameLoadTimesEvent.Measurement.class)
public class Measurement_659353396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2044865654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044865654L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__476106580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476106580L))
            info.setReturnValue("=,;M渳(XA<Ed(䑐c$n`硱uo쒳F]Hoeiv9:f.Kt;wgᚳ#q鳉V俀P;;g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_697616137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697616137L))
            info.setReturnValue(1486431230);
    }

    @Inject(at = @At("HEAD"), method = "millis()I", cancellable = true)
    private void millis_697615641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697615641L))
            info.setReturnValue(1689578649);
    }


}
