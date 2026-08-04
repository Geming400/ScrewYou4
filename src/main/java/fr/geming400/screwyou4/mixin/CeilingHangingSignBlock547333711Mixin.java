package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CeilingHangingSignBlock.class)
public class CeilingHangingSignBlock547333711Mixin {
        @Inject(at = @At("HEAD"), method = "getAttachmentPoint(Z)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private static void getAttachmentPoint_1990138668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990138668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2011779861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011779861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1038143944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038143944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__711266056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711266056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1406133632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406133632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees_402025505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402025505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/HangingSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint_2077317081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077317081L))
            info.setReturnValue(null);
    }


}
