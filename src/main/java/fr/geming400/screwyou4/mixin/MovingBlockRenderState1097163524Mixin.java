package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.MovingBlockRenderState.class)
public class MovingBlockRenderState1097163524Mixin {
        @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1382423117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1382423117L))
            info.setReturnValue(722121874);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1657921180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657921180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__71407130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-71407130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1662031838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662031838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1785258955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785258955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__356809162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356809162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_1986484206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986484206L))
            info.setReturnValue(1025594650);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__628453651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628453651L))
            info.setReturnValue(-1376515875);
    }


}
