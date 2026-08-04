package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.telemetry.TelemetryProperty.GameMode.class)
public class GameMode_1970095551Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/telemetry/TelemetryProperty$GameMode;", cancellable = true)
    private static void values__104682384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104682384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/telemetry/TelemetryProperty$GameMode;", cancellable = true)
    private static void valueOf__429958189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429958189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_2008357796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008357796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_834635079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834635079L))
            info.setReturnValue(null);
    }


}
