package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.InactiveProfiler.class)
public class InactiveProfiler2010347018Mixin {
        @Inject(at = @At("HEAD"), method = "getEntry(Ljava/lang/String;)Lnet/minecraft/util/profiling/ActiveProfiler$PathEntry;", cancellable = true)
    private void getEntry_1526140446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526140446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push__1132259129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1132259129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push_767930961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(767930961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_2048621757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2048621757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zone(Ljava/util/function/Supplier;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void zone_716670548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716670548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zone(Ljava/lang/String;)Lnet/minecraft/util/profiling/Zone;", cancellable = true)
    private void zone__1903964342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903964342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter__2117412318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2117412318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__893762964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-893762964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_2048621757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2048621757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush_767930961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(767930961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__1132259129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1132259129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_2048621757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2048621757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults_652089471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652089471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChartedPaths()Ljava/util/Set;", cancellable = true)
    private void getChartedPaths_181311532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181311532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting_1792409368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792409368L))
            info.cancel();
    }


}
