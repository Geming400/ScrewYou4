package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ARGB.class)
public class ARGB1935752114Mixin {
        @Inject(at = @At("HEAD"), method = "color(II)I", cancellable = true)
    private static void color_1540320493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1540320493L))
            info.setReturnValue(1421186240);
    }

    @Inject(at = @At("HEAD"), method = "color(III)I", cancellable = true)
    private static void color__1704926132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704926132L))
            info.setReturnValue(-1777084894);
    }

    @Inject(at = @At("HEAD"), method = "color(Lnet/minecraft/world/phys/Vec3;)I", cancellable = true)
    private static void color_1898887807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898887807L))
            info.setReturnValue(-1760413375);
    }

    @Inject(at = @At("HEAD"), method = "color(FI)I", cancellable = true)
    private static void color_1454433040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454433040L))
            info.setReturnValue(-1320846968);
    }

    @Inject(at = @At("HEAD"), method = "color(IIII)I", cancellable = true)
    private static void color_771643597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771643597L))
            info.setReturnValue(-2080302610);
    }

    @Inject(at = @At("HEAD"), method = "multiply(II)I", cancellable = true)
    private static void multiply_1758464780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758464780L))
            info.setReturnValue(-1234005806);
    }

    @Inject(at = @At("HEAD"), method = "red(I)I", cancellable = true)
    private static void red_1744517850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744517850L))
            info.setReturnValue(-485248423);
    }

    @Inject(at = @At("HEAD"), method = "average(II)I", cancellable = true)
    private static void average_1200920819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200920819L))
            info.setReturnValue(-1784963097);
    }

    @Inject(at = @At("HEAD"), method = "alpha(I)I", cancellable = true)
    private static void alpha_1376167399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376167399L))
            info.setReturnValue(2022748116);
    }

    @Inject(at = @At("HEAD"), method = "blue(I)I", cancellable = true)
    private static void blue_628553699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628553699L))
            info.setReturnValue(1627334519);
    }

    @Inject(at = @At("HEAD"), method = "black(F)I", cancellable = true)
    private static void black_1079443781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079443781L))
            info.setReturnValue(-204048193);
    }

    @Inject(at = @At("HEAD"), method = "black(I)I", cancellable = true)
    private static void black_1082214344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082214344L))
            info.setReturnValue(1871795764);
    }

    @Inject(at = @At("HEAD"), method = "green(I)I", cancellable = true)
    private static void green__1573375028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573375028L))
            info.setReturnValue(-188140247);
    }

    @Inject(at = @At("HEAD"), method = "white(F)I", cancellable = true)
    private static void white__257559057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257559057L))
            info.setReturnValue(1213029548);
    }

    @Inject(at = @At("HEAD"), method = "white(I)I", cancellable = true)
    private static void white__254788494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254788494L))
            info.setReturnValue(-2075485532);
    }

    @Inject(at = @At("HEAD"), method = "colorFromFloat(FFFF)I", cancellable = true)
    private static void colorFromFloat__489828287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489828287L))
            info.setReturnValue(862245263);
    }

    @Inject(at = @At("HEAD"), method = "greyscale(I)I", cancellable = true)
    private static void greyscale_1867882644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867882644L))
            info.setReturnValue(514770274);
    }

    @Inject(at = @At("HEAD"), method = "gray(F)I", cancellable = true)
    private static void gray_1757126825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757126825L))
            info.setReturnValue(1732741533);
    }

    @Inject(at = @At("HEAD"), method = "toABGR(I)I", cancellable = true)
    private static void toABGR__924768368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924768368L))
            info.setReturnValue(-746306672);
    }

    @Inject(at = @At("HEAD"), method = "meanLinear(IIII)I", cancellable = true)
    private static void meanLinear_2040042694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040042694L))
            info.setReturnValue(-933547154);
    }

    @Inject(at = @At("HEAD"), method = "alphaBlend(II)I", cancellable = true)
    private static void alphaBlend__632775491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632775491L))
            info.setReturnValue(120627279);
    }

    @Inject(at = @At("HEAD"), method = "fromABGR(I)I", cancellable = true)
    private static void fromABGR__1386823169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386823169L))
            info.setReturnValue(-20781928);
    }

    @Inject(at = @At("HEAD"), method = "alphaFloat(I)F", cancellable = true)
    private static void alphaFloat_553247972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553247972L))
            info.setReturnValue(4.256748E8F);
    }

    @Inject(at = @At("HEAD"), method = "greenFloat(I)F", cancellable = true)
    private static void greenFloat_1769881119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769881119L))
            info.setReturnValue(4.256748E8F);
    }

    @Inject(at = @At("HEAD"), method = "redFloat(I)F", cancellable = true)
    private static void redFloat__815042607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815042607L))
            info.setReturnValue(4.256748E8F);
    }

    @Inject(at = @At("HEAD"), method = "blueFloat(I)F", cancellable = true)
    private static void blueFloat__635867032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635867032L))
            info.setReturnValue(4.256748E8F);
    }

    @Inject(at = @At("HEAD"), method = "srgbLerp(FII)I", cancellable = true)
    private static void srgbLerp__630440649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630440649L))
            info.setReturnValue(-459064552);
    }

    @Inject(at = @At("HEAD"), method = "linearLerp(FII)I", cancellable = true)
    private static void linearLerp__2103204766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103204766L))
            info.setReturnValue(613200668);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(IFFF)I", cancellable = true)
    private static void scaleRGB__738228502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738228502L))
            info.setReturnValue(2093699229);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(IF)I", cancellable = true)
    private static void scaleRGB_1905321642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905321642L))
            info.setReturnValue(-1974160861);
    }

    @Inject(at = @At("HEAD"), method = "scaleRGB(II)I", cancellable = true)
    private static void scaleRGB_1908092205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908092205L))
            info.setReturnValue(-154882003);
    }

    @Inject(at = @At("HEAD"), method = "addRgb(II)I", cancellable = true)
    private static void addRgb_1839667140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839667140L))
            info.setReturnValue(415445103);
    }

    @Inject(at = @At("HEAD"), method = "opaque(I)I", cancellable = true)
    private static void opaque__1869047190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869047190L))
            info.setReturnValue(-1132281941);
    }

    @Inject(at = @At("HEAD"), method = "as8BitChannel(F)I", cancellable = true)
    private static void as8BitChannel__403268190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403268190L))
            info.setReturnValue(-318109562);
    }

    @Inject(at = @At("HEAD"), method = "transparent(I)I", cancellable = true)
    private static void transparent__1524790565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524790565L))
            info.setReturnValue(-523959954);
    }

    @Inject(at = @At("HEAD"), method = "linearToSrgbChannel(F)I", cancellable = true)
    private static void linearToSrgbChannel__1659228849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659228849L))
            info.setReturnValue(-1823296995);
    }

    @Inject(at = @At("HEAD"), method = "vector4fFromARGB32(I)Lorg/joml/Vector4f;", cancellable = true)
    private static void vector4fFromARGB32_1418154652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418154652L))
            info.setReturnValue(new org.joml.Vector4f());
    }

    @Inject(at = @At("HEAD"), method = "setBrightness(IF)I", cancellable = true)
    private static void setBrightness_2008610170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008610170L))
            info.setReturnValue(-1821608618);
    }

    @Inject(at = @At("HEAD"), method = "srgbToLinearChannel(I)F", cancellable = true)
    private static void srgbToLinearChannel_680138127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680138127L))
            info.setReturnValue(4.256748E8F);
    }

    @Inject(at = @At("HEAD"), method = "multiplyAlpha(IF)I", cancellable = true)
    private static void multiplyAlpha_1749968979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749968979L))
            info.setReturnValue(1515125850);
    }

    @Inject(at = @At("HEAD"), method = "vector3fFromRGB24(I)Lorg/joml/Vector3f;", cancellable = true)
    private static void vector3fFromRGB24__689741184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689741184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setVector4fFromARGB32(Lorg/joml/Vector4f;I)Lorg/joml/Vector4f;", cancellable = true)
    private static void setVector4fFromARGB32__1867891548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867891548L))
            info.setReturnValue(new org.joml.Vector4f());
    }

    @Inject(at = @At("HEAD"), method = "subtractRgb(II)I", cancellable = true)
    private static void subtractRgb__2056092041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056092041L))
            info.setReturnValue(-1289635602);
    }


}
