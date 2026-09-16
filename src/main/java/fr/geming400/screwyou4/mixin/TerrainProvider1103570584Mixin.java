package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.TerrainProvider.class)
public class TerrainProvider1103570584Mixin {
        @Inject(at = @At("HEAD"), method = "peaksAndValleys(F)F", cancellable = true)
    private static void peaksAndValleys_623716634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623716634L))
            info.setReturnValue(7.767223E8F);
    }

    @Inject(at = @At("HEAD"), method = "overworldOffset(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldOffset_1277155818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277155818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldFactor(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldFactor_1115945541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115945541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildErosionOffsetSpline(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;FFFFFFZZLit/unimi/dsi/fastutil/floats/Float2FloatFunction;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void buildErosionOffsetSpline__118013835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-118013835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldJaggedness(Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Lnet/minecraft/util/BoundedFloatFunction;Z)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private static void overworldJaggedness_929304007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929304007L))
            info.setReturnValue(null);
    }


}
