package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.GcHeapStat.class)
public class GcHeapStat_669730992Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__238895277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238895277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1440154516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440154516L))
            info.setReturnValue("nUT%\"`U\u3AC6\u87A8\uB094hPR_^:8\u910Fps\uA081\u41AC2h+, A.\u89AB\u8D1D\uD34E`^%5Psk)W[1`aQi@\u2879U_rH\u90D9AB+I1u&!CqvRjd41=Y|3pHUZIn1Hoa$`Fx9A'w\uCC61Ui");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1227083082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227083082L))
            info.setReturnValue(-2025702858);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat;", cancellable = true)
    private static void from__1492476543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492476543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp__1410548239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410548239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timing()Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Timing;", cancellable = true)
    private void timing_487285984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487285984L))
            info.setReturnValue(net.minecraft.util.profiling.jfr.stats.GcHeapStat.Timing.BEFORE_GC);
    }

    @Inject(at = @At("HEAD"), method = "heapUsed()J", cancellable = true)
    private void heapUsed__777568211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777568211L))
            info.setReturnValue(-7323066766370864389L);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/time/Duration;Ljava/util/List;Ljava/time/Duration;I)Lnet/minecraft/util/profiling/jfr/stats/GcHeapStat$Summary;", cancellable = true)
    private static void summary__1197166396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197166396L))
            info.setReturnValue(null);
    }


}
