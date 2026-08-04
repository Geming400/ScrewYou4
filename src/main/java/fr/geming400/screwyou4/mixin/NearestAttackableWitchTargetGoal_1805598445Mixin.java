package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestAttackableWitchTargetGoal.class)
public class NearestAttackableWitchTargetGoal_1805598445Mixin {
        @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1843877027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843877027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCanAttack(Z)V", cancellable = true)
    private void setCanAttack__1259752023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1259752023L))
            info.cancel();
    }


}
