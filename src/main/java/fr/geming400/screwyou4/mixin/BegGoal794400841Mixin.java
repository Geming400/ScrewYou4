package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BegGoal.class)
public class BegGoal794400841Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_832675580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832675580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_832675580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832675580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_832679424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832679424L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_832675580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832675580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_832679424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832679424L))
            info.setReturnValue(false);
    }


}
