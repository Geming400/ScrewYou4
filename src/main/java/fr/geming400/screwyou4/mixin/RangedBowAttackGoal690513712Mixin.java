package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedBowAttackGoal.class)
public class RangedBowAttackGoal690513712Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__935651647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-935651647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__2027350239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2027350239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__223926352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223926352L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_560830054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(560830054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1430179462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430179462L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_878418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878418L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setMinAttackInterval(I)V", cancellable = true)
    private void setMinAttackInterval__532827527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-532827527L))
            info.cancel();
    }


}
