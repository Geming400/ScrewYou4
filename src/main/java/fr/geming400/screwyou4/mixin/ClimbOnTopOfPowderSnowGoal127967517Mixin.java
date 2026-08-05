package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.ClimbOnTopOfPowderSnowGoal.class)
public class ClimbOnTopOfPowderSnowGoal127967517Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__786472547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786472547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__1716141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1716141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requiresUpdateEveryTick()Z", cancellable = true)
    private void requiresUpdateEveryTick_867633267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867633267L))
            info.setReturnValue(true);
    }


}
