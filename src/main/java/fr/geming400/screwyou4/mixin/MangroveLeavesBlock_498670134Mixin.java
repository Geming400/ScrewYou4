package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MangroveLeavesBlock.class)
public class MangroveLeavesBlock_498670134Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2060443439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060443439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_543349891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543349891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1644296420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1644296420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParticlePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getParticlePos__1772802166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772802166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1474243010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1474243010L))
            info.setReturnValue(null);
    }


}
