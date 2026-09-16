package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CeilingHangingSignBlock.class)
public class CeilingHangingSignBlock547333711Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1613778965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613778965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1759490944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759490944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1921854769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921854769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_688909096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688909096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttachmentPoint(Z)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void getAttachmentPoint__1979064989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979064989L))
            info.setReturnValue(net.minecraft.world.level.block.HangingSignBlock.Attachment.CEILING);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint_729274508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729274508L))
            info.setReturnValue(net.minecraft.world.level.block.HangingSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees__2111126053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111126053L))
            info.setReturnValue(7.761828E8F);
    }


}
