package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ContinuousProfiler.class)
public class ContinuousProfiler456939310Mixin {
        @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_495217893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495217893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "enable()V", cancellable = true)
    private void enable_495214049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495214049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disable()V", cancellable = true)
    private void disable_495214049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495214049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults__901318237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901318237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFiller()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getFiller_1936982391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936982391L))
            info.setReturnValue(null);
    }


}
