package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PointedDripstoneBlock.class)
public class PointedDripstoneBlock1304914974Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1254198598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254198598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1182312893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1182312893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1616247486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1616247486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findStalactiteTipAboveCauldron(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void findStalactiteTipAboveCauldron_2118546268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118546268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnDripParticle(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void spawnDripParticle__764989955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-764989955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "maybeTransferFluid(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;F)V", cancellable = true)
    private static void maybeTransferFluid__598956949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-598956949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCauldronFillFluidType(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private static void getCauldronFillFluidType__1484288541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484288541L))
            info.setReturnValue(null);
    }


}
