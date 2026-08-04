package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BigDripleafBlock.class)
public class BigDripleafBlock884590174Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1674523398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674523398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__374009593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374009593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_929269932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929269932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1258376379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1258376379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1088322969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088322969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeWithRandomHeight(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private static void placeWithRandomHeight_900354353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(900354353L))
            info.cancel();
    }


}
