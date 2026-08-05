package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SimpleExplosionDamageCalculator.class)
public class SimpleExplosionDamageCalculator_1330657914Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Ljava/util/Optional;", cancellable = true)
    private void getBlockExplosionResistance_520427017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520427017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode__2139760704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139760704L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getKnockbackMultiplier(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void getKnockbackMultiplier_878917877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878917877L))
            info.setReturnValue(9.655651E8F);
    }

    @Inject(at = @At("HEAD"), method = "shouldDamageEntity(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldDamageEntity_139387467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139387467L))
            info.setReturnValue(true);
    }


}
