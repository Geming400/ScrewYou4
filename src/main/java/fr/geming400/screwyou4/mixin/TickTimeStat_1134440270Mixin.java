package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.TickTimeStat.class)
public class TickTimeStat_1134440270Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_225814001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225814001L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1904863794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904863794L))
            info.setReturnValue("\u335FsSx\u7BFEYjLa$vVVbb[[0\u3D24");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1691792360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691792360L))
            info.setReturnValue(1384444611);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/TickTimeStat;", cancellable = true)
    private static void from__2136072835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136072835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp__945838961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945838961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentAverage()Ljava/time/Duration;", cancellable = true)
    private void currentAverage_1775628022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775628022L))
            info.setReturnValue(null);
    }


}
