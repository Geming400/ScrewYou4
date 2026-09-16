package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PointedDripstoneBlock.class)
public class PointedDripstoneBlock1304914974Mixin {
        @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__743318584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-743318584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1923607068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923607068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findStalactiteTipAboveCauldron(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void findStalactiteTipAboveCauldron_336641707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336641707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnDripParticle(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void spawnDripParticle_162130119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162130119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maybeTransferFluid(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;F)V", cancellable = true)
    private static void maybeTransferFluid__264762700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-264762700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCauldronFillFluidType(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private static void getCauldronFillFluidType_34133978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34133978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1709596507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1709596507L))
            info.cancel();
    }


}
