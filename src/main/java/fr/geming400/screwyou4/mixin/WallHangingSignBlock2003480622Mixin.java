package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallHangingSignBlock.class)
public class WallHangingSignBlock2003480622Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1225041420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225041420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__303344033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303344033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__465707858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-465707858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canPlace_950847365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950847365L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2145056007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145056007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canAttachTo(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canAttachTo__97665478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97665478L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint__2109545877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109545877L))
            info.setReturnValue(net.minecraft.world.level.block.HangingSignBlock.Attachment.CEILING_MIDDLE);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees__654979142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654979142L))
            info.setReturnValue(1.93432E7F);
    }


}
