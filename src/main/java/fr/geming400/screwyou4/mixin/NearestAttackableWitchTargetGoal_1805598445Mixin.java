package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestAttackableWitchTargetGoal.class)
public class NearestAttackableWitchTargetGoal_1805598445Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_891158380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891158380L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCanAttack(Z)V", cancellable = true)
    private void setCanAttack_882038047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(882038047L))
            info.cancel();
    }


}
