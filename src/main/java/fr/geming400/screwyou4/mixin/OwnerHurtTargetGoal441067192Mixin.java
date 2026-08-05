package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal.class)
public class OwnerHurtTargetGoal441067192Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_479341931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(479341931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_479345775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479345775L))
            info.setReturnValue(true);
    }


}
