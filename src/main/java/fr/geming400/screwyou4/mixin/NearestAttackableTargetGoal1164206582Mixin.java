package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal.class)
public class NearestAttackableTargetGoal1164206582Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__461958777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-461958777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_249766518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249766518L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void setTarget_1306612396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1306612396L))
            info.cancel();
    }


}
