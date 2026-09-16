package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BellBlock.class)
public class BellBlock1536383292Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1393835555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393835555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1692138750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692138750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onHit(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/BlockHitResult;Lnet/minecraft/world/entity/player/Player;Z)Z", cancellable = true)
    private void onHit__1892094900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892094900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__770441363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770441363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptToRing(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void attemptToRing_955247957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955247957L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "attemptToRing(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void attemptToRing_1376856844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376856844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__932805188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932805188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1677958677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677958677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_1755380104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755380104L))
            info.setReturnValue(null);
    }


}
