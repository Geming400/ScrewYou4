package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChiseledBookShelfBlock.class)
public class ChiseledBookShelfBlock1386751429Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1862229521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862229521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1172362143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172362143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_128151662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128151662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__1383290798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383290798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__198726226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198726226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColumns()I", cancellable = true)
    private void getColumns_1425013675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425013675L))
            info.setReturnValue(-1386951529);
    }

    @Inject(at = @At("HEAD"), method = "getRows()I", cancellable = true)
    private void getRows_1425013675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425013675L))
            info.setReturnValue(-1386951529);
    }


}
