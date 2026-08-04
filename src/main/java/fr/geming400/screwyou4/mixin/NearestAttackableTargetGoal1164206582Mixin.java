package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal.class)
public class NearestAttackableTargetGoal1164206582Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1202481321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1202481321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_1202485165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202485165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1485869913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485869913L))
            info.cancel();
    }


}
