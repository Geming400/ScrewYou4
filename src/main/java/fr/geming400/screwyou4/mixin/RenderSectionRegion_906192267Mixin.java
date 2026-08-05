package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.RenderSectionRegion.class)
public class RenderSectionRegion_906192267Mixin {
        @Inject(at = @At("HEAD"), method = "index(IIIIII)I", cancellable = true)
    private static void index__1615097400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615097400L))
            info.setReturnValue(1499270288);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__1942598257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942598257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_903853058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903853058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_944454512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944454512L))
            info.setReturnValue(-296991339);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1812527571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1812527571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1304818212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304818212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_944454512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944454512L))
            info.setReturnValue(-295982739);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_840029222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840029222L))
            info.setReturnValue(1954377905);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__1532595600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1532595600L))
            info.setReturnValue(null);
    }


}
