package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.WitherMobEffect.class)
public class WitherMobEffect147392112Mixin {
        @Inject(at = @At("HEAD"), method = "shouldApplyEffectTickThisTick(II)Z", cancellable = true)
    private void shouldApplyEffectTickThisTick__848483513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848483513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyEffectTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;I)Z", cancellable = true)
    private void applyEffectTick__776080255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776080255L))
            info.setReturnValue(null);
    }


}
