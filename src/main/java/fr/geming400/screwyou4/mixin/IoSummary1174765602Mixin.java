package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.IoSummary.class)
public class IoSummary1174765602Mixin {
        @Inject(at = @At("HEAD"), method = "getTotalCount()J", cancellable = true)
    private void getTotalCount__719479224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719479224L))
            info.setReturnValue(7329010109887978825L);
    }

    @Inject(at = @At("HEAD"), method = "largestSizeContributors()Ljava/util/List;", cancellable = true)
    private void largestSizeContributors__276743577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276743577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCountsPerSecond()D", cancellable = true)
    private void getCountsPerSecond_1405717708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405717708L))
            info.setReturnValue(7.078304006456243E8D);
    }

    @Inject(at = @At("HEAD"), method = "getSizePerSecond()D", cancellable = true)
    private void getSizePerSecond_1004155465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004155465L))
            info.setReturnValue(7.088301003033545E8D);
    }

    @Inject(at = @At("HEAD"), method = "getTotalSize()J", cancellable = true)
    private void getTotalSize_2146685050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146685050L))
            info.setReturnValue(-5095695339143873973L);
    }


}
