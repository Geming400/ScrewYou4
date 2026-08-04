package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MeleeAttackGoal.class)
public class MeleeAttackGoal1262857377Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1301132116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1301132116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1301132116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1301132116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1301135960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301135960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1301132116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1301132116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1301135960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301135960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1301135960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301135960L))
            info.setReturnValue(null);
    }


}
