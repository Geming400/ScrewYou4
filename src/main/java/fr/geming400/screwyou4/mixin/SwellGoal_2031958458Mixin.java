package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.SwellGoal.class)
public class SwellGoal_2031958458Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_2070233196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070233196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_2070233196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070233196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_2070237040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070237040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2070233196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070233196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_2070237040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070237040L))
            info.setReturnValue(null);
    }


}
