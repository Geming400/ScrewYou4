package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BigDripleafBlock.class)
public class BigDripleafBlock884590174Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1951035428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951035428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1584598306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584598306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeWithRandomHeight(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private static void placeWithRandomHeight__1094107320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1094107320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_847632354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847632354L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1484842969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484842969L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_27806013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(27806013L))
            info.cancel();
    }


}
