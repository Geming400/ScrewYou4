package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreathAirGoal.class)
public class BreathAirGoal863084943Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__763080416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-763080416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__51355121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51355121L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_733401285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(733401285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_253971955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253971955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_173449649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173449649L))
            info.setReturnValue(false);
    }


}
