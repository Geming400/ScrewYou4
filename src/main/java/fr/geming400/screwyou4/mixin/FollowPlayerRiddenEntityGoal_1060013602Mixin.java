package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowPlayerRiddenEntityGoal.class)
public class FollowPlayerRiddenEntityGoal_1060013602Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1098288340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1098288340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1098288340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1098288340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1098292184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098292184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1098288340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1098288340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_1098292184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098292184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1098292184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098292184L))
            info.setReturnValue(null);
    }


}
