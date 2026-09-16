package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerBedBlock.class)
public class FlowerBedBlock514301259Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_371753522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371753522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__439057585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-439057585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1580746513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580746513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplaced(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/context/BlockPlaceContext;)Z", cancellable = true)
    private void canBeReplaced_803168051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803168051L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getShapeHeight()D", cancellable = true)
    private void getShapeHeight__1235955526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235955526L))
            info.setReturnValue(9.488371003253188E8D);
    }

    @Inject(at = @At("HEAD"), method = "getSegmentAmountProperty()Lnet/minecraft/world/level/block/state/properties/IntegerProperty;", cancellable = true)
    private void getSegmentAmountProperty__492882576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492882576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1954887221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1954887221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_477343439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477343439L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__342482902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342482902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1114554054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114554054L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_733298071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733298071L))
            info.setReturnValue(null);
    }


}
