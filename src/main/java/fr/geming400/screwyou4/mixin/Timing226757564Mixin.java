package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.GcHeapStat.Timing.class)
public class Timing226757564Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Timing;", cancellable = true)
    private static void values__694110286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694110286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Timing;", cancellable = true)
    private static void valueOf__1613284231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1613284231L))
            info.setReturnValue(net.minecraft.util.profiling.jfr.stats.GcHeapStat.Timing.BEFORE_GC);
    }


}
