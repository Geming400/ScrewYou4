package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.GcHeapStat.Summary.class)
public class Summary1979924666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__929530371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-929530371L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_844464691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844464691L))
            info.setReturnValue("W9۬:*:SⳲb:b๑R(婪5*㕇쩴ࠔ\"-2fk$:ﱆf:pb䌞䉌t8Y揞㌨HvN[qJhO`=)W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2018187408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018187408L))
            info.setReturnValue(1865659046);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration__1051877889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051877889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalGCs()I", cancellable = true)
    private void totalGCs_2018186912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018186912L))
            info.setReturnValue(468251041);
    }

    @Inject(at = @At("HEAD"), method = "gcOverHead()F", cancellable = true)
    private void gcOverHead_2018184029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018184029L))
            info.setReturnValue(2.035115E8F);
    }

    @Inject(at = @At("HEAD"), method = "gcTotalDuration()Ljava/time/Duration;", cancellable = true)
    private void gcTotalDuration__1051877889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051877889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allocationRateBytesPerSecond()D", cancellable = true)
    private void allocationRateBytesPerSecond_2018182107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018182107L))
            info.setReturnValue(2.0351150080731806E8D);
    }


}
