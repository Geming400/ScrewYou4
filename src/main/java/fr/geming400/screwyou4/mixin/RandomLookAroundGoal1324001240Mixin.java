package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RandomLookAroundGoal.class)
public class RandomLookAroundGoal1324001240Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__302164119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-302164119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_409561176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409561176L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1194317582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194317582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_2063666990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063666990L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_634365946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634365946L))
            info.setReturnValue(true);
    }


}
