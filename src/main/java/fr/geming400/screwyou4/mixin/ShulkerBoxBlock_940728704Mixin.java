package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ShulkerBoxBlock.class)
public class ShulkerBoxBlock_940728704Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2007173957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2007173957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1568719864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568719864L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1528459777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528459777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_1267791301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267791301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1366095952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366095952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1082304088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082304088L))
            info.setReturnValue(null);
    }


}
