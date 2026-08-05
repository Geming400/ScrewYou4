package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowPlayerRiddenEntityGoal.class)
public class FollowPlayerRiddenEntityGoal_1060013602Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__566151758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-566151758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1657850350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1657850350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_145573537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145573537L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_930329943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(930329943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInterruptable()Z", cancellable = true)
    private void isInterruptable_450900613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450900613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_370378307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370378307L))
            info.setReturnValue(true);
    }


}
