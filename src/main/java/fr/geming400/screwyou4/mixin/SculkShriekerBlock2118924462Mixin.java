package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkShriekerBlock.class)
public class SculkShriekerBlock2118924462Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__440189110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440189110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_533446807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533446807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_1433726086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1433726086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker_165457119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165457119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_860324695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860324695L))
            info.setReturnValue(null);
    }


}
