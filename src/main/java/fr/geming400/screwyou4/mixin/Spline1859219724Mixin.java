package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.class)
public class Spline1859219724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1050235809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050235809L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_723759253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723759253L))
            info.setReturnValue("0[kfn;5zD?06q0e.Rm+y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1897481970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897481970L))
            info.setReturnValue(-2117417256);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute__1467715952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467715952L))
            info.setReturnValue(1.4176880050050384E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1897477165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897477165L))
            info.setReturnValue(1.427681006121231E8D);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_1897477165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897477165L))
            info.setReturnValue(1.427681006121231E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec_316934116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316934116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void mapChildren__264545739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264545739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spline()Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void spline__1721344808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721344808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray__1871354366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1871354366L))
            info.cancel();
    }


}
