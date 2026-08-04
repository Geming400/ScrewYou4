package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.ValueIncreasedByPercentage.class)
public class ValueIncreasedByPercentage_979864862Mixin {
        @Inject(at = @At("HEAD"), method = "test(D)Z", cancellable = true)
    private void test__2105799224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105799224L))
            info.setReturnValue(null);
    }


}
