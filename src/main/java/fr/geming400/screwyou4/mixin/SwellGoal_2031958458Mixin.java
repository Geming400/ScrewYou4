package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SwellGoal.class)
public class SwellGoal_2031958458Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_405793098(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(405793098L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__685905494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-685905494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1117518393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117518393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1902274799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1902274799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick__1523343089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523343089L))
            info.setReturnValue(false);
    }


}
