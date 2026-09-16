package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SimpleExplosionDamageCalculator.class)
public class SimpleExplosionDamageCalculator_1330657914Mixin {
        @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode__1025521735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025521735L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldDamageEntity(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldDamageEntity_881502438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881502438L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getKnockbackMultiplier(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void getKnockbackMultiplier__1261035621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261035621L))
            info.setReturnValue(1.369644E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Ljava/util/Optional;", cancellable = true)
    private void getBlockExplosionResistance__1090719456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090719456L))
            info.setReturnValue(null);
    }


}
