package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.stats.IoSummary.class)
public class IoSummary1174765602Mixin {
        @Inject(at = @At("HEAD"), method = "getTotalCount()J", cancellable = true)
    private void getTotalCount_1213028809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213028809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSizePerSecond()D", cancellable = true)
    private void getSizePerSecond_1213023043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213023043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalSize()J", cancellable = true)
    private void getTotalSize_1213028809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213028809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCountsPerSecond()D", cancellable = true)
    private void getCountsPerSecond_1213023043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213023043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "largestSizeContributors()Ljava/util/List;", cancellable = true)
    private void largestSizeContributors__1493864878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493864878L))
            info.setReturnValue(null);
    }


}
