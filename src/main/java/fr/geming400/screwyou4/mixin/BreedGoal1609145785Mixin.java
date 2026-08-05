package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreedGoal.class)
public class BreedGoal1609145785Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1108718166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1108718166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_694705721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694705721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1479462127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1479462127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_919510491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919510491L))
            info.setReturnValue(true);
    }


}
