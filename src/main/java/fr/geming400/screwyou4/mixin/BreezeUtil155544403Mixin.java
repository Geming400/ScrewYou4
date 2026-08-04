package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.breeze.BreezeUtil.class)
public class BreezeUtil155544403Mixin {
        @Inject(at = @At("HEAD"), method = "hasLineOfSight(Lnet/minecraft/world/entity/monster/breeze/Breeze;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void hasLineOfSight_1111262462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111262462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomPointBehindTarget(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void randomPointBehindTarget__268298444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-268298444L))
            info.setReturnValue(null);
    }


}
