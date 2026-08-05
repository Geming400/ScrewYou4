package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BigDripleafStemBlock.class)
public class BigDripleafStemBlock_1224073131Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1335040442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335040442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1268752888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268752888L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__748840013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748840013L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__918893423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-918893423L))
            info.cancel();
    }


}
