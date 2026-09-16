package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.profiling.ActiveMetricsRecorder.class)
public class ActiveMetricsRecorder_621484947Mixin {
        @Inject(at = @At("HEAD"), method = "end()V", cancellable = true)
    private void end__2000949718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2000949718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel__1003162645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1003162645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStarted(Lnet/minecraft/util/profiling/metrics/MetricsSamplerProvider;Ljava/util/function/LongSupplier;Ljava/util/concurrent/Executor;Lnet/minecraft/util/profiling/metrics/storage/MetricsPersister;Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Lnet/minecraft/util/profiling/metrics/profiling/ActiveMetricsRecorder;", cancellable = true)
    private static void createStarted_181819465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181819465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampleDuringExtract()V", cancellable = true)
    private void sampleDuringExtract__1297511793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297511793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProfiler()Lnet/minecraft/util/profiling/ProfilerFiller;", cancellable = true)
    private void getProfiler_2127405660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127405660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRecording()Z", cancellable = true)
    private void isRecording__1093908030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093908030L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_137458822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(137458822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_80586797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(80586797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerGlobalCompletionCallback(Ljava/util/function/Consumer;)V", cancellable = true)
    private static void registerGlobalCompletionCallback_1184332334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1184332334L))
            info.cancel();
    }


}
