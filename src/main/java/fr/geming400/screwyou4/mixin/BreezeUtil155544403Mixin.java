package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.BreezeUtil.class)
public class BreezeUtil155544403Mixin {
        @Inject(at = @At("HEAD"), method = "hasLineOfSight(Lnet/minecraft/world/entity/monster/breeze/Breeze;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void hasLineOfSight_1711514486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711514486L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "randomPointBehindTarget(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void randomPointBehindTarget_1168549788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1168549788L))
            info.setReturnValue(null);
    }


}
