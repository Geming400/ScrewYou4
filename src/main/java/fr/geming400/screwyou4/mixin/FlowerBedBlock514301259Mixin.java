package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FlowerBedBlock.class)
public class FlowerBedBlock514301259Mixin {
        @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void rotate_989779351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989779351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__2055182748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055182748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2044812313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2044812313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__744298508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744298508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplaced(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/item/context/BlockPlaceContext;)Z", cancellable = true)
    private void canBeReplaced__231902058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231902058L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void mirror_2039226328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039226328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_558981017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558981017L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1628665294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628665294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1458611884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458611884L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSegmentAmountProperty()Lnet/minecraft/world/level/block/state/properties/IntegerProperty;", cancellable = true)
    private void getSegmentAmountProperty_1220004422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220004422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShapeHeight()D", cancellable = true)
    private void getShapeHeight_552558700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552558700L))
            info.setReturnValue(6.455114002353168E8D);
    }


}
