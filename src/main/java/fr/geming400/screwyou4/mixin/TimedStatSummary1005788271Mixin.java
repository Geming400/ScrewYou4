package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.TimedStatSummary.class)
public class TimedStatSummary1005788271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_97162003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97162003L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1776211796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776211796L))
            info.setReturnValue("T5Gma6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1563140362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563140362L))
            info.setReturnValue(-1159087909);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__82382170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82382170L))
            info.setReturnValue(397573429);
    }

    @Inject(at = @At("HEAD"), method = "slowest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void slowest_1023377890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023377890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fastest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void fastest_518818791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518818791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/util/List;)Ljava/util/Optional;", cancellable = true)
    private static void summary_839059050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839059050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "secondSlowest()Lnet/minecraft/util/profiling/jfr/stats/TimedStat;", cancellable = true)
    private void secondSlowest__132038194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132038194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "percentilesNanos()Ljava/util/Map;", cancellable = true)
    private void percentilesNanos_518650286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518650286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalDuration()Ljava/time/Duration;", cancellable = true)
    private void totalDuration__1689773396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689773396L))
            info.setReturnValue(null);
    }


}
