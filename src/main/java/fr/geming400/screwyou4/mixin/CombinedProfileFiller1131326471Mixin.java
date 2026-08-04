package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ProfilerFiller.CombinedProfileFiller.class)
public class CombinedProfileFiller1131326471Mixin {
        @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push__111089586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-111089586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push__2011279676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011279676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_1169601210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1169601210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_1298534431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1298534431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__1772783511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1772783511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1169601210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1169601210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush__111089586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-111089586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__2011279676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011279676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1169601210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1169601210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZoneColor(I)V", cancellable = true)
    private void setZoneColor__1949723853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1949723853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting_913388821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(913388821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneValue(J)V", cancellable = true)
    private void addZoneValue__1948800332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1948800332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneText(Ljava/lang/String;)V", cancellable = true)
    private void addZoneText__2011279676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011279676L))
            info.cancel();
    }


}
