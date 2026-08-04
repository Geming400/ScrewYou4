package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.DolphinJumpGoal.class)
public class DolphinJumpGoal336392945Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_374667684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(374667684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_374667684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(374667684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_374671528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374671528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_374667684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(374667684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_374671528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374671528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_374671528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374671528L))
            info.setReturnValue(null);
    }


}
