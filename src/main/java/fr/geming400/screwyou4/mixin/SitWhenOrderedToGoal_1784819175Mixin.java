package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SitWhenOrderedToGoal.class)
public class SitWhenOrderedToGoal_1784819175Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_158653815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(158653815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__933044777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-933044777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_870379110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870379110L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1095183880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095183880L))
            info.setReturnValue(false);
    }


}
