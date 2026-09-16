package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CalibratedSculkSensorBlock.class)
public class CalibratedSculkSensorBlock_396365552Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_253817814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253817814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1462810805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462810805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void getSignal__2120558997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120558997L))
            info.setReturnValue(2031821863);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1910459104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910459104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getActiveTicks()I", cancellable = true)
    private void getActiveTicks_1961905979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961905979L))
            info.setReturnValue(808891335);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__2072822929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072822929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_537940936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537940936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_615362363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615362363L))
            info.setReturnValue(null);
    }


}
