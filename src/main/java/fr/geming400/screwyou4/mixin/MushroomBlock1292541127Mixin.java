package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MushroomBlock.class)
public class MushroomBlock1292541127Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1935980915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935980915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1892793922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892793922L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_435756966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(435756966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1255583307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255583307L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "growMushroom(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void growMushroom_542708385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542708385L))
            info.setReturnValue(true);
    }


}
