package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BedBlock.class)
public class BedBlock1882377040Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1346145002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346145002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findStandUpPosition(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;F)Ljava/util/Optional;", cancellable = true)
    private static void findStandUpPosition__1588774198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588774198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBedOrientation(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getBedOrientation_631799167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631799167L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__908595302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-908595302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1784599095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784599095L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__586811440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586811440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy__2085527658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085527658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__165856518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-165856518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void getBlockType_186221686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186221686L))
            info.setReturnValue(net.minecraft.world.level.block.DoubleBlockCombiner.BlockType.SINGLE);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedDirection(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getConnectedDirection_450238064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450238064L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }


}
