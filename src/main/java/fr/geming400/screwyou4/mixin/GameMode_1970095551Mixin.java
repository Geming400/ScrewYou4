package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.GameMode.class)
public class GameMode_1970095551Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/telemetry/TelemetryProperty$GameMode;", cancellable = true)
    private static void values__525452910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525452910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty$GameMode;", cancellable = true)
    private static void valueOf_1044925867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044925867L))
            info.setReturnValue(net.minecraft.client.telemetry.TelemetryProperty.GameMode.CREATIVE);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__725088407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725088407L))
            info.setReturnValue(-2010654287);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2058304172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058304172L))
            info.setReturnValue("q)x");
    }


}
