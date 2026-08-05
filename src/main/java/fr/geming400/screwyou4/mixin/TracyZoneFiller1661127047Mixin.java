package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.TracyZoneFiller.class)
public class TracyZoneFiller1661127047Mixin {
        @Inject(at = @At("HEAD"), method = "push(Ljava/util/function/Supplier;)V", cancellable = true)
    private void push_418710990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(418710990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Ljava/lang/String;)V", cancellable = true)
    private void push__1481479100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481479100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pop()V", cancellable = true)
    private void pop_1699401786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699401786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTick()V", cancellable = true)
    private void startTick_1699401786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699401786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/lang/String;I)V", cancellable = true)
    private void incrementCounter__1242982935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1242982935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "incrementCounter(Ljava/util/function/Supplier;I)V", cancellable = true)
    private void incrementCounter_1828335007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1828335007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/lang/String;)V", cancellable = true)
    private void popPush__1481479100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481479100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popPush(Ljava/util/function/Supplier;)V", cancellable = true)
    private void popPush_418710990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(418710990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endTick()V", cancellable = true)
    private void endTick_1699401786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699401786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneValue(J)V", cancellable = true)
    private void addZoneValue__1418999756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418999756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markForCharting(Lnet/minecraft/util/profiling/metrics/MetricCategory;)V", cancellable = true)
    private void markForCharting_1443189397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1443189397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setZoneColor(I)V", cancellable = true)
    private void setZoneColor__1419923277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1419923277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addZoneText(Ljava/lang/String;)V", cancellable = true)
    private void addZoneText__1481479100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481479100L))
            info.cancel();
    }


}
