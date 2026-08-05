package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.class)
public class DensityFunctions_1295286967Mixin {
        @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void min_834435319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834435319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void max_834435319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834435319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void add_834435319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834435319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunctions$Mapped$Type;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void map_909905571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909905571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constant(D)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void constant__1502652689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502652689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_1889876136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889876136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shift(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shift__1390411212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390411212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zero()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void zero__1520640413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520640413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mul(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mul_834435319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(834435319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/level/levelgen/DensityFunction;DLnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void lerp_1533506351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533506351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void lerp_658382017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658382017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTopSurface(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void findTopSurface_2088960215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088960215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheAllInCell(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cacheAllInCell__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendOffset()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendOffset__1520640413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520640413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yClampedGradient(IIDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void yClampedGradient__1498737469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498737469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftedNoise2d(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;DLnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftedNoise2d__2011740484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011740484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendDensity(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendDensity__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeChoice(Lnet/minecraft/world/level/levelgen/DensityFunction;DDLnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void rangeChoice_39314369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39314369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolated(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void interpolated__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise__348822668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348822668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise_463959038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463959038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DDDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise__109611852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109611852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intervalSelect(Lnet/minecraft/world/level/levelgen/DensityFunction;Lit/unimi/dsi/fastutil/doubles/DoubleList;Ljava/util/List;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void intervalSelect_1730343614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730343614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flatCache(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void flatCache__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cache2d(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cache2d__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise__1390411212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390411212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;D)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise__1760514754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760514754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;DD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise__348822668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348822668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spline(Lnet/minecraft/util/CubicSpline;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spline__1351185930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351185930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheOnce(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cacheOnce__945232851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945232851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendAlpha()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendAlpha__1520640413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520640413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftA(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftA__1390411212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390411212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endIslands(J)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void endIslands__1380628439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380628439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftB(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftB__1390411212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390411212L))
            info.setReturnValue(null);
    }


}
