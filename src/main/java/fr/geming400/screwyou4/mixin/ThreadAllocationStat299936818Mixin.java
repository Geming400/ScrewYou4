package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ThreadAllocationStat.class)
public class ThreadAllocationStat299936818Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__608689450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608689450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1070360343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070360343L))
            info.setReturnValue("iVVsT;#8z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_857288909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857288909L))
            info.setReturnValue(991750440);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat;", cancellable = true)
    private static void from_779815138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779815138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp__1780342412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1780342412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "threadName()Ljava/lang/String;", cancellable = true)
    private void threadName_2007559600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007559600L))
            info.setReturnValue("N{X[%GZqT_=zuE\u8F90\uB3E7[\uA07F-N5Jv9\u07C25F*#'\u26EF0\uBF39|(U\uCFDD+?<;Mpx0]\uBDB8!GDoX\uB340tu\".Vt\u4085\u1099*\u1BA9ruI2:v\u3C8A\u687D\uF99F=%P{3\\");
    }

    @Inject(at = @At("HEAD"), method = "totalBytes()J", cancellable = true)
    private void totalBytes_1296810674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1296810674L))
            info.setReturnValue(-3642733842597124108L);
    }

    @Inject(at = @At("HEAD"), method = "summary(Ljava/util/List;)Lnet/minecraft/util/profiling/jfr/stats/ThreadAllocationStat$Summary;", cancellable = true)
    private static void summary_305060910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305060910L))
            info.setReturnValue(null);
    }


}
