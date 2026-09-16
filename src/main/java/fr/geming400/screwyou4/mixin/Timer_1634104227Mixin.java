package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.DeltaTracker.Timer.class)
public class Timer_1634104227Mixin {
        @Inject(at = @At("HEAD"), method = "getGameTimeDeltaPartialTick(Z)F", cancellable = true)
    private void getGameTimeDeltaPartialTick__726544534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726544534L))
            info.setReturnValue(2.915667E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGameTimeDeltaTicks()F", cancellable = true)
    private void getGameTimeDeltaTicks__1093385390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093385390L))
            info.setReturnValue(2.915667E8F);
    }

    @Inject(at = @At("HEAD"), method = "advanceGameTime(J)I", cancellable = true)
    private void advanceGameTime__1515630269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515630269L))
            info.setReturnValue(-959654378);
    }

    @Inject(at = @At("HEAD"), method = "advanceRealTime(J)V", cancellable = true)
    private void advanceRealTime__903190340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903190340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePauseState(Z)V", cancellable = true)
    private void updatePauseState__18787005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18787005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRealtimeDeltaTicks()F", cancellable = true)
    private void getRealtimeDeltaTicks_2090489414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090489414L))
            info.setReturnValue(2.915667E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateFrozenState(Z)V", cancellable = true)
    private void updateFrozenState_1982759335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1982759335L))
            info.cancel();
    }


}
