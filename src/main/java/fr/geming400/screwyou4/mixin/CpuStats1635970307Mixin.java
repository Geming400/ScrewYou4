package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ServerMetricsSamplersProvider.CpuStats.class)
public class CpuStats1635970307Mixin {
        @Inject(at = @At("HEAD"), method = "loadForCpu(I)D", cancellable = true)
    private void loadForCpu__1445097315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445097315L))
            info.setReturnValue(4.962870011781252E7D);
    }


}
