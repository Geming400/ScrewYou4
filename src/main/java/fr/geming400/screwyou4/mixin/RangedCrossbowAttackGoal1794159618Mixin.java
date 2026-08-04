package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedCrossbowAttackGoal.class)
public class RangedCrossbowAttackGoal1794159618Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1832434357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832434357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1832438201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832438201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1832434357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832434357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1832438201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832438201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1832438201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832438201L))
            info.setReturnValue(null);
    }


}
