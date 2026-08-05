package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.SingleTickProfiler.class)
public class SingleTickProfiler1080929956Mixin {
        @Inject(at = @At("HEAD"), method = "createTickProfiler(Ljava/lang/String;)Lnet/minecraft/util/profiling/SingleTickProfiler;", cancellable = true)
    private static void createTickProfiler_2064127224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064127224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateFiller(Lnet/minecraft/util/profiling/ProfilerFiller;Lnet/minecraft/util/profiling/SingleTickProfiler;)Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private static void decorateFiller__533396941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533396941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_540031807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540031807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void startTick__442364498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442364498L))
            info.setReturnValue(null);
    }


}
