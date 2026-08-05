package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.TargetPoint.class)
public class TargetPoint_105674678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1491186936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491186936L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1029785298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029785298L))
            info.setReturnValue("r9\u3A25G(\uCA69/X^NR9$Rt>Mk9\"\u523E_MnztlH=So&)_OlH1MM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_143937419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937419L))
            info.setReturnValue(28193104);
    }

    @Inject(at = @At("HEAD"), method = "depth()J", cancellable = true)
    private void depth_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }

    @Inject(at = @At("HEAD"), method = "continentalness()J", cancellable = true)
    private void continentalness_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }

    @Inject(at = @At("HEAD"), method = "erosion()J", cancellable = true)
    private void erosion_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }

    @Inject(at = @At("HEAD"), method = "humidity()J", cancellable = true)
    private void humidity_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }

    @Inject(at = @At("HEAD"), method = "weirdness()J", cancellable = true)
    private void weirdness_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }

    @Inject(at = @At("HEAD"), method = "temperature()J", cancellable = true)
    private void temperature_143937884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143937884L))
            info.setReturnValue(4271423626666495100L);
    }


}
