package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowOwnerGoal.class)
public class FollowOwnerGoal626066631Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__1000098728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1000098728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__2091797320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2091797320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__288373433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288373433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_496382973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(496382973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__63568663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63568663L))
            info.setReturnValue(false);
    }


}
