package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedAttackGoal.class)
public class RangedAttackGoal1878731352Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1917006091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1917006091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1917009935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917009935L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1917006091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1917006091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1917009935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917009935L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1917009935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1917009935L))
            info.setReturnValue(true);
    }


}
