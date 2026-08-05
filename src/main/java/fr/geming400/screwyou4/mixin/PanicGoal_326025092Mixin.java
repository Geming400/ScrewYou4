package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.PanicGoal.class)
public class PanicGoal_326025092Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1300140268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1300140268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1903128436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1903128436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__588414973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588414973L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_351891749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351891749L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__363610203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363610203L))
            info.setReturnValue(false);
    }


}
