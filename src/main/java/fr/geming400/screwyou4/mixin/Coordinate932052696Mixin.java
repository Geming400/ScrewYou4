package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.Coordinate.class)
public class Coordinate932052696Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_23426428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23426428L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1702476221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702476221L))
            info.setReturnValue("3t\u275C\u7EB4p\u2E9Exah9{Q5kDf'[\u6F4F`HYQ\uAC41E4\u6B23Tj17\u84FEW)I\uB2CAa)\u83CDZ\u3885qL2>9+\u73BE/x\uA985]\u834F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1489404787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489404787L))
            info.setReturnValue(1854568510);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/levelgen/DensityFunctions$Spline$Point;)F", cancellable = true)
    private void apply_377318581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377318581L))
            info.setReturnValue(1.559116E8F);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;)F", cancellable = true)
    private void apply__1929287767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929287767L))
            info.setReturnValue(1.559116E8F);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void function__570923675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-570923675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue_1749977902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749977902L))
            info.setReturnValue(1.559116E8F);
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue__722683236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722683236L))
            info.setReturnValue(1.569125E8F);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunctions$Spline$Coordinate;", cancellable = true)
    private void mapChildren_505411404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505411404L))
            info.setReturnValue(null);
    }


}
