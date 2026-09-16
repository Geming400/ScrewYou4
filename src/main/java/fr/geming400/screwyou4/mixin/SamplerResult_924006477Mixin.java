package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.SamplerResult.class)
public class SamplerResult_924006477Mixin {
        @Inject(at = @At("HEAD"), method = "valueAtTick(I)D", cancellable = true)
    private void valueAtTick_248810599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248810599L))
            info.setReturnValue(3.476577001785396E8D);
    }

    @Inject(at = @At("HEAD"), method = "getFirstTick()I", cancellable = true)
    private void getFirstTick_1755141851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755141851L))
            info.setReturnValue(1957455063);
    }

    @Inject(at = @At("HEAD"), method = "getLastTick()I", cancellable = true)
    private void getLastTick__2117859063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117859063L))
            info.setReturnValue(-367294059);
    }


}
