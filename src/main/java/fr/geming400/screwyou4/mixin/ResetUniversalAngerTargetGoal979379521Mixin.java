package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal.class)
public class ResetUniversalAngerTargetGoal979379521Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__646785838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-646785838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_64939457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64939457L))
            info.setReturnValue(true);
    }


}
