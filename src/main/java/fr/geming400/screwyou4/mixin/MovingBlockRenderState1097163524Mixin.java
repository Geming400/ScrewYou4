package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.MovingBlockRenderState.class)
public class MovingBlockRenderState1097163524Mixin {
        @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__1751626999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751626999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1094824316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094824316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1135425770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135425770L))
            info.setReturnValue(-1731323615);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_2003498829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003498829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1495789470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495789470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1135425770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135425770L))
            info.setReturnValue(-1731323615);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_1031000480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031000480L))
            info.setReturnValue(1744498076);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__1341624342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341624342L))
            info.setReturnValue(null);
    }


}
