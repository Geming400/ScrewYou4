package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BeaconBlock.class)
public class BeaconBlock_1116649189Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1442464384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442464384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1743009878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743009878L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIGHT_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__836818155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836818155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__468828467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468828467L))
            info.setReturnValue(null);
    }


}
