package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.TickRateManager.class)
public class TickRateManager2122967714Mixin {
        @Inject(at = @At("HEAD"), method = "isFrozen()Z", cancellable = true)
    private void isFrozen__2133720999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133720999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__2133724843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2133724843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "frozenTicksToRun()I", cancellable = true)
    private void frozenTicksToRun__2133737336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133737336L))
            info.setReturnValue(-972702485);
    }

    @Inject(at = @At("HEAD"), method = "setFrozen(Z)V", cancellable = true)
    private void setFrozen__942382753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-942382753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runsNormally()Z", cancellable = true)
    private void runsNormally__2133720999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133720999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isEntityFrozen(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isEntityFrozen_1671246898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671246898L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tickrate()F", cancellable = true)
    private void tickrate__2133740219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133740219L))
            info.setReturnValue(7.579389E8F);
    }

    @Inject(at = @At("HEAD"), method = "millisecondsPerTick()F", cancellable = true)
    private void millisecondsPerTick__2133740219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133740219L))
            info.setReturnValue(7.579389E8F);
    }

    @Inject(at = @At("HEAD"), method = "nanosecondsPerTick()J", cancellable = true)
    private void nanosecondsPerTick__2133736375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133736375L))
            info.setReturnValue(9002622962091357930L);
    }

    @Inject(at = @At("HEAD"), method = "setFrozenTicksToRun(I)V", cancellable = true)
    private void setFrozenTicksToRun__958082610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-958082610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTickRate(F)V", cancellable = true)
    private void setTickRate__960853173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-960853173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSteppingForward()Z", cancellable = true)
    private void isSteppingForward__2133720999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133720999L))
            info.setReturnValue(true);
    }


}
