package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.CombatRules.class)
public class CombatRules_2029602443Mixin {
        @Inject(at = @At("HEAD"), method = "getDamageAfterMagicAbsorb(FF)F", cancellable = true)
    private static void getDamageAfterMagicAbsorb_1598668098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598668098L))
            info.setReturnValue(9.590251E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDamageAfterAbsorb(Lnet/minecraft/world/entity/LivingEntity;FLnet/minecraft/world/damagesource/DamageSource;FF)F", cancellable = true)
    private static void getDamageAfterAbsorb_1599929980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1599929980L))
            info.setReturnValue(9.590251E8F);
    }


}
