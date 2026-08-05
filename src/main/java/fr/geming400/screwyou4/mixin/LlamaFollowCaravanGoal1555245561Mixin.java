package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LlamaFollowCaravanGoal.class)
public class LlamaFollowCaravanGoal1555245561Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1162618390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1162618390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_640805497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640805497L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1425561903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1425561903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_865610267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865610267L))
            info.setReturnValue(true);
    }


}
