package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ContinuousProfiler.class)
public class ContinuousProfiler456939310Mixin {
        @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1577208690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577208690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enable()V", cancellable = true)
    private void enable__1024904642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1024904642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disable()V", cancellable = true)
    private void disable__581972999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-581972999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFiller()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getFiller__1194958383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194958383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults__1652295197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652295197L))
            info.setReturnValue(null);
    }


}
