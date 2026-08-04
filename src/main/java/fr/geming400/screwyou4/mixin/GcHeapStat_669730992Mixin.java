package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.GcHeapStat.class)
public class GcHeapStat_669730992Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2055243250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055243250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__465728984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465728984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_707993733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707993733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat;", cancellable = true)
    private static void from__575708053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575708053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp_1766965191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766965191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/time/Duration;Ljava/util/List;Ljava/time/Duration;I)Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Summary;", cancellable = true)
    private static void summary_1908499230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908499230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heapUsed()J", cancellable = true)
    private void heapUsed_707994198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707994198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timing()Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Timing;", cancellable = true)
    private void timing__1297729002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297729002L))
            info.setReturnValue(null);
    }


}
