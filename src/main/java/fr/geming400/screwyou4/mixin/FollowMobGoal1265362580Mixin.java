package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowMobGoal.class)
public class FollowMobGoal1265362580Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__360802779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-360802779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1452501371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1452501371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_350922516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350922516L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1135678922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1135678922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_575727286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575727286L))
            info.setReturnValue(false);
    }


}
