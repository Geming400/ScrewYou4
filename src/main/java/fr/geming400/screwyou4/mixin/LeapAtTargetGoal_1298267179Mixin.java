package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.LeapAtTargetGoal.class)
public class LeapAtTargetGoal_1298267179Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1336541917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1336541917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1336545761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336545761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_1336545761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336545761L))
            info.setReturnValue(null);
    }


}
