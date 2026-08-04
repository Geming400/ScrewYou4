package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.bee.Bee.BeeGoToKnownFlowerGoal.class)
public class BeeGoToKnownFlowerGoal_1089451102Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1127725840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1127725840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1127725840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1127725840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1127858644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127858644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1127725840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1127725840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1127858644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127858644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeeUse()Z", cancellable = true)
    private void canBeeUse_1127729684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127729684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeeContinueToUse()Z", cancellable = true)
    private void canBeeContinueToUse_1127729684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127729684L))
            info.setReturnValue(null);
    }


}
