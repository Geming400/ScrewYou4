package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatRules.class)
public class CombatRules_2029602443Mixin {
        @Inject(at = @At("HEAD"), method = "getDamageAfterMagicAbsorb(FF)F", cancellable = true)
    private static void getDamageAfterMagicAbsorb_945049829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945049829L))
            info.setReturnValue(3.627061E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDamageAfterAbsorb(Lnet/minecraft/world/entity/LivingEntity;FLnet/minecraft/world/damagesource/DamageSource;FF)F", cancellable = true)
    private static void getDamageAfterAbsorb__931360776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931360776L))
            info.setReturnValue(3.627061E8F);
    }


}
