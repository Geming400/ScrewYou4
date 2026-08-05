package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HangingMossBlock.class)
public class HangingMossBlock1740820447Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1487701595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487701595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTip(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getTip_451726676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451726676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_2145501980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145501980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1703862627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703862627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1953894054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953894054L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_884036286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(884036286L))
            info.cancel();
    }


}
