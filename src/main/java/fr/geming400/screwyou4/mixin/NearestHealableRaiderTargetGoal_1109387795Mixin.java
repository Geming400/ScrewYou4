package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestHealableRaiderTargetGoal.class)
public class NearestHealableRaiderTargetGoal_1109387795Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__516777565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-516777565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_194947730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194947730L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "decrementCooldown()V", cancellable = true)
    private void decrementCooldown_1949793895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1949793895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCooldown()I", cancellable = true)
    private void getCooldown_2058837943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058837943L))
            info.setReturnValue(-600117745);
    }


}
