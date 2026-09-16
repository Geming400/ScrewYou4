package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.MetricSamplerBuilder.class)
public class MetricSamplerBuilder_982987581Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private void build_183070830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183070830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSamplingPhase(Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withSamplingPhase_919161130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919161130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBeforeTick(Ljava/util/function/Consumer;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withBeforeTick__485957713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485957713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withThresholdAlert(Lnet/minecraft/util/profiling/metrics/MetricSampler$ThresholdTest;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private void withThresholdAlert__410514568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410514568L))
            info.setReturnValue(null);
    }


}
