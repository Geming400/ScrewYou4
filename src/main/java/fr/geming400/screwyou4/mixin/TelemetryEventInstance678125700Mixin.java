package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventInstance.class)
public class TelemetryEventInstance678125700Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/telemetry/TelemetryEventType;", cancellable = true)
    private void type__1318454419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318454419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__230500568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230500568L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1448549225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448549225L))
            info.setReturnValue("AySF\uBBD2\u31D1\u910F\u6B77c\u11E2%GvN'V\u3619I<NLpz\u34D53\uC392^Q{!f'Lgb\u25F4{'c\u96C4\uFBA2\u49F6oc\" SY lIf}[\uCD6A3b%pD\u34FEnr6O<Y0\u6F77w,2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1235477791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235477791L))
            info.setReturnValue(1088620984);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/client/telemetry/TelemetryPropertyMap;", cancellable = true)
    private void properties__1072749727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072749727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lcom/mojang/authlib/minecraft/TelemetrySession;)Lcom/mojang/authlib/minecraft/TelemetryEvent;", cancellable = true)
    private void export__549021617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549021617L))
            info.setReturnValue(null);
    }


}
