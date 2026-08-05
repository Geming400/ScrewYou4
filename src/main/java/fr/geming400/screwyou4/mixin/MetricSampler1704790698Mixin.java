package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.class)
public class MetricSampler1704790698Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_569330227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569330227L))
            info.setReturnValue("u4=sYhjF_{#]*\u6ABC\u466B*\u6E46NA6\uC46D\u4FD6M$\u454B_fX\u7743{\uB99FI.]\u230C`'fd9\u7C18");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1204664835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204664835L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1743052944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743052944L))
            info.setReturnValue(226059930);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/ToDoubleFunction;Ljava/lang/Object;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private static void builder__1336884496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336884496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplerResult;", cancellable = true)
    private void result_2071769101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071769101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/DoubleSupplier;)Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private static void create_92203476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92203476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onStartTick()V", cancellable = true)
    private void onStartTick_1743065437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743065437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createExtractSampler(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/DoubleSupplier;)Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private static void createExtractSampler_92203476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92203476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private void getCategory_1754475890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754475890L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricCategory.CHUNK_RENDERING_DISPATCHING);
    }

    @Inject(at = @At("HEAD"), method = "onEndTick(I)V", cancellable = true)
    private void onEndTick__1376259626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1376259626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFinished()V", cancellable = true)
    private void onFinished_1743065437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1743065437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSampler()Ljava/util/function/DoubleSupplier;", cancellable = true)
    private void getSampler__201338790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201338790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggersThreshold()Z", cancellable = true)
    private void triggersThreshold_1743069281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743069281L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "samplingPhase()Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private void samplingPhase_979664414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979664414L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricSampler.SamplingPhase.EXTRACT);
    }


}
