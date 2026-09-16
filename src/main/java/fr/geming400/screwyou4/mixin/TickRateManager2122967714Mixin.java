package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.TickRateManager.class)
public class TickRateManager2122967714Mixin {
        @Inject(at = @At("HEAD"), method = "isFrozen()Z", cancellable = true)
    private void isFrozen__1373622737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373622737L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1993284056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1993284056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runsNormally()Z", cancellable = true)
    private void runsNormally_178409917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178409917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEntityFrozen(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isEntityFrozen__1577098785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577098785L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFrozen(Z)V", cancellable = true)
    private void setFrozen_149457281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(149457281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nanosecondsPerTick()J", cancellable = true)
    private void nanosecondsPerTick_2086872346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086872346L))
            info.setReturnValue(7768643964763991663L);
    }

    @Inject(at = @At("HEAD"), method = "isSteppingForward()Z", cancellable = true)
    private void isSteppingForward__75525540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75525540L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "millisecondsPerTick()F", cancellable = true)
    private void millisecondsPerTick__1764294563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764294563L))
            info.setReturnValue(1742600.9F);
    }

    @Inject(at = @At("HEAD"), method = "frozenTicksToRun()I", cancellable = true)
    private void frozenTicksToRun_1566531790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566531790L))
            info.setReturnValue(-1338544718);
    }

    @Inject(at = @At("HEAD"), method = "tickrate()F", cancellable = true)
    private void tickrate_1923654504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923654504L))
            info.setReturnValue(1742600.5F);
    }

    @Inject(at = @At("HEAD"), method = "setTickRate(F)V", cancellable = true)
    private void setTickRate_1025602218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025602218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFrozenTicksToRun(I)V", cancellable = true)
    private void setFrozenTicksToRun_404573514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(404573514L))
            info.cancel();
    }


}
