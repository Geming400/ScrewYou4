package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.OcelotAttackGoal.class)
public class OcelotAttackGoal1369165489Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1407440228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407440228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1407444072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407444072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1407440228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407440228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_1407444072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407444072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1407444072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407444072L))
            info.setReturnValue(null);
    }


}
