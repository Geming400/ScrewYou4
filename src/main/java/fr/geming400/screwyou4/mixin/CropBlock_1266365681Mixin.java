package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CropBlock.class)
public class CropBlock_1266365681Mixin {
        @Inject(at = @At("HEAD"), method = "getAge(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getAge__1690907108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690907108L))
            info.setReturnValue(1103071640);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1962156362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962156362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1866618475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866618475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_409581519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(409581519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1229407860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229407860L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAge()I", cancellable = true)
    private void getMaxAge__234289787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234289787L))
            info.setReturnValue(-100424);
    }

    @Inject(at = @At("HEAD"), method = "growCrops(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void growCrops__251830201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-251830201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMaxAge(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isMaxAge_1408641889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408641889L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStateForAge(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForAge__959701964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959701964L))
            info.setReturnValue(null);
    }


}
