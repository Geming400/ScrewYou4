package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CalibratedSculkSensorBlock.class)
public class CalibratedSculkSensorBlock_396365552Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_871843643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871843643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2132219275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132219275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_1921290620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921290620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void getSignal_563419721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563419721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1189112104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1189112104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__862234216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862234216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1557101792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557101792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveTicks()I", cancellable = true)
    private void getActiveTicks_434627797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434627797L))
            info.setReturnValue(null);
    }


}
