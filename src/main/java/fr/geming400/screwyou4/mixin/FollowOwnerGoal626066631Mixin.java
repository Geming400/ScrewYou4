package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.FollowOwnerGoal.class)
public class FollowOwnerGoal626066631Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_664341370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664341370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_664341370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664341370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_664345214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664345214L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_664341370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664341370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_664345214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664345214L))
            info.setReturnValue(true);
    }


}
