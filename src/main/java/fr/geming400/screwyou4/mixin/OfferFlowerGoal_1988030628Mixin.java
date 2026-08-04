package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OfferFlowerGoal.class)
public class OfferFlowerGoal_1988030628Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_2026305366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026305366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2026305366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026305366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_2026309210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026309210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2026305366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026305366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_2026309210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026309210L))
            info.setReturnValue(null);
    }


}
