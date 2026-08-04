package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedBowAttackGoal.class)
public class RangedBowAttackGoal690513712Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_728788451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(728788451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_728788451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(728788451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_728792295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728792295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_728788451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(728788451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinAttackInterval(I)V", cancellable = true)
    private void setMinAttackInterval_1904430684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1904430684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_728792295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728792295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_728792295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728792295L))
            info.setReturnValue(null);
    }


}
