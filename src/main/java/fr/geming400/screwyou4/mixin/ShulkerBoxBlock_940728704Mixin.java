package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ShulkerBoxBlock.class)
public class ShulkerBoxBlock_940728704Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1618384869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618384869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1918930363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918930363L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BLACK);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__317871064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317871064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_218672542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218672542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1012738640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012738640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__644748952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644748952L))
            info.setReturnValue(null);
    }


}
