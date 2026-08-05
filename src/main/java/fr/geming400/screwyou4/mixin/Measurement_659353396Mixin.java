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
            info.setReturnValue("=,;M\u6E33(XA<Ed(\u4450c$n`\u7871uo\uC4B3F]Hoeiv9:f.Kt;wg\u16B3#q\u9CC9V\u4FC0P;;g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_697616137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697616137L))
            info.setReturnValue(1743212430);
    }

    @Inject(at = @At("HEAD"), method = "millis()I", cancellable = true)
    private void millis_697615641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697615641L))
            info.setReturnValue(1946359849);
    }


}
