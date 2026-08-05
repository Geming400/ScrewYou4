package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal.class)
public class ResetUniversalAngerTargetGoal979379521Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1017654260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1017654260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1017658104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017658104L))
            info.setReturnValue(true);
    }


}
