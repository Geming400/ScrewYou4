package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.GcHeapStat.Summary.class)
public class Summary1979924666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1071298398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071298398L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1544619105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544619105L))
            info.setReturnValue("!l\uB18CbW_KYmM\uD128 3Yuf?F+ j\uAC0A_m`K\u0A51%5*Hx]\u85A8hz\u0840*!=ej\u9825sor*{vQ#\u0BF9&\uBB1Cj\u190E-`\u7670&#vr*quxDH)zs6`U\u1266:f4\uB651h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1757690539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757690539L))
            info.setReturnValue(1334477194);
    }

    @Inject(at = @At("HEAD"), method = "duration()Ljava/time/Duration;", cancellable = true)
    private void duration__1314426989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314426989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gcTotalDuration()Ljava/time/Duration;", cancellable = true)
    private void gcTotalDuration__491529349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491529349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gcOverHead()F", cancellable = true)
    private void gcOverHead_177136525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177136525L))
            info.setReturnValue(5.480611E8F);
    }

    @Inject(at = @At("HEAD"), method = "totalGCs()I", cancellable = true)
    private void totalGCs__503926483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503926483L))
            info.setReturnValue(-1424279738);
    }

    @Inject(at = @At("HEAD"), method = "allocationRateBytesPerSecond()D", cancellable = true)
    private void allocationRateBytesPerSecond_2090961365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090961365L))
            info.setReturnValue(5.480611000276524E8D);
    }


}
