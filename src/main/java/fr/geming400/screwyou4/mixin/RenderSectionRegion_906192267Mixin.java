package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.chunk.RenderSectionRegion.class)
public class RenderSectionRegion_906192267Mixin {
        @Inject(at = @At("HEAD"), method = "index(IIIIII)I", cancellable = true)
    private static void index__1334767178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334767178L))
            info.setReturnValue(-546199999);
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__547780420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547780420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_1795512948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795512948L))
            info.setReturnValue(1233764603);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1191451859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191451859L))
            info.setReturnValue(-248578803);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1848892438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848892438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__262378388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262378388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__819424909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819424909L))
            info.setReturnValue(-771285057);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1594287697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594287697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1853003096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853003096L))
            info.setReturnValue(null);
    }


}
