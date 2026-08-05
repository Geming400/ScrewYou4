package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.StrollThroughVillageGoal.class)
public class StrollThroughVillageGoal_646930418Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__267509647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267509647L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_517246759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(517246759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__42704877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42704877L))
            info.setReturnValue(false);
    }


}
