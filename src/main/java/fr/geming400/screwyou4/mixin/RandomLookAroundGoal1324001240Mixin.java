package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomLookAroundGoal.class)
public class RandomLookAroundGoal1324001240Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1362275979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1362275979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1362279823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362279823L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1362275979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1362275979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1362279823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362279823L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1362279823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362279823L))
            info.setReturnValue(false);
    }


}
