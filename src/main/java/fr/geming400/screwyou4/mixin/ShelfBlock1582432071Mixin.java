package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ShelfBlock.class)
public class ShelfBlock1582432071Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_2057910163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2057910163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isConnectable_1437143085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437143085L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__976681501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976681501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_323832304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323832304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror__1187610156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1187610156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRows()I", cancellable = true)
    private void getRows_1620694317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620694317L))
            info.setReturnValue(1713299650);
    }

    @Inject(at = @At("HEAD"), method = "getColumns()I", cancellable = true)
    private void getColumns_1620694317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620694317L))
            info.setReturnValue(1713299650);
    }

    @Inject(at = @At("HEAD"), method = "getFacing(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getFacing_713303811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713303811L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__3045584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3045584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSideChainPart(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void getSideChainPart_747916969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747916969L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SideChainPart.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getMaxChainLength()I", cancellable = true)
    private void getMaxChainLength_1620694317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620694317L))
            info.setReturnValue(1713299650);
    }

    @Inject(at = @At("HEAD"), method = "setSideChainPart(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setSideChainPart__943316108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943316108L))
            info.setReturnValue(null);
    }


}
