package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.TickTimeStat.class)
public class TickTimeStat_1134440270Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1775014768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775014768L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1019706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019706L))
            info.setReturnValue("dRv\u73FF\uBAED]\"AoSx@\u896C5QgpV]<`F2#)\u0759sxPuk\uD6C9Z;I%=Oy\u2FA2=g/Y4u\u1E1F0&g3\u7B98Hc1 L'`V?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1172703011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172703011L))
            info.setReturnValue(-344930602);
    }

    @Inject(at = @At("HEAD"), method = "from(Ljdk/jfr/consumer/RecordedEvent;)Lnet/minecraft/util/profiling/jfr/stats/TickTimeStat;", cancellable = true)
    private static void from__1589849625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589849625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()Ljava/time/Instant;", cancellable = true)
    private void timestamp__2063292827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063292827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentAverage()Ljava/time/Duration;", cancellable = true)
    private void currentAverage__1897362286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897362286L))
            info.setReturnValue(null);
    }


}
