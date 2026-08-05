package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal.class)
public class MoveThroughVillageGoal_394175871Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_432450609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432450609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_432450609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432450609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_432454453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432454453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_432454453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432454453L))
            info.setReturnValue(false);
    }


}
