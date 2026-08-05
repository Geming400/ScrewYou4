package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CaveVinesBlock.class)
public class CaveVinesBlock1757190709Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__801922863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801922863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__385775844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-385775844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__215722434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215722434L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1801870467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801870467L))
            info.setReturnValue(false);
    }


}
