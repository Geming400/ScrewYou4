package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.class)
public class Spline1859219724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_950592960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950592960L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1665324543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665324543L))
            info.setReturnValue("y}>)=F`[=}w@F8p-<\u86410B\u4275(*j5\uD632\u0DD875(4\u16B8XyYx\uB2481[\u9AB1;Ft^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1878395977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878395977L))
            info.setReturnValue(-956420056);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute__1503957959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503957959L))
            info.setReturnValue(3.5465370017539465E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue__1617824288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617824288L))
            info.setReturnValue(3.546537000484551E8D);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_204481870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204481870L))
            info.setReturnValue(3.546537008841609E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec__105045106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105045106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void mapChildren_1299912240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299912240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spline()Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void spline_917295145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917295145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray__1865108052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1865108052L))
            info.cancel();
    }


}
