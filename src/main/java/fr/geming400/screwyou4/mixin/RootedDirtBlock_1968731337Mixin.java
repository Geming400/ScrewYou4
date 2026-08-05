package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RootedDirtBlock.class)
public class RootedDirtBlock_1968731337Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__590382236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590382236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_2013411094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013411094L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getParticlePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getParticlePos__302740963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302740963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__4181807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4181807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__174235217(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-174235217L))
            info.cancel();
    }


}
