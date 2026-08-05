package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.MetricSamplerBuilder.class)
public class MetricSamplerBuilder_982987581Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private void build__306459648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306459648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withThresholdAlert(Lnet/minecraft/util/profiling/metrics/MetricSampler$ThresholdTest;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withThresholdAlert__483371409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483371409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSamplingPhase(Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withSamplingPhase_1474653592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474653592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBeforeTick(Ljava/util/function/Consumer;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withBeforeTick_1222639373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222639373L))
            info.setReturnValue(null);
    }


}
