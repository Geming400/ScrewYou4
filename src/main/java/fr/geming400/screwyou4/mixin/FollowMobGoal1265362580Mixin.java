package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowMobGoal.class)
public class FollowMobGoal1265362580Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1303637319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303637319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1303637319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303637319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1303641163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303641163L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1303637319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1303637319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1303641163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303641163L))
            info.setReturnValue(true);
    }


}
