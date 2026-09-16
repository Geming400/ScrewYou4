package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ExplosionDamageCalculator.class)
public class ExplosionDamageCalculator958039192Mixin {
        @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode__1398140456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398140456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Ljava/util/Optional;", cancellable = true)
    private void getBlockExplosionResistance__1463338177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463338177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldDamageEntity(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldDamageEntity_508883717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508883717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getKnockbackMultiplier(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void getKnockbackMultiplier__1633654342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633654342L))
            info.setReturnValue(7.478324E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEntityDamageAmount(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;F)F", cancellable = true)
    private void getEntityDamageAmount_725186710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725186710L))
            info.setReturnValue(7.478324E8F);
    }


}
