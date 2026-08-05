package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseRouterData.class)
public class NoiseRouterData_511030433Mixin {
        @Inject(at = @At("HEAD"), method = "end(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void end_1334563910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334563910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFunction(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void getFunction__1990112819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1990112819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void bootstrap__2101881598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101881598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "none()Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void none__644973238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644973238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nether(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void nether_609635530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609635530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "underground(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void underground_1610442135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610442135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pillars(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void pillars_1876920649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876920649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideEnd(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideEnd__1729489385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729489385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entrances(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void entrances_1911693261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911693261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noodle(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noodle_1911693261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911693261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void postProcess__1729489385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729489385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;ZZ)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void overworld_1088209802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088209802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "peaksAndValleys(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void peaksAndValleys__1729489385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729489385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "peaksAndValleys(F)F", cancellable = true)
    private static void peaksAndValleys_1722161713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722161713L))
            info.setReturnValue(7.110054E8F);
    }

    @Inject(at = @At("HEAD"), method = "preliminarySurfaceLevel(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Z)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void preliminarySurfaceLevel__1846583313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846583313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "floatingIslands(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void floatingIslands_609635530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609635530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simpleRouter(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void simpleRouter_1183381524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183381524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideOverworld(ZLnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideOverworld_1184128717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184128717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTerrainNoises(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;Z)V", cancellable = true)
    private static void registerTerrainNoises__1494493687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494493687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAndWrap(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void registerAndWrap_665261313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665261313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yLimitedInterpolatable(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;III)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void yLimitedInterpolatable__1956752576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956752576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spaghettiRoughnessFunction(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spaghettiRoughnessFunction_1876920649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876920649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noiseGradientDensity(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noiseGradientDensity_50178785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50178785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideNetherLike(Lnet/minecraft/core/HolderGetter;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideNetherLike_162010921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162010921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slideEndLike(Lnet/minecraft/world/level/levelgen/DensityFunction;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slideEndLike_440576119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440576119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "splineWithBlending(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void splineWithBlending_50178785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50178785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetToDepth(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void offsetToDepth__1729489385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729489385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spaghetti2D(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spaghetti2D_1911693261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911693261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caves(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/NoiseRouter;", cancellable = true)
    private static void caves_1334563910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334563910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slide(Lnet/minecraft/world/level/levelgen/DensityFunction;IIIIDIID)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void slide__1247465097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247465097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remap(Lnet/minecraft/world/level/levelgen/DensityFunction;DDDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void remap__778181609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778181609L))
            info.setReturnValue(null);
    }


}
