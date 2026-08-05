package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Mth.class)
public class Mth_490547277Mixin {
        @Inject(at = @At("HEAD"), method = "length(DD)D", cancellable = true)
    private static void length__653112603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653112603L))
            info.setReturnValue(8.515200021754766E7D);
    }

    @Inject(at = @At("HEAD"), method = "length(FF)F", cancellable = true)
    private static void length__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "length(DDD)D", cancellable = true)
    private static void length__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "abs(F)F", cancellable = true)
    private static void abs_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "abs(I)I", cancellable = true)
    private static void abs_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "sin(D)F", cancellable = true)
    private static void sin_1699831515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699831515L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "cos(D)F", cancellable = true)
    private static void cos_1699831515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699831515L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "atan2(DD)D", cancellable = true)
    private static void atan2__653112603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653112603L))
            info.setReturnValue(8.515200021754766E7D);
    }

    @Inject(at = @At("HEAD"), method = "sqrt(F)F", cancellable = true)
    private static void sqrt_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "floor(F)I", cancellable = true)
    private static void floor_1701681440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701681440L))
            info.setReturnValue(-767451010);
    }

    @Inject(at = @At("HEAD"), method = "floor(D)I", cancellable = true)
    private static void floor_1699834398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699834398L))
            info.setReturnValue(1593360616);
    }

    @Inject(at = @At("HEAD"), method = "ceil(D)I", cancellable = true)
    private static void ceil_1699834398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699834398L))
            info.setReturnValue(1593360616);
    }

    @Inject(at = @At("HEAD"), method = "ceil(F)I", cancellable = true)
    private static void ceil_1701681440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701681440L))
            info.setReturnValue(-767451010);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;I)I", cancellable = true)
    private static void getInt_1881392345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881392345L))
            info.setReturnValue(-1759711665);
    }

    @Inject(at = @At("HEAD"), method = "clamp(III)I", cancellable = true)
    private static void clamp__289557373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289557373L))
            info.setReturnValue(2039204746);
    }

    @Inject(at = @At("HEAD"), method = "clamp(FFF)F", cancellable = true)
    private static void clamp_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "clamp(JJJ)J", cancellable = true)
    private static void clamp_627499941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627499941L))
            info.setReturnValue(1419442394988691460L);
    }

    @Inject(at = @At("HEAD"), method = "clamp(DDD)D", cancellable = true)
    private static void clamp__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "map(FFFFF)F", cancellable = true)
    private static void map_760574045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760574045L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "map(DDDDD)D", cancellable = true)
    private static void map__944252327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944252327L))
            info.setReturnValue(8.515200035780883E7D);
    }

    @Inject(at = @At("HEAD"), method = "equal(FF)Z", cancellable = true)
    private static void equal__593986117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593986117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "equal(DD)Z", cancellable = true)
    private static void equal__653091461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653091461L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sign(D)I", cancellable = true)
    private static void sign_1699834398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699834398L))
            info.setReturnValue(1593360616);
    }

    @Inject(at = @At("HEAD"), method = "nextDouble(Lnet/minecraft/util/RandomSource;DD)D", cancellable = true)
    private static void nextDouble_1455579269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455579269L))
            info.setReturnValue(8.515200050436918E7D);
    }

    @Inject(at = @At("HEAD"), method = "floorDiv(II)I", cancellable = true)
    private static void floorDiv__505344438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505344438L))
            info.setReturnValue(-1876066702);
    }

    @Inject(at = @At("HEAD"), method = "binarySearch(IILjava/util/function/IntPredicate;)I", cancellable = true)
    private static void binarySearch__652215326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652215326L))
            info.setReturnValue(1631150566);
    }

    @Inject(at = @At("HEAD"), method = "nextInt(Lnet/minecraft/util/RandomSource;II)I", cancellable = true)
    private static void nextInt_1603347434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603347434L))
            info.setReturnValue(1185062264);
    }

    @Inject(at = @At("HEAD"), method = "normal(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void normal_1514686535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514686535L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "getSeed(Lnet/minecraft/core/Vec3i;)J", cancellable = true)
    private static void getSeed__1127550420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127550420L))
            info.setReturnValue(-2901995648045748234L);
    }

    @Inject(at = @At("HEAD"), method = "getSeed(III)J", cancellable = true)
    private static void getSeed__289556412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289556412L))
            info.setReturnValue(-5303260102656194661L);
    }

    @Inject(at = @At("HEAD"), method = "square(D)D", cancellable = true)
    private static void square_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "square(J)J", cancellable = true)
    private static void square_1705376485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705376485L))
            info.setReturnValue(-4215181085254294457L);
    }

    @Inject(at = @At("HEAD"), method = "square(F)F", cancellable = true)
    private static void square_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "square(I)I", cancellable = true)
    private static void square_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "nextFloat(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void nextFloat_1514686535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514686535L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "isPowerOfTwo(J)Z", cancellable = true)
    private static void isPowerOfTwo_1705391861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705391861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowerOfTwo(I)Z", cancellable = true)
    private static void isPowerOfTwo_1704468340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704468340L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(FFF)F", cancellable = true)
    private static void lengthSquared_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(DDD)D", cancellable = true)
    private static void lengthSquared__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(DD)D", cancellable = true)
    private static void lengthSquared__653112603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653112603L))
            info.setReturnValue(8.515200021754766E7D);
    }

    @Inject(at = @At("HEAD"), method = "invSqrt(D)D", cancellable = true)
    private static void invSqrt_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "invSqrt(F)F", cancellable = true)
    private static void invSqrt_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "lerpInt(FII)I", cancellable = true)
    private static void lerpInt_1342898880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342898880L))
            info.setReturnValue(1397446315);
    }

    @Inject(at = @At("HEAD"), method = "smallestEncompassingPowerOfTwo(I)I", cancellable = true)
    private static void smallestEncompassingPowerOfTwo_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "lerp(FFF)F", cancellable = true)
    private static void lerp_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "lerp(DDD)D", cancellable = true)
    private static void lerp__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "lerp(DLnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void lerp__476470607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476470607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "approach(FFF)F", cancellable = true)
    private static void approach_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "lfloor(D)J", cancellable = true)
    private static void lfloor_1699835359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699835359L))
            info.setReturnValue(6158777280829118497L);
    }

    @Inject(at = @At("HEAD"), method = "hsvToArgb(FFFI)I", cancellable = true)
    private static void hsvToArgb__1576987859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576987859L))
            info.setReturnValue(1598284712);
    }

    @Inject(at = @At("HEAD"), method = "lerp2(DDDDDD)D", cancellable = true)
    private static void lerp2__1015273499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015273499L))
            info.setReturnValue(8.515200026948534E7D);
    }

    @Inject(at = @At("HEAD"), method = "ceillog2(I)I", cancellable = true)
    private static void ceillog2_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "absMax(DD)D", cancellable = true)
    private static void absMax__653112603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653112603L))
            info.setReturnValue(8.515200021754766E7D);
    }

    @Inject(at = @At("HEAD"), method = "absMax(II)I", cancellable = true)
    private static void absMax__505344438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505344438L))
            info.setReturnValue(-1876066702);
    }

    @Inject(at = @At("HEAD"), method = "absMax(FF)F", cancellable = true)
    private static void absMax__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "frac(D)D", cancellable = true)
    private static void frac_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "frac(F)F", cancellable = true)
    private static void frac_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "smoothstep(D)D", cancellable = true)
    private static void smoothstep_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "rotLerp(FFF)F", cancellable = true)
    private static void rotLerp_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "rotLerp(DDD)D", cancellable = true)
    private static void rotLerp__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "ceilLong(D)J", cancellable = true)
    private static void ceilLong_1699835359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699835359L))
            info.setReturnValue(6158777280829118497L);
    }

    @Inject(at = @At("HEAD"), method = "hsvToRgb(FFF)I", cancellable = true)
    private static void hsvToRgb_1254240864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254240864L))
            info.setReturnValue(1709522287);
    }

    @Inject(at = @At("HEAD"), method = "log2(I)I", cancellable = true)
    private static void log2_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "lerp3(DDDDDDDDDDD)D", cancellable = true)
    private static void lerp3__1904619815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904619815L))
            info.setReturnValue(8.515200031365871E7D);
    }

    @Inject(at = @At("HEAD"), method = "catmullrom(FFFFF)F", cancellable = true)
    private static void catmullrom_760574045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760574045L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "wobble(D)D", cancellable = true)
    private static void wobble_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "rotLerpRad(FFF)F", cancellable = true)
    private static void rotLerpRad_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "cube(F)F", cancellable = true)
    private static void cube_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "quantize(DI)I", cancellable = true)
    private static void quantize__648490193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648490193L))
            info.setReturnValue(269407595);
    }

    @Inject(at = @At("HEAD"), method = "clampedMap(DDDDD)D", cancellable = true)
    private static void clampedMap__944252327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944252327L))
            info.setReturnValue(8.515200035780883E7D);
    }

    @Inject(at = @At("HEAD"), method = "clampedMap(FFFFF)F", cancellable = true)
    private static void clampedMap_760574045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760574045L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "positiveCeilDiv(JJ)J", cancellable = true)
    private static void positiveCeilDiv__475790805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475790805L))
            info.setReturnValue(-351076641072303298L);
    }

    @Inject(at = @At("HEAD"), method = "positiveCeilDiv(II)I", cancellable = true)
    private static void positiveCeilDiv__505344438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505344438L))
            info.setReturnValue(-1876066702);
    }

    @Inject(at = @At("HEAD"), method = "mulAndTruncate(Lorg/apache/commons/lang3/math/Fraction;I)I", cancellable = true)
    private static void mulAndTruncate_1781850870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781850870L))
            info.setReturnValue(1243942401);
    }

    @Inject(at = @At("HEAD"), method = "inverseLerp(DDD)D", cancellable = true)
    private static void inverseLerp__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.515200052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "inverseLerp(FFF)F", cancellable = true)
    private static void inverseLerp_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "rotateIfNecessary(FFF)F", cancellable = true)
    private static void rotateIfNecessary_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(J)F", cancellable = true)
    private static void wrapDegrees_1705372641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705372641L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(D)D", cancellable = true)
    private static void wrapDegrees_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(I)I", cancellable = true)
    private static void wrapDegrees_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(F)F", cancellable = true)
    private static void wrapDegrees_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "fastInvCubeRoot(F)F", cancellable = true)
    private static void fastInvCubeRoot_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "triangleWave(FF)F", cancellable = true)
    private static void triangleWave__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "randomBetweenInclusive(Lnet/minecraft/util/RandomSource;II)I", cancellable = true)
    private static void randomBetweenInclusive_1603347434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603347434L))
            info.setReturnValue(1185062264);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees90(F)F", cancellable = true)
    private static void wrapDegrees90_1701678557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701678557L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "outFromOrigin(III)Ljava/util/stream/IntStream;", cancellable = true)
    private static void outFromOrigin_309074969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309074969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outFromOrigin(IIII)Ljava/util/stream/IntStream;", cancellable = true)
    private static void outFromOrigin_2117968594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117968594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMultipleOf(II)Z", cancellable = true)
    private static void isMultipleOf__505328101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505328101L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "murmurHash3Mixer(I)I", cancellable = true)
    private static void murmurHash3Mixer_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "smallestSquareSide(I)I", cancellable = true)
    private static void smallestSquareSide_1704452003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1704452003L))
            info.setReturnValue(11847758);
    }

    @Inject(at = @At("HEAD"), method = "createInsecureUUID(Lnet/minecraft/util/RandomSource;)Ljava/util/UUID;", cancellable = true)
    private static void createInsecureUUID__768171593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768171593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "approachDegrees(FFF)F", cancellable = true)
    private static void approachDegrees_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "degreesDifferenceAbs(FF)F", cancellable = true)
    private static void degreesDifferenceAbs__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "chessboardDistance(IIII)I", cancellable = true)
    private static void chessboardDistance_2104874346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104874346L))
            info.setReturnValue(-1022117497);
    }

    @Inject(at = @At("HEAD"), method = "rayIntersectsAABB(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private static void rayIntersectsAABB_946274822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(946274822L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "lerpDiscrete(FII)I", cancellable = true)
    private static void lerpDiscrete_1342898880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342898880L))
            info.setReturnValue(1397446315);
    }

    @Inject(at = @At("HEAD"), method = "smoothstepDerivative(D)D", cancellable = true)
    private static void smoothstepDerivative_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.515200019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "roundToward(II)I", cancellable = true)
    private static void roundToward__505344438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505344438L))
            info.setReturnValue(-1876066702);
    }

    @Inject(at = @At("HEAD"), method = "roundToward(JJ)J", cancellable = true)
    private static void roundToward__475790805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475790805L))
            info.setReturnValue(-351076641072303298L);
    }

    @Inject(at = @At("HEAD"), method = "degreesDifference(FF)F", cancellable = true)
    private static void degreesDifference__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "randomBetween(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void randomBetween_1514686535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514686535L))
            info.setReturnValue(8.5152E7F);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(DD)D", cancellable = true)
    private static void positiveModulo__653112603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653112603L))
            info.setReturnValue(8.515200021754766E7D);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(FF)F", cancellable = true)
    private static void positiveModulo__594005337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594005337L))
            info.setReturnValue(8.61533E7F);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(II)I", cancellable = true)
    private static void positiveModulo__505344438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505344438L))
            info.setReturnValue(-1875065402);
    }

    @Inject(at = @At("HEAD"), method = "rotationAroundAxis(Lorg/joml/Vector3fc;Lorg/joml/Quaternionf;Lorg/joml/Quaternionf;)Lorg/joml/Quaternionf;", cancellable = true)
    private static void rotationAroundAxis_364925018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364925018L))
            info.setReturnValue(new org.joml.Quaternionf());
    }

    @Inject(at = @At("HEAD"), method = "clampedLerp(DDD)D", cancellable = true)
    private static void clampedLerp__579876647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579876647L))
            info.setReturnValue(8.715420052170569E7D);
    }

    @Inject(at = @At("HEAD"), method = "clampedLerp(FFF)F", cancellable = true)
    private static void clampedLerp_1254237981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254237981L))
            info.setReturnValue(8.71542E7F);
    }

    @Inject(at = @At("HEAD"), method = "fastInvSqrt(D)D", cancellable = true)
    private static void fastInvSqrt_1699829593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699829593L))
            info.setReturnValue(8.715420019402795E7D);
    }

    @Inject(at = @At("HEAD"), method = "unpackDegrees(B)F", cancellable = true)
    private static void unpackDegrees_1697984473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697984473L))
            info.setReturnValue(8.71542E7F);
    }

    @Inject(at = @At("HEAD"), method = "packDegrees(F)B", cancellable = true)
    private static void packDegrees_1701674713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701674713L))
            info.setReturnValue(79);
    }


}
