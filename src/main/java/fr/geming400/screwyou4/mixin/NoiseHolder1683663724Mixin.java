package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunction.NoiseHolder.class)
public class NoiseHolder1683663724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1225791313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225791313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_548203749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548203749L))
            info.setReturnValue(":jc妷5ku7>7)x0LLQ꿣#Z$k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1721926466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721926466L))
            info.setReturnValue(628829185);
    }

    @Inject(at = @At("HEAD"), method = "getValue(DDD)D", cancellable = true)
    private void getValue_613239553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613239553L))
            info.setReturnValue(5.624449002931349E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1721921165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721921165L))
            info.setReturnValue(5.624449008339609E8D);
    }

    @Inject(at = @At("HEAD"), method = "noise()Lnet/minecraft/world/level/levelgen/synth/NormalNoise;", cancellable = true)
    private void noise_857986017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857986017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseData()Lnet/minecraft/core/Holder;", cancellable = true)
    private void noiseData__1062427800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062427800L))
            info.setReturnValue(null);
    }


}
