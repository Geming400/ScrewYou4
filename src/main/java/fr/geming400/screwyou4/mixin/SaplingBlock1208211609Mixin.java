package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SaplingBlock.class)
public class SaplingBlock1208211609Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1350901963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350901963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__934754944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934754944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__764701534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764701534L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1252891367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1252891367L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "advanceTree(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void advanceTree__1147307750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1147307750L))
            info.cancel();
    }


}
