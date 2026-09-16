package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ShelfBlock.class)
public class ShelfBlock1582432071Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_1439884334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439884334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isConnectable__1696628429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696628429L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_1801428883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801428883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1646089971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1646089971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1724007456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1724007456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSideChainPart(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setSideChainPart_863369711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863369711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxChainLength()I", cancellable = true)
    private void getMaxChainLength__1772964140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772964140L))
            info.setReturnValue(-1921557538);
    }

    @Inject(at = @At("HEAD"), method = "getSideChainPart(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void getSideChainPart_736764528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736764528L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getColumns()I", cancellable = true)
    private void getColumns__692702746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692702746L))
            info.setReturnValue(1456666684);
    }

    @Inject(at = @At("HEAD"), method = "getRows()I", cancellable = true)
    private void getRows__865729474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865729474L))
            info.setReturnValue(-1551247168);
    }

    @Inject(at = @At("HEAD"), method = "getFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getFacing__372567597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372567597L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__886756409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886756409L))
            info.setReturnValue(null);
    }


}
