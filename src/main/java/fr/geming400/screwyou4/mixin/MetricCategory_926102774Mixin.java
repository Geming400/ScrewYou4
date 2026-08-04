package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricCategory.class)
public class MetricCategory_926102774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private static void values__1587204580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587204580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private static void valueOf_797303743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797303743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Ljava/lang/String;", cancellable = true)
    private void getDescription__209357698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-209357698L))
            info.setReturnValue(null);
    }


}
