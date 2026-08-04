package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.TerrainProvider.class)
public class TerrainProvider1103570584Mixin {
        @Inject(at = @At("HEAD"), method = "buildErosionOffsetSpline(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;FFFFFFZZLit/unimi/dsi/fastutil/floats/Float2FloatFunction;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void buildErosionOffsetSpline_353480904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353480904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "peaksAndValleys(F)F", cancellable = true)
    private static void peaksAndValleys__1980265431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980265431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldJaggedness(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldJaggedness_1359667666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359667666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldOffset(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldOffset__2067021703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067021703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldFactor(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldFactor_1359667666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359667666L))
            info.setReturnValue(null);
    }


}
