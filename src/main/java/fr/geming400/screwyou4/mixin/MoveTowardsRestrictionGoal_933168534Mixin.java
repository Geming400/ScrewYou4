package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveTowardsRestrictionGoal.class)
public class MoveTowardsRestrictionGoal_933168534Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__692996826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-692996826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_18728469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18728469L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_243533239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243533239L))
            info.setReturnValue(true);
    }


}
