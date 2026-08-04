package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.ServerType.class)
public class ServerType_1348376151Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/telemetry/TelemetryProperty$ServerType;", cancellable = true)
    private static void values_1986285088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986285088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty$ServerType;", cancellable = true)
    private static void valueOf__1366118205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366118205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_212915679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212915679L))
            info.setReturnValue(null);
    }


}
