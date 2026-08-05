package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.SamplingPhase.class)
public class SamplingPhase1673180050Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private static void values_1853381269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853381269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private static void valueOf_740108380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740108380L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricSampler.SamplingPhase.EXTRACT);
    }


}
