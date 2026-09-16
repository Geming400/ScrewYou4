package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.TracyZoneFiller.class)
public class TracyZoneFiller1661127047Mixin {
        @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push__1455329688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1455329688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push_1439784938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1439784938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop__2034177911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2034177911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__1135498535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1135498535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush__1150793703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1150793703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter_1891137142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1891137142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_855073522(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(855073522L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1177100923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177100923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1120228898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1120228898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZoneColor(I)V", cancellable = true)
    private void setZoneColor_393131464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(393131464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting__1107354443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1107354443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneValue(J)V", cancellable = true)
    private void addZoneValue_1274956472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1274956472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneText(Ljava/lang/String;)V", cancellable = true)
    private void addZoneText_1141581898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1141581898L))
            info.cancel();
    }


}
