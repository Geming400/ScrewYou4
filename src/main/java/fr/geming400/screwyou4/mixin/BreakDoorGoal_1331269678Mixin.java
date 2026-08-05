package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.BreakDoorGoal.class)
public class BreakDoorGoal_1331269678Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__294895682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-294895682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1386594274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1386594274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_416829613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416829613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1201586019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201586019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_641634383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641634383L))
            info.setReturnValue(true);
    }


}
