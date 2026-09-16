package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EnderChestBlock.class)
public class EnderChestBlock1242683174Mixin {
        @Inject(at = @At("HEAD"), method = "combine(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/level/block/DoubleBlockCombiner$NeighborCombineResult;", cancellable = true)
    private void combine_626168488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626168488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1985838868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985838868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1064141481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064141481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1226505306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226505306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1647364707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1647364707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1384258559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384258559L))
            info.setReturnValue(null);
    }


}
