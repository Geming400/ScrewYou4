package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MeleeAttackGoal.class)
public class MeleeAttackGoal1262857377Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__363307982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-363307982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1455006574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1455006574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_348417313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348417313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1133173719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1133173719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_2002523127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002523127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_573222083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573222083L))
            info.setReturnValue(true);
    }


}
