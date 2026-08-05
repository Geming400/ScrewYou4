package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DriedGhastBlock.class)
public class DriedGhastBlock_2089879080Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__479604928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479604928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__469234493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469234493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_831279312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831279312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1967276998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1967276998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__477656069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-477656069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPathfindable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/pathfinder/PathComputationType;)Z", cancellable = true)
    private void isPathfindable_317545608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317545608L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid_1499662503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499662503L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getHydrationLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getHydrationLevel_1944573756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944573756L))
            info.setReturnValue(1558298970);
    }


}
