package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.ClimbOnTopOfPowderSnowGoal.class)
public class ClimbOnTopOfPowderSnowGoal127967517Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_166246100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166246100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_166242256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(166242256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_166246100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166246100L))
            info.setReturnValue(null);
    }


}
