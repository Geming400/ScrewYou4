package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ARGB.class)
public class ARGB1935752114Mixin {
        @Inject(at = @At("HEAD"), method = "color(II)I", cancellable = true)
    private static void color_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color(FI)I", cancellable = true)
    private static void color_853972947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(853972947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color(III)I", cancellable = true)
    private static void color_1155647465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155647465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color(IIII)I", cancellable = true)
    private static void color__744888112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744888112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color(Lnet/minecraft/world/phys/Vec3;)I", cancellable = true)
    private static void color__1991491428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991491428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(II)I", cancellable = true)
    private static void multiply_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "red(I)I", cancellable = true)
    private static void red__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "average(II)I", cancellable = true)
    private static void average_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blue(I)I", cancellable = true)
    private static void blue__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "black(I)I", cancellable = true)
    private static void black__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "black(F)I", cancellable = true)
    private static void black__1148081018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148081018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "green(I)I", cancellable = true)
    private static void green__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "white(F)I", cancellable = true)
    private static void white__1148081018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148081018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "white(I)I", cancellable = true)
    private static void white__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "srgbLerp(FII)I", cancellable = true)
    private static void srgbLerp__1506863578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506863578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "opaque(I)I", cancellable = true)
    private static void opaque__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorFromFloat(FFFF)I", cancellable = true)
    private static void colorFromFloat__134553584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134553584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVector4fFromARGB32(Lorg/joml/Vector4f;I)Lorg/joml/Vector4f;", cancellable = true)
    private static void setVector4fFromARGB32__1356330608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356330608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBrightness(IF)I", cancellable = true)
    private static void setBrightness_937089837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937089837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alpha(I)I", cancellable = true)
    private static void alpha__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vector3fFromRGB24(I)Lorg/joml/Vector3f;", cancellable = true)
    private static void vector3fFromRGB24_1141414833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141414833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vector4fFromARGB32(I)Lorg/joml/Vector4f;", cancellable = true)
    private static void vector4fFromARGB32_1142338354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142338354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "greenFloat(I)F", cancellable = true)
    private static void greenFloat__1145313338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145313338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "redFloat(I)F", cancellable = true)
    private static void redFloat__1145313338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145313338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blueFloat(I)F", cancellable = true)
    private static void blueFloat__1145313338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145313338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(IFFF)I", cancellable = true)
    private static void scaleRGB_798910125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798910125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(II)I", cancellable = true)
    private static void scaleRGB_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(IF)I", cancellable = true)
    private static void scaleRGB_937089837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937089837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alphaFloat(I)F", cancellable = true)
    private static void alphaFloat__1145313338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145313338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gray(F)I", cancellable = true)
    private static void gray__1148081018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148081018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "meanLinear(IIII)I", cancellable = true)
    private static void meanLinear__744888112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744888112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "srgbToLinearChannel(I)F", cancellable = true)
    private static void srgbToLinearChannel__1145313338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145313338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "linearToSrgbChannel(F)I", cancellable = true)
    private static void linearToSrgbChannel__1148081018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148081018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transparent(I)I", cancellable = true)
    private static void transparent__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiplyAlpha(IF)I", cancellable = true)
    private static void multiplyAlpha_937089837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937089837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toABGR(I)I", cancellable = true)
    private static void toABGR__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "linearLerp(FII)I", cancellable = true)
    private static void linearLerp__1506863578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506863578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "greyscale(I)I", cancellable = true)
    private static void greyscale__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alphaBlend(II)I", cancellable = true)
    private static void alphaBlend_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRgb(II)I", cancellable = true)
    private static void addRgb_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromABGR(I)I", cancellable = true)
    private static void fromABGR__1145310455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1145310455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "as8BitChannel(F)I", cancellable = true)
    private static void as8BitChannel__1148081018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148081018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtractRgb(II)I", cancellable = true)
    private static void subtractRgb_939860400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939860400L))
            info.setReturnValue(null);
    }


}
