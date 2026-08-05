package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveTowardsTargetGoal.class)
public class MoveTowardsTargetGoal268506497Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1357658862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1357658862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1845609842(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1845609842L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__645933567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645933567L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__421128797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421128797L))
            info.setReturnValue(true);
    }


}
