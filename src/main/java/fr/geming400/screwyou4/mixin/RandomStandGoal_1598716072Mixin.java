package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomStandGoal.class)
public class RandomStandGoal_1598716072Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1636990810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636990810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1636994654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636994654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1636994654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636994654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1636994654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636994654L))
            info.setReturnValue(null);
    }


}
