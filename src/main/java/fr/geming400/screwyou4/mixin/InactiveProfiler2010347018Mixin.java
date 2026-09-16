package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.InactiveProfiler.class)
public class InactiveProfiler2010347018Mixin {
        @Inject(at = @At("HEAD"), method = "getEntry(Ljava/lang/String;)Lnet/minecraft/util/profiling/ActiveProfiler$PathEntry;", cancellable = true)
    private void getEntry_1158222050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158222050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push__1106109717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1106109717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push_1789004909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1789004909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop__1684957940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1684957940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zone(Ljava/util/function/Supplier;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void zone_1742443520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742443520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zone(Ljava/lang/String;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void zone__840985314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840985314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush__801573732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801573732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__786278564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-786278564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__2054610183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2054610183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_1204293493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1204293493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1526320894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1526320894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults__98887489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98887489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1469448869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1469448869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChartedPaths()Ljava/util/Set;", cancellable = true)
    private void getChartedPaths__166960027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166960027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting__758134472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-758134472L))
            info.cancel();
    }


}
