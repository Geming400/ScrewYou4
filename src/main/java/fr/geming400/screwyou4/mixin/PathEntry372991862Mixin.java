package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ActiveProfiler.PathEntry.class)
public class PathEntry372991862Mixin {
        @Inject(at = @At("HEAD"), method = "getCount()J", cancellable = true)
    private void getCount__1012926108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012926108L))
            info.setReturnValue(5344473350883123855L);
    }

    @Inject(at = @At("HEAD"), method = "getDuration()J", cancellable = true)
    private void getDuration__657191853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657191853L))
            info.setReturnValue(5321985745977200000L);
    }

    @Inject(at = @At("HEAD"), method = "getMaxDuration()J", cancellable = true)
    private void getMaxDuration__366926725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366926725L))
            info.setReturnValue(-5808139101162731013L);
    }

    @Inject(at = @At("HEAD"), method = "getCounters()Lit/unimi/dsi/fastutil/objects/Object2LongMap;", cancellable = true)
    private void getCounters_1625690036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625690036L))
            info.setReturnValue(null);
    }


}
