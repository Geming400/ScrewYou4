package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal.class)
public class NonTameRandomTargetGoal2002114283Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1087674219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087674219L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1312478989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312478989L))
            info.setReturnValue(false);
    }


}
