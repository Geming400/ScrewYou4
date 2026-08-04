package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.EntityBasedExplosionDamageCalculator.class)
public class EntityBasedExplosionDamageCalculator_843878312Mixin {
        @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode_1668426990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668426990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Ljava/util/Optional;", cancellable = true)
    private void getBlockExplosionResistance_33647415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(33647415L))
            info.setReturnValue(null);
    }


}
