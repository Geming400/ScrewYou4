package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SpearUseGoal.class)
public class SpearUseGoal2011915031Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_385749672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(385749672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__705948920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-705948920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1097474967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097474967L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1882231373(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882231373L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1322279737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322279737L))
            info.setReturnValue(false);
    }


}
