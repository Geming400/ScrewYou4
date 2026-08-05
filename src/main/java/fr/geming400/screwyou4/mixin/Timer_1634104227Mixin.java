package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.DeltaTracker.Timer.class)
public class Timer_1634104227Mixin {
        @Inject(at = @At("HEAD"), method = "getGameTimeDeltaTicks()F", cancellable = true)
    private void getGameTimeDeltaTicks_1672363589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672363589L))
            info.setReturnValue(4.591074E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRealtimeDeltaTicks()F", cancellable = true)
    private void getRealtimeDeltaTicks_1672363589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672363589L))
            info.setReturnValue(4.591074E8F);
    }

    @Inject(at = @At("HEAD"), method = "advanceGameTime(J)I", cancellable = true)
    private void advanceGameTime__1446035070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446035070L))
            info.setReturnValue(674709931);
    }

    @Inject(at = @At("HEAD"), method = "advanceRealTime(J)V", cancellable = true)
    private void advanceRealTime__1446022577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446022577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFrozenState(Z)V", cancellable = true)
    private void updateFrozenState__1431246241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1431246241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePauseState(Z)V", cancellable = true)
    private void updatePauseState__1431246241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1431246241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameTimeDeltaPartialTick(Z)F", cancellable = true)
    private void getGameTimeDeltaPartialTick__1431261617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431261617L))
            info.setReturnValue(4.591074E8F);
    }


}
