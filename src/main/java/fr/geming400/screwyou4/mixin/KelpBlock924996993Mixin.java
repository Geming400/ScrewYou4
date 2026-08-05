package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.KelpBlock.class)
public class KelpBlock924996993Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1634116579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634116579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__333602774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333602774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceLiquid(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void canPlaceLiquid_1927529825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927529825L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid_334780417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334780417L))
            info.setReturnValue(false);
    }


}
