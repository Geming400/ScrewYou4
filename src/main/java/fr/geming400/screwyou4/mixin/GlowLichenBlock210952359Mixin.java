package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GlowLichenBlock.class)
public class GlowLichenBlock210952359Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1946806083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946806083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emission(I)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void emission__1812341953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1812341953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSpreader_288895411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(288895411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_255632117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255632117L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1932014194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1932014194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1761960784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761960784L))
            info.setReturnValue(false);
    }


}
