package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreakDoorGoal.class)
public class BreakDoorGoal_1331269678Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1369544416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1369544416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1369544416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1369544416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1369548260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369548260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1369544416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1369544416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1369548260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369548260L))
            info.setReturnValue(false);
    }


}
