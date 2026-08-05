package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FloatGoal.class)
public class FloatGoal1934563489Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1972842072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972842072L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1972838228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972838228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1972842072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972842072L))
            info.setReturnValue(false);
    }


}
