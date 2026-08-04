package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.SamplerResult.class)
public class SamplerResult_924006477Mixin {
        @Inject(at = @At("HEAD"), method = "valueAtTick(I)D", cancellable = true)
    private void valueAtTick_2137906150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137906150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFirstTick()I", cancellable = true)
    private void getFirstTick_962268722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962268722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastTick()I", cancellable = true)
    private void getLastTick_962268722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962268722L))
            info.setReturnValue(null);
    }


}
