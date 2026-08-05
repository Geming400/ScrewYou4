package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ActiveMetricsRecorder.class)
public class ActiveMetricsRecorder_621484947Mixin {
        @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end_659760677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659760677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_659760677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659760677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sampleDuringExtract()V", cancellable = true)
    private void sampleDuringExtract_659759685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659759685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_659759685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659759685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_659759685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659759685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStarted(Lnet/minecraft/util/profiling/metrics/MetricsSamplerProvider;Ljava/util/function/LongSupplier;Ljava/util/concurrent/Executor;Lnet/minecraft/util/profiling/metrics/storage/MetricsPersister;Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Lnet/minecraft/util/profiling/metrics/profiling/ActiveMetricsRecorder;", cancellable = true)
    private static void createStarted_52182116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52182116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerGlobalCompletionCallback(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void registerGlobalCompletionCallback_1302501607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302501607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRecording()Z", cancellable = true)
    private void isRecording_659763529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659763529L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProfiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getProfiler_2101528027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101528027L))
            info.setReturnValue(null);
    }


}
