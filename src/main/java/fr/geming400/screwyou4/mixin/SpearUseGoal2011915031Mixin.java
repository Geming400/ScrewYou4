package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SpearUseGoal.class)
public class SpearUseGoal2011915031Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_2050189770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050189770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2050189770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050189770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_2050193614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050193614L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2050189770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2050189770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_2050193614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050193614L))
            info.setReturnValue(false);
    }


}
