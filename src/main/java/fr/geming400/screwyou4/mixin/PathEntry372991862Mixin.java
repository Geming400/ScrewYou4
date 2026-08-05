package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ActiveProfiler.PathEntry.class)
public class PathEntry372991862Mixin {
        @Inject(at = @At("HEAD"), method = "getCount()J", cancellable = true)
    private void getCount_411255069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411255069L))
            info.setReturnValue(4183643083359953311L);
    }

    @Inject(at = @At("HEAD"), method = "getDuration()J", cancellable = true)
    private void getDuration_411255069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411255069L))
            info.setReturnValue(4183643083359953311L);
    }

    @Inject(at = @At("HEAD"), method = "getMaxDuration()J", cancellable = true)
    private void getMaxDuration_411255069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411255069L))
            info.setReturnValue(4183643083359953311L);
    }

    @Inject(at = @At("HEAD"), method = "getCounters()Lit/unimi/dsi/fastutil/objects/Object2LongMap;", cancellable = true)
    private void getCounters__1647018617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647018617L))
            info.setReturnValue(null);
    }


}
