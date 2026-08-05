package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OcelotAttackGoal.class)
public class OcelotAttackGoal1369165489Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1348698462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1348698462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_454725425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454725425L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1239481831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239481831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_2108831239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108831239L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_679530195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679530195L))
            info.setReturnValue(false);
    }


}
