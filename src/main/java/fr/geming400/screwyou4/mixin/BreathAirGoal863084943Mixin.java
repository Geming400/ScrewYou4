package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreathAirGoal.class)
public class BreathAirGoal863084943Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_901359682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(901359682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_901363526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901363526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_901359682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(901359682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_901363526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901363526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_901363526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901363526L))
            info.setReturnValue(null);
    }


}
