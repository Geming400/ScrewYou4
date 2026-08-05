package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveTowardsTargetGoal.class)
public class MoveTowardsTargetGoal268506497Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_306781236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(306781236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_306781236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(306781236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_306785080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306785080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_306785080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(306785080L))
            info.setReturnValue(true);
    }


}
