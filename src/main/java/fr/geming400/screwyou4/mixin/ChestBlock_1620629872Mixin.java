package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChestBlock.class)
public class ChestBlock_1620629872Mixin {
        @Inject(at = @At("HEAD"), method = "combine(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/level/block/DoubleBlockCombiner$NeighborCombineResult;", cancellable = true)
    private void combine__657129550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-657129550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainer(Lnet/minecraft/world/level/block/ChestBlock;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/Container;", cancellable = true)
    private static void getContainer_1002257420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002257420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__938483701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-938483701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opennessCombiner(Lnet/minecraft/world/level/block/entity/LidBlockEntity;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$Combiner;", cancellable = true)
    private static void opennessCombiner_2129674095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129674095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntityType()Lnet/minecraft/world/level/block/entity/BlockEntityType;", cancellable = true)
    private void blockEntityType__1700594911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700594911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedBlockPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getConnectedBlockPos_1284981099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284981099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChestBlockedAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isChestBlockedAt_1169083146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169083146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chestCanConnectTo(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void chestCanConnectTo_1475340885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475340885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCloseChestSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCloseChestSound__1584124527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584124527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOpenChestSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getOpenChestSound__1584124527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584124527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void getBlockType_640411814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640411814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedDirection(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getConnectedDirection_751501859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751501859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_35152216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35152216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__332837472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332837472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_362030104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362030104L))
            info.setReturnValue(null);
    }


}
