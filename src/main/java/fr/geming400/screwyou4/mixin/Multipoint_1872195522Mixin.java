package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Multipoint.class)
public class Multipoint_1872195522Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1037259516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037259516L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_736735546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736735546L))
            info.setReturnValue("r'0#B");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__796434959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-796434959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1910458263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910458263L))
            info.setReturnValue(-1812955542);
    }

    @Inject(at = @At("HEAD"), method = "locations()[F", cancellable = true)
    private void locations__1236933301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236933301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue_1910454884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910454884L))
            info.setReturnValue(3.63324E7F);
    }

    @Inject(at = @At("HEAD"), method = "mapCoordinates(Ljava/util/function/UnaryOperator;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void mapCoordinates__1170160934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170160934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parityString()Ljava/lang/String;", cancellable = true)
    private void parityString_736735050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736735050L))
            info.setReturnValue("-K");
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue_1910454884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910454884L))
            info.setReturnValue(3.63324E7F);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_792159409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792159409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/CubicSpline$Multipoint;Ljava/lang/Object;)F", cancellable = true)
    private static void sample__1807777610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807777610L))
            info.setReturnValue(3.63324E7F);
    }

    @Inject(at = @At("HEAD"), method = "coordinate()Lnet/minecraft/util/BoundedFloatFunction;", cancellable = true)
    private void coordinate__1186052107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186052107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "derivatives()[F", cancellable = true)
    private void derivatives__1236933301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236933301L))
            info.setReturnValue(null);
    }


}
