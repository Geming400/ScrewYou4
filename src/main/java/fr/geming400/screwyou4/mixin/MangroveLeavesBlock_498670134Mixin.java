package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MangroveLeavesBlock.class)
public class MangroveLeavesBlock_498670134Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1565115387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565115387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_461712313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461712313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__358114028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-358114028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticlePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getParticlePos__1569424830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569424830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1098922928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098922928L))
            info.setReturnValue(true);
    }


}
