package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BeaconBlock.class)
public class BeaconBlock_1116649189Mixin {
        @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1744640349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744640349L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIME);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2111872854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111872854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_1258224573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258224573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1190175467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190175467L))
            info.setReturnValue(null);
    }


}
