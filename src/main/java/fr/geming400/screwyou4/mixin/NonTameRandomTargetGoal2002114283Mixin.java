package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal.class)
public class NonTameRandomTargetGoal2002114283Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_2040392866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040392866L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_2040392866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040392866L))
            info.setReturnValue(true);
    }


}
