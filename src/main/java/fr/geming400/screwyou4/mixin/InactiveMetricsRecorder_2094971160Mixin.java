package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.InactiveMetricsRecorder.class)
public class InactiveMetricsRecorder_2094971160Mixin {
        @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end_2133245898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133245898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_2133245898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133245898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sampleDuringExtract()V", cancellable = true)
    private void sampleDuringExtract_2133245898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133245898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_2133245898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133245898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_2133245898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2133245898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRecording()Z", cancellable = true)
    private void isRecording_2133249742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133249742L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProfiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getProfiler__719953056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719953056L))
            info.setReturnValue(null);
    }


}
