package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LeapAtTargetGoal.class)
public class LeapAtTargetGoal_1298267179Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__327898181(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-327898181L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_383827114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383827114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_608631884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608631884L))
            info.setReturnValue(false);
    }


}
