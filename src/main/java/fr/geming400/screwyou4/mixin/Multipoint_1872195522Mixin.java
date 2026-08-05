package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CubicSpline.Multipoint.class)
public class Multipoint_1872195522Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_963569253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963569253L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1652348250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652348250L))
            info.setReturnValue("UQ%yu03o'.F T\uBFE2\u1BA8j<#6--:vEB?%-2\u5D4B\u48BBoy`/&m\u3DC6>}*M(&6#;c|TW^Ng\u6514l");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1244850669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244850669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1865419684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865419684L))
            info.setReturnValue(-1179831130);
    }

    @Inject(at = @At("HEAD"), method = "locations()[F", cancellable = true)
    private void locations_244760105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244760105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue__1604846569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604846569L))
            info.setReturnValue(2.153621E8F);
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue_217459589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217459589L))
            info.setReturnValue(2.153621E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1359933895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359933895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/CubicSpline$Multipoint;Ljava/lang/Object;)F", cancellable = true)
    private static void sample__1403919392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403919392L))
            info.setReturnValue(2.153621E8F);
    }

    @Inject(at = @At("HEAD"), method = "parityString()Ljava/lang/String;", cancellable = true)
    private void parityString__532892760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532892760L))
            info.setReturnValue("?#;&\u31DEOy2P,?");
    }

    @Inject(at = @At("HEAD"), method = "mapCoordinates(Ljava/util/function/UnaryOperator;)Lnet/minecraft/util/CubicSpline;", cancellable = true)
    private void mapCoordinates__898475367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898475367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "coordinate()Lnet/minecraft/util/BoundedFloatFunction;", cancellable = true)
    private void coordinate_1226265981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226265981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "derivatives()[F", cancellable = true)
    private void derivatives_2048766999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048766999L))
            info.setReturnValue(null);
    }


}
