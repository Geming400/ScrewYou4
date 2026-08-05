package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RangedCrossbowAttackGoal.class)
public class RangedCrossbowAttackGoal1794159618Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__923704333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-923704333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_879719554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879719554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1664475960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1664475960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick__1761141928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761141928L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1104524324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104524324L))
            info.setReturnValue(false);
    }


}
