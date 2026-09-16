package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseRouter.class)
public class NoiseRouter1950967461Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1042341193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042341193L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1573576310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573576310L))
            info.setReturnValue(";F96YRx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1786647744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786647744L))
            info.setReturnValue(1078956085);
    }

    @Inject(at = @At("HEAD"), method = "depth()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void depth_1895786269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895786269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void preliminarySurfaceLevel__1403346297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403346297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void temperature_1570740942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570740942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapAll(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private void mapAll__142295184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142295184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finalDensity()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void finalDensity_595516908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595516908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "barrierNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void barrierNoise_880265725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880265725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevelFloodednessNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void fluidLevelFloodednessNoise__2104302630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104302630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluidLevelSpreadNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void fluidLevelSpreadNoise__1152604281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152604281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "erosion()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void erosion__1886554255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886554255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vegetation()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void vegetation_52101224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52101224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continents()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void continents_1950515609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950515609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ridges()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void ridges__668383102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668383102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lavaNoise()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void lavaNoise_1405098868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405098868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinToggle()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinToggle__772735518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772735518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinGap()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinGap_371225980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371225980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "veinRidged()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void veinRidged_949440167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949440167L))
            info.setReturnValue(null);
    }


}
