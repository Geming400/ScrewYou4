package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChestBlock.class)
public class ChestBlock_1620629872Mixin {
        @Inject(at = @At("HEAD"), method = "combine(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/level/block/DoubleBlockCombiner$NeighborCombineResult;", cancellable = true)
    private void combine_1004115185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004115185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1607892171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607892171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__848558609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848558609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__686194784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686194784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1762205256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762205256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOpenChestSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getOpenChestSound__152734493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152734493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void getBlockType__75525483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75525483L))
            info.setReturnValue(net.minecraft.world.level.block.DoubleBlockCombiner.BlockType.FIRST);
    }

    @Inject(at = @At("HEAD"), method = "blockEntityType()Lnet/minecraft/world/level/block/entity/BlockEntityType;", cancellable = true)
    private void blockEntityType_409903691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409903691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opennessCombiner(Lnet/minecraft/world/level/block/entity/LidBlockEntity;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$Combiner;", cancellable = true)
    private static void opennessCombiner_1808190491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1808190491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chestCanConnectTo(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void chestCanConnectTo__220579617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220579617L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isChestBlockedAt(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isChestBlockedAt__1552390910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552390910L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCloseChestSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCloseChestSound__1978199263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978199263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedBlockPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getConnectedBlockPos_1784260965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784260965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedDirection(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getConnectedDirection_188490895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188490895L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getContainer(Lnet/minecraft/world/level/block/ChestBlock;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/Container;", cancellable = true)
    private static void getContainer_2049995223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049995223L))
            info.setReturnValue(null);
    }


}
