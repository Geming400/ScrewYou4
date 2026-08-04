package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallHangingSignBlock.class)
public class WallHangingSignBlock2003480622Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__555632950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555632950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_418002967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418002967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canPlace__915868420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915868420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_744880855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(744880855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker_50013279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50013279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canAttachTo__1973769270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973769270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees_1858172416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858172416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint__761503304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761503304L))
            info.setReturnValue(null);
    }


}
