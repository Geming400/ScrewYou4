package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.ServerType.class)
public class ServerType_1348376151Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/telemetry/TelemetryProperty$ServerType;", cancellable = true)
    private static void values_1352735426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352735426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty$ServerType;", cancellable = true)
    private static void valueOf__1341748069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341748069L))
            info.setReturnValue(net.minecraft.client.telemetry.TelemetryProperty.ServerType.OTHER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1436584772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436584772L))
            info.setReturnValue("d\u9EF5k\u39EAjws1whJY;_E&b|$_\u2396`K\"G<1@vAF}q;\u9CADMg`4H4 ");
    }


}
