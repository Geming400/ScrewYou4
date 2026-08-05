package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.SingleTickProfiler.class)
public class SingleTickProfiler1080929956Mixin {
        @Inject(at = @At("HEAD"), method = "createTickProfiler(Ljava/lang/String;)Lnet/minecraft/util/profiling/SingleTickProfiler;", cancellable = true)
    private static void createTickProfiler_804238074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804238074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateFiller(Lnet/minecraft/util/profiling/ProfilerFiller;Lnet/minecraft/util/profiling/SingleTickProfiler;)Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private static void decorateFiller__645992784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645992784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startTick()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void startTick__1733994259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733994259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1119204695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1119204695L))
            info.cancel();
    }


}
