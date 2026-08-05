package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ExplosionDamageCalculator.class)
public class ExplosionDamageCalculator958039192Mixin {
        @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode_1782587871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782587871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Ljava/util/Optional;", cancellable = true)
    private void getBlockExplosionResistance_147808296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147808296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnockbackMultiplier(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void getKnockbackMultiplier_506299156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506299156L))
            info.setReturnValue(2.700377E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEntityDamageAmount(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;F)F", cancellable = true)
    private void getEntityDamageAmount__1587111306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587111306L))
            info.setReturnValue(2.700377E8F);
    }

    @Inject(at = @At("HEAD"), method = "shouldDamageEntity(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldDamageEntity__233231254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233231254L))
            info.setReturnValue(false);
    }


}
