package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.EatBlockGoal.class)
public class EatBlockGoal_1537131778Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1575406516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1575406516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1575406516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1575406516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1575410360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575410360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1575406516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1575406516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEatAnimationTick()I", cancellable = true)
    private void getEatAnimationTick_1575394023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575394023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1575410360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575410360L))
            info.setReturnValue(null);
    }


}
