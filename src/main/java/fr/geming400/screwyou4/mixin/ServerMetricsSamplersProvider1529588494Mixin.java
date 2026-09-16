package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ServerMetricsSamplersProvider.class)
public class ServerMetricsSamplersProvider1529588494Mixin {
        @Inject(at = @At("HEAD"), method = "tickTimeSampler(Ljava/util/function/LongSupplier;)Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private static void tickTimeSampler__209240332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209240332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runtimeIndependentSamplers()Ljava/util/Set;", cancellable = true)
    private static void runtimeIndependentSamplers_263140603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263140603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplers(Ljava/util/function/Supplier;)Ljava/util/Set;", cancellable = true)
    private void samplers__779628753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779628753L))
            info.setReturnValue(null);
    }


}
