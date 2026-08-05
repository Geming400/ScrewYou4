package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveTowardsRestrictionGoal.class)
public class MoveTowardsRestrictionGoal_933168534Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_971443272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(971443272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_971447116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971447116L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_971447116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971447116L))
            info.setReturnValue(true);
    }


}
