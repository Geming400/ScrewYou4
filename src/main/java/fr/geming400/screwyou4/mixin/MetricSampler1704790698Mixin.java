package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.MetricSampler.class)
public class MetricSampler1704790698Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__184056204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184056204L))
            info.setReturnValue("iMG(}\u8444HjuJ>r=zB-3`*\u6426^zXX'c*tLI\u4776BDr\uF975\u3882ekzg3$|1q7wkW!F");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_796163934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796163934L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2032825003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032825003L))
            info.setReturnValue(1105344186);
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/ToDoubleFunction;Ljava/lang/Object;)Lnet/minecraft/util/profiling/metrics/MetricSampler$MetricSamplerBuilder;", cancellable = true)
    private static void builder__1867211659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867211659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "result()Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplerResult;", cancellable = true)
    private void result_235390570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235390570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/DoubleSupplier;)Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private static void create_968723408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968723408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onStartTick()V", cancellable = true)
    private void onStartTick_2005994333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2005994333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onFinished()V", cancellable = true)
    private void onFinished_1327213708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1327213708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCategory()Lnet/minecraft/util/profiling/metrics/MetricCategory;", cancellable = true)
    private void getCategory__314970754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314970754L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricCategory.EVENT_LOOPS);
    }

    @Inject(at = @At("HEAD"), method = "triggersThreshold()Z", cancellable = true)
    private void triggersThreshold__1605414543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605414543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "samplingPhase()Lnet/minecraft/util/profiling/metrics/MetricSampler$SamplingPhase;", cancellable = true)
    private void samplingPhase__2065673998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065673998L))
            info.setReturnValue(net.minecraft.util.profiling.metrics.MetricSampler.SamplingPhase.END_TICK);
    }

    @Inject(at = @At("HEAD"), method = "onEndTick(I)V", cancellable = true)
    private void onEndTick__1294135985(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1294135985L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSampler()Ljava/util/function/DoubleSupplier;", cancellable = true)
    private void getSampler_903253064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903253064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createExtractSampler(Ljava/lang/String;Lnet/minecraft/util/profiling/metrics/MetricCategory;Ljava/util/function/DoubleSupplier;)Lnet/minecraft/util/profiling/metrics/MetricSampler;", cancellable = true)
    private static void createExtractSampler_242417015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242417015L))
            info.setReturnValue(null);
    }


}
