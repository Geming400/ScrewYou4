package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricCategory.class)
public class MetricCategory_926102774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private static void values__826164034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826164034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private static void valueOf_505354135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505354135L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricCategory.CONSECUTIVE_EXECUTORS);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Ljava/lang/String;", cancellable = true)
    private void getDescription_1100629700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100629700L))
            info.setReturnValue("\u8134n`c\uA4443\uC827\uA5C4xBxn\u5384s>a6#.x@\u5504vSJkR%.&\uD521O");
    }


}
