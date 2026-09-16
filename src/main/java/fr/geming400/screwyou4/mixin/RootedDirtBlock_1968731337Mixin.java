package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RootedDirtBlock.class)
public class RootedDirtBlock_1968731337Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1259790706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1259790706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticlePos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getParticlePos__99363627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99363627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1931773516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931773516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1725983165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1725983165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_1111947175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1111947175L))
            info.cancel();
    }


}
