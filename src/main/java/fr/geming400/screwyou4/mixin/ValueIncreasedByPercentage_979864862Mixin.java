package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.ValueIncreasedByPercentage.class)
public class ValueIncreasedByPercentage_979864862Mixin {
        @Inject(at = @At("HEAD"), method = "test(D)Z", cancellable = true)
    private void test_1430068442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430068442L))
            info.setReturnValue(true);
    }


}
