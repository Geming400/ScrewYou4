package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.ProfilerFiller.CombinedProfileFiller.class)
public class CombinedProfileFiller1131326471Mixin {
        @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push__1985130264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985130264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push_909984362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909984362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_1730988809(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1730988809L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush__1680594279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1680594279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__1665299111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1665299111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_325272946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(325272946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter_1361336566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1361336566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_647300347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647300347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_590428322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590428322L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZoneColor(I)V", cancellable = true)
    private void setZoneColor__136669112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-136669112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting__1637155019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1637155019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneValue(J)V", cancellable = true)
    private void addZoneValue_745155896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(745155896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneText(Ljava/lang/String;)V", cancellable = true)
    private void addZoneText_611781322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611781322L))
            info.cancel();
    }


}
