package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricsRegistry.class)
public class MetricsRegistry_1310171694Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/util/profiling/metrics/ProfilerMeasured;)V", cancellable = true)
    private void add_138579802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(138579802L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRegisteredSamplers()Ljava/util/List;", cancellable = true)
    private void getRegisteredSamplers__1358458787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358458787L))
            info.setReturnValue(null);
    }


}
