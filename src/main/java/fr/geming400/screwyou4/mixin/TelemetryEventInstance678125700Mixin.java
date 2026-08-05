package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryEventInstance.class)
public class TelemetryEventInstance678125700Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/telemetry/TelemetryEventType;", cancellable = true)
    private void type__1748589593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748589593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2063637959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063637959L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__457334275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457334275L))
            info.setReturnValue("愠!]$db'9恧<A䓙WKtsT`(|R|ck.ecr匌d++I5{(3 }1\"$7珊HP@6gNz#eT廍BF(k<&#{f+rh&※.挔L`7'5QNa7稹쉓[^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_716388442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716388442L))
            info.setReturnValue(851290227);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/client/telemetry/TelemetryPropertyMap;", cancellable = true)
    private void properties_1531213108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531213108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "export(Lcom/mojang/authlib/minecraft/TelemetrySession;)Lcom/mojang/authlib/minecraft/TelemetryEvent;", cancellable = true)
    private void export__1301220197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301220197L))
            info.setReturnValue(null);
    }


}
