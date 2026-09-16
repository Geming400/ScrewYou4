package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChiseledBookShelfBlock.class)
public class ChiseledBookShelfBlock1386751429Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1244203692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244203692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1841770613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841770613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1082437051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082437051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1528326814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528326814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColumns()I", cancellable = true)
    private void getColumns__888383388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888383388L))
            info.setReturnValue(-1558773280);
    }

    @Inject(at = @At("HEAD"), method = "getRows()I", cancellable = true)
    private void getRows__1061410116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061410116L))
            info.setReturnValue(-390703298);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_1605748241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605748241L))
            info.setReturnValue(null);
    }


}
