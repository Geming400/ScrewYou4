package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.class)
public class DensityFunctions_1295286967Mixin {
        @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void min_2013869897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013869897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void max__1837805989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837805989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void add__832561768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832561768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunctions$Mapped$Type;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void map_1240673991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240673991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "constant(D)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void constant__1853119541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853119541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__1982877674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982877674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shift(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shift_972620402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972620402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zero()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void zero_665437451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665437451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mul(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mul__263335749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263335749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void lerp_1073657016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073657016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/level/levelgen/DensityFunction;DLnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void lerp__212759400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212759400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DDDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise_2058747949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058747949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise_1226642789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226642789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mappedNoise(Lnet/minecraft/core/Holder;DD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void mappedNoise__1016956627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016956627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yClampedGradient(IIDD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void yClampedGradient__2051934348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051934348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rangeChoice(Lnet/minecraft/world/level/levelgen/DensityFunction;DDLnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void rangeChoice__1684974977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684974977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftedNoise2d(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;DLnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftedNoise2d_189090663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189090663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolated(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void interpolated_521575216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(521575216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTopSurface(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;II)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void findTopSurface__330306360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330306360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendOffset()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendOffset_1102312103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102312103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intervalSelect(Lnet/minecraft/world/level/levelgen/DensityFunction;Lit/unimi/dsi/fastutil/doubles/DoubleList;Ljava/util/List;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void intervalSelect_611967007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611967007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheAllInCell(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cacheAllInCell__2142683405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142683405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendDensity(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendDensity_1259275524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1259275524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flatCache(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void flatCache__1041025482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041025482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cache2d(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cache2d__588856415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588856415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cacheOnce(Lnet/minecraft/world/level/levelgen/DensityFunction;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void cacheOnce__356117296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356117296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;DD)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise_1975148698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975148698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise_1928204506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928204506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noise(Lnet/minecraft/core/Holder;D)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void noise__1962642600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962642600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spline(Lnet/minecraft/util/CubicSpline;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void spline_1661707975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661707975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftA(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftA_54394837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54394837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blendAlpha()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void blendAlpha_856981232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856981232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shiftB(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void shiftB_1262313012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262313012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endIslands(J)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private static void endIslands_1869915622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869915622L))
            info.setReturnValue(null);
    }


}
