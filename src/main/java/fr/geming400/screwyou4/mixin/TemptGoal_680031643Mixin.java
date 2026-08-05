package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.TemptGoal.class)
public class TemptGoal_680031643Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__946133717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-946133717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__2037832309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2037832309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__234408422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234408422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_550347984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(550347984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_705898300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705898300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__9603652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9603652L))
            info.setReturnValue(true);
    }


}
