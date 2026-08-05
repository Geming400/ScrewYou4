package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CropBlock.class)
public class CropBlock_1266365681Mixin {
        @Inject(at = @At("HEAD"), method = "getAge(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getAge_1121060357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121060357L))
            info.setReturnValue(392150418);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1292747892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292747892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForAge(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForAge__1789044347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789044347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1311045438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311045438L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__876600873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-876600873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__706547463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706547463L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isMaxAge(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isMaxAge_1121077190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121077190L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAge()I", cancellable = true)
    private void getMaxAge_1304627926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304627926L))
            info.setReturnValue(-71382581);
    }

    @Inject(at = @At("HEAD"), method = "growCrops(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void growCrops__803539497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-803539497L))
            info.cancel();
    }


}
