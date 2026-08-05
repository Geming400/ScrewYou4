package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SpearUseGoal.SpearUseState.class)
public class SpearUseState268540574Mixin {
        @Inject(at = @At("HEAD"), method = "tickAndCheckFleeing()Z", cancellable = true)
    private void tickAndCheckFleeing_306819157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306819157L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startEngagement(I)V", cancellable = true)
    private void startEngagement_1482457546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482457546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickAndCheckEngagement()Z", cancellable = true)
    private void tickAndCheckEngagement_306819157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306819157L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "notEngagedYet()Z", cancellable = true)
    private void notEngagedYet_306819157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306819157L))
            info.setReturnValue(true);
    }


}
