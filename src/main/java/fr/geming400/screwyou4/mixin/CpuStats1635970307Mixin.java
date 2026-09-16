package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ServerMetricsSamplersProvider.CpuStats.class)
public class CpuStats1635970307Mixin {
        @Inject(at = @At("HEAD"), method = "loadForCpu(I)D", cancellable = true)
    private void loadForCpu_1775831426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775831426L))
            info.setReturnValue(5.2525370050193655E8D);
    }


}
