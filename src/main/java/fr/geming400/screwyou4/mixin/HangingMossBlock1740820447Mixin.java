package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HangingMossBlock.class)
public class HangingMossBlock1740820447Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__818293125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818293125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__402146106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-402146106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__232092696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232092696L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1785500205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785500205L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1618218366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618218366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTip(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTip__1608111207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608111207L))
            info.setReturnValue(null);
    }


}
