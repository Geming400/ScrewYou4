package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestHealableRaiderTargetGoal.class)
public class NearestHealableRaiderTargetGoal_1109387795Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1147662533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147662533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1147666377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147666377L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCooldown()I", cancellable = true)
    private void getCooldown_1147650040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147650040L))
            info.setReturnValue(854371609);
    }

    @Inject(at = @At("HEAD"), method = "decrementCooldown()V", cancellable = true)
    private void decrementCooldown_1147662533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147662533L))
            info.cancel();
    }


}
