package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowFlockLeaderGoal.class)
public class FollowFlockLeaderGoal1231335950Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1269610689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269610689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1269610689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269610689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1269614533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269614533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1269610689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269610689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1269614533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269614533L))
            info.setReturnValue(null);
    }


}
