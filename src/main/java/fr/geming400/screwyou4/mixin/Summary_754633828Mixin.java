package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.ThreadAllocationStat.Summary.class)
public class Summary_754633828Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__153992441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153992441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1525057352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525057352L))
            info.setReturnValue("1[?>\u3269B7>.sSU<\uC64A}`py;:mYQ'L\u80D3_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1311985918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311985918L))
            info.setReturnValue(1281982296);
    }

    @Inject(at = @At("HEAD"), method = "allocationsPerSecondByThread()Ljava/util/Map;", cancellable = true)
    private void allocationsPerSecondByThread__1916820500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916820500L))
            info.setReturnValue(null);
    }


}
