package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ThreadAllocationStat.class)
public class ThreadAllocationStat299936818Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1685449077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685449077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__835523157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835523157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_338199560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338199560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat;", cancellable = true)
    private static void from_1668002636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668002636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp_1397171018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397171018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threadName()Ljava/lang/String;", cancellable = true)
    private void threadName__835523653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835523653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/util/List;)Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat$Summary;", cancellable = true)
    private static void summary_865438996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865438996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalBytes()J", cancellable = true)
    private void totalBytes_338200025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338200025L))
            info.setReturnValue(null);
    }


}
