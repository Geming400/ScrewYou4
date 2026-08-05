package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreedGoal.class)
public class BreedGoal1609145785Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1647420524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1647420524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1647424368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647424368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1647420524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1647420524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1647424368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647424368L))
            info.setReturnValue(true);
    }


}
