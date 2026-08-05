package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.DolphinJumpGoal.class)
public class DolphinJumpGoal336392945Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1289772414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1289772414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1913496290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913496290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__578047119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578047119L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_206709287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(206709287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable__272720043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272720043L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__353242349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353242349L))
            info.setReturnValue(false);
    }


}
