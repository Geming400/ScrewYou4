package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LlamaFollowCaravanGoal.class)
public class LlamaFollowCaravanGoal1555245561Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1593520300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1593520300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1593524144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593524144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1593520300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1593520300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1593524144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593524144L))
            info.setReturnValue(null);
    }


}
