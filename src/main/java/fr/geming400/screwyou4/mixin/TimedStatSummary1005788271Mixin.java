package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.TimedStatSummary.class)
public class TimedStatSummary1005788271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1903666766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903666766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__129671704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-129671704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1044051013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044051013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_1044050517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044050517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/util/List;)Ljava/util/Optional;", cancellable = true)
    private static void summary_852720836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852720836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fastest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void fastest_377465789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377465789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slowest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void slowest_377465789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377465789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalDuration()Ljava/time/Duration;", cancellable = true)
    private void totalDuration__2026014284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026014284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondSlowest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void secondSlowest_377465789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377465789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "percentilesNanos()Ljava/util/Map;", cancellable = true)
    private void percentilesNanos__998835369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998835369L))
            info.setReturnValue(null);
    }


}
