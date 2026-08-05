package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.PanicGoal.class)
public class PanicGoal_326025092Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_364299830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364299830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_364299830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364299830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_364303674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364303674L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_364303674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364303674L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_364303674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364303674L))
            info.setReturnValue(true);
    }


}
