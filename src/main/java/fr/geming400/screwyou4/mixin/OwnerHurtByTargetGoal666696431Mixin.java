package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal.class)
public class OwnerHurtByTargetGoal666696431Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_704971170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(704971170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_704975014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704975014L))
            info.setReturnValue(true);
    }


}
