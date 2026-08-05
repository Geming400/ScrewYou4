package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ActiveProfiler.class)
public class ActiveProfiler1969949541Mixin {
        @Inject(at = @At("HEAD"), method = "getEntry(Ljava/lang/String;)Lnet/minecraft/util/profiling/ActiveProfiler$PathEntry;", cancellable = true)
    private void getEntry_1485742969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485742969L))
            info.setReturnValue(new net.minecraft.util.profiling.ActiveProfiler$PathEntry());
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push_727533484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727533484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push__1172656606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172656606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_2008224280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008224280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting_1752011891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1752011891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChartedPaths()Ljava/util/Set;", cancellable = true)
    private void getChartedPaths_140914055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140914055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults_611691994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611691994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_2008224280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008224280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__1172656606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1172656606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush_727533484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727533484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__934160441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934160441L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_2137157501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2137157501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_2008224280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008224280L))
            info.cancel();
    }


}
