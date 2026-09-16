package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.InactiveMetricsRecorder.class)
public class InactiveMetricsRecorder_2094971160Mixin {
        @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end__527464497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-527464497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_470322576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470322576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1554073010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1554073010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sampleDuringExtract()V", cancellable = true)
    private void sampleDuringExtract_175974420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(175974420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProfiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getProfiler__694075423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694075423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRecording()Z", cancellable = true)
    private void isRecording_379578183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379578183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1610945035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1610945035L))
            info.cancel();
    }


}
