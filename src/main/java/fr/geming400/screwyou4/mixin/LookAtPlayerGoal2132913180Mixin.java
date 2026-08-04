package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LookAtPlayerGoal.class)
public class LookAtPlayerGoal2132913180Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__2123779377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123779377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__2123779377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123779377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__2123775533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123775533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__2123779377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123779377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__2123775533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123775533L))
            info.setReturnValue(null);
    }


}
