package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DriedGhastBlock.class)
public class DriedGhastBlock_2089879080Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_1136520235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136520235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHydrationLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getHydrationLevel__419569256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419569256L))
            info.setReturnValue(-2032123378);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1138642963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138642963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid_268418378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268418378L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__701093263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-701093263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPathfindable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/pathfinder/PathComputationType;)Z", cancellable = true)
    private void isPathfindable_251613382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251613382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__379309401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379309401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__1800406684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1800406684L))
            info.cancel();
    }


}
