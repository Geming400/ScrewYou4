package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.WitherMobEffect.class)
public class WitherMobEffect147392112Mixin {
        @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__2061371485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061371485L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyEffectTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void applyEffectTick_2136104997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136104997L))
            info.setReturnValue(false);
    }


}
