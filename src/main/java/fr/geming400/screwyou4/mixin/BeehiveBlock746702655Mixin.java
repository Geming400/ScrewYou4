package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BeehiveBlock.class)
public class BeehiveBlock746702655Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1222180747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222180747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1812410917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1812410917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dropHoneycomb(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void dropHoneycomb__1947902217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947902217L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetHoneyLevel(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void resetHoneyLevel_1258000680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1258000680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__511897112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511897112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_624100574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624100574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_24646494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24646494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy__693040515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-693040515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__2023339572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023339572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1206764688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206764688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__838775000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838775000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseBeesAndResetHoneyLevel(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/entity/BeehiveBlockEntity$BeeReleaseStatus;)V", cancellable = true)
    private void releaseBeesAndResetHoneyLevel__236831389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-236831389L))
            info.cancel();
    }


}
