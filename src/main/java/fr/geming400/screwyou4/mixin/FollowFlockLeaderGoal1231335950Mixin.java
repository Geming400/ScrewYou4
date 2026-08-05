package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowFlockLeaderGoal.class)
public class FollowFlockLeaderGoal1231335950Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__394829409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-394829409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1486528001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1486528001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_316895886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316895886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1101652292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1101652292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_541700656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541700656L))
            info.setReturnValue(false);
    }


}
