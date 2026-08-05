package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ActiveProfiler.class)
public class ActiveProfiler1969949541Mixin {
        @Inject(at = @At("HEAD"), method = "getEntry(Ljava/lang/String;)Lnet/minecraft/util/profiling/ActiveProfiler$PathEntry;", cancellable = true)
    private void getEntry_1117824573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117824573L))
            info.setReturnValue(new net.minecraft.util.profiling.ActiveProfiler.PathEntry());
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push__1146507194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1146507194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push_1748607432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1748607432L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop__1725355417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1725355417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResults()Lnet/minecraft/util/profiling/ProfileResults;", cancellable = true)
    private void getResults__139284966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139284966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1429051392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1429051392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__2095007660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2095007660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_1163896016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1163896016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush__841971209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-841971209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__826676041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-826676041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1485923417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485923417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting__798531949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-798531949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChartedPaths()Ljava/util/Set;", cancellable = true)
    private void getChartedPaths__207357504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207357504L))
            info.setReturnValue(null);
    }


}
