package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.RunAroundLikeCrazyGoal.class)
public class RunAroundLikeCrazyGoal_243549045Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_281823783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(281823783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_281827627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281827627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_281823783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(281823783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_281827627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281827627L))
            info.setReturnValue(false);
    }


}
