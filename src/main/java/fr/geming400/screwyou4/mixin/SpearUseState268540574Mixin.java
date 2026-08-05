package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SpearUseGoal.SpearUseState.class)
public class SpearUseState268540574Mixin {
        @Inject(at = @At("HEAD"), method = "tickAndCheckFleeing()Z", cancellable = true)
    private void tickAndCheckFleeing_19579111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19579111L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "startEngagement(I)V", cancellable = true)
    private void startEngagement__1771211957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1771211957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "notEngagedYet()Z", cancellable = true)
    private void notEngagedYet__721863331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721863331L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickAndCheckEngagement()Z", cancellable = true)
    private void tickAndCheckEngagement_291711848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291711848L))
            info.setReturnValue(false);
    }


}
