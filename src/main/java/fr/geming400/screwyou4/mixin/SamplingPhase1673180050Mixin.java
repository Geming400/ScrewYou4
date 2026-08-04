package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.SamplingPhase.class)
public class SamplingPhase1673180050Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private static void values_304386551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304386551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private static void valueOf_399072564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399072564L))
            info.setReturnValue(null);
    }


}
