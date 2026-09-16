package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BeehiveBlock.class)
public class BeehiveBlock746702655Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_604154918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604154918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_965699467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965699467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1813147909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813147909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseBeesAndResetHoneyLevel(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;)V", cancellable = true)
    private void releaseBeesAndResetHoneyLevel_362960874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(362960874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_888278040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888278040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_1072346244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1072346244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1722485825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1722485825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1151384188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1151384188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_1073765253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073765253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1560122000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560122000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetHoneyLevel(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void resetHoneyLevel_402850928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(402850928L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropHoneycomb(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void dropHoneycomb__1730221622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1730221622L))
            info.cancel();
    }


}
