package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Mth.class)
public class Mth_490547277Mixin {
        @Inject(at = @At("HEAD"), method = "length(DD)D", cancellable = true)
    private static void length_666706239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666706239L))
            info.setReturnValue(6.339107000288312E8D);
    }

    @Inject(at = @At("HEAD"), method = "length(FF)F", cancellable = true)
    private static void length_725813505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725813505L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "length(DDD)D", cancellable = true)
    private static void length_1679801791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679801791L))
            info.setReturnValue(6.339107003338928E8D);
    }

    @Inject(at = @At("HEAD"), method = "abs(F)F", cancellable = true)
    private static void abs_452683983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452683983L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "abs(I)I", cancellable = true)
    private static void abs_455457429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455457429L))
            info.setReturnValue(487168655);
    }

    @Inject(at = @At("HEAD"), method = "sin(D)F", cancellable = true)
    private static void sin_1448614323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448614323L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "cos(D)F", cancellable = true)
    private static void cos__1982374110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982374110L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "atan2(DD)D", cancellable = true)
    private static void atan2__902216173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-902216173L))
            info.setReturnValue(6.339107002686466E8D);
    }

    @Inject(at = @At("HEAD"), method = "sqrt(F)F", cancellable = true)
    private static void sqrt__818334979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818334979L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "floor(F)I", cancellable = true)
    private static void floor__1436711892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436711892L))
            info.setReturnValue(2051257701);
    }

    @Inject(at = @At("HEAD"), method = "floor(D)I", cancellable = true)
    private static void floor__1438558934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438558934L))
            info.setReturnValue(-633583065);
    }

    @Inject(at = @At("HEAD"), method = "ceil(F)I", cancellable = true)
    private static void ceil_1230015077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230015077L))
            info.setReturnValue(-1844960939);
    }

    @Inject(at = @At("HEAD"), method = "ceil(D)I", cancellable = true)
    private static void ceil_1228168035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228168035L))
            info.setReturnValue(-811760713);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;I)I", cancellable = true)
    private static void getInt_708555410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708555410L))
            info.setReturnValue(-1652692788);
    }

    @Inject(at = @At("HEAD"), method = "clamp(FFF)F", cancellable = true)
    private static void clamp_305980632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305980632L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "clamp(III)I", cancellable = true)
    private static void clamp__1237814722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237814722L))
            info.setReturnValue(-3273739);
    }

    @Inject(at = @At("HEAD"), method = "clamp(JJJ)J", cancellable = true)
    private static void clamp__320757408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320757408L))
            info.setReturnValue(-3343074482764112142L);
    }

    @Inject(at = @At("HEAD"), method = "clamp(DDD)D", cancellable = true)
    private static void clamp__1528133996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528133996L))
            info.setReturnValue(6.339107009457705E8D);
    }

    @Inject(at = @At("HEAD"), method = "map(FFFFF)F", cancellable = true)
    private static void map__914550087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914550087L))
            info.setReturnValue(6.339107E8F);
    }

    @Inject(at = @At("HEAD"), method = "map(DDDDD)D", cancellable = true)
    private static void map_1675590837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675590837L))
            info.setReturnValue(6.339107003613279E8D);
    }

    @Inject(at = @At("HEAD"), method = "equal(FF)Z", cancellable = true)
    private static void equal_1159681031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1159681031L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "equal(DD)Z", cancellable = true)
    private static void equal_1100575687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100575687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sign(D)I", cancellable = true)
    private static void sign_2028422683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028422683L))
            info.setReturnValue(-2054481007);
    }

    @Inject(at = @At("HEAD"), method = "nextDouble(Lnet/minecraft/util/RandomSource;DD)D", cancellable = true)
    private static void nextDouble_330865961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(330865961L))
            info.setReturnValue(6.339107001798848E8D);
    }

    @Inject(at = @At("HEAD"), method = "floorDiv(II)I", cancellable = true)
    private static void floorDiv__1662331451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662331451L))
            info.setReturnValue(997438360);
    }

    @Inject(at = @At("HEAD"), method = "binarySearch(IILjava/util/function/IntPredicate;)I", cancellable = true)
    private static void binarySearch_439818219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439818219L))
            info.setReturnValue(1156447704);
    }

    @Inject(at = @At("HEAD"), method = "nextInt(Lnet/minecraft/util/RandomSource;II)I", cancellable = true)
    private static void nextInt_443302886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443302886L))
            info.setReturnValue(1219920057);
    }

    @Inject(at = @At("HEAD"), method = "normal(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void normal__1570123218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570123218L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSeed(III)J", cancellable = true)
    private static void getSeed__831711189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831711189L))
            info.setReturnValue(-7925510347885700415L);
    }

    @Inject(at = @At("HEAD"), method = "getSeed(Lnet/minecraft/core/Vec3i;)J", cancellable = true)
    private static void getSeed__1582784923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582784923L))
            info.setReturnValue(1683584705554952711L);
    }

    @Inject(at = @At("HEAD"), method = "square(J)J", cancellable = true)
    private static void square__2013246910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013246910L))
            info.setReturnValue(-6621942047762992466L);
    }

    @Inject(at = @At("HEAD"), method = "square(F)F", cancellable = true)
    private static void square__2016944838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016944838L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "square(D)D", cancellable = true)
    private static void square__2018793802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018793802L))
            info.setReturnValue(6.349197002734792E8D);
    }

    @Inject(at = @At("HEAD"), method = "square(I)I", cancellable = true)
    private static void square__2014171392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014171392L))
            info.setReturnValue(-642716509);
    }

    @Inject(at = @At("HEAD"), method = "nextFloat(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void nextFloat__2134527376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134527376L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "isPowerOfTwo(J)Z", cancellable = true)
    private static void isPowerOfTwo_1647524655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647524655L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowerOfTwo(I)Z", cancellable = true)
    private static void isPowerOfTwo_1646601134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646601134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "invSqrt(D)D", cancellable = true)
    private static void invSqrt_158070602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158070602L))
            info.setReturnValue(6.349197004112358E8D);
    }

    @Inject(at = @At("HEAD"), method = "invSqrt(F)F", cancellable = true)
    private static void invSqrt_159919566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159919566L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lerp(DLnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void lerp_753659496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753659496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(DDD)D", cancellable = true)
    private static void lerp__2126445744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126445744L))
            info.setReturnValue(6.349197004174225E8D);
    }

    @Inject(at = @At("HEAD"), method = "lerp(FFF)F", cancellable = true)
    private static void lerp__292331116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-292331116L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(DD)D", cancellable = true)
    private static void lengthSquared__1525368156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525368156L))
            info.setReturnValue(6.34919700509289E8D);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(FFF)F", cancellable = true)
    private static void lengthSquared__15880386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-15880386L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lengthSquared(DDD)D", cancellable = true)
    private static void lengthSquared__1849995014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849995014L))
            info.setReturnValue(6.349197006523874E8D);
    }

    @Inject(at = @At("HEAD"), method = "packDegrees(F)B", cancellable = true)
    private static void packDegrees__1569689817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569689817L))
            info.setReturnValue(127);
    }

    @Inject(at = @At("HEAD"), method = "unpackDegrees(B)F", cancellable = true)
    private static void unpackDegrees_398849710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398849710L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lerp2(DDDDDD)D", cancellable = true)
    private static void lerp2__815817878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815817878L))
            info.setReturnValue(6.349197000718861E8D);
    }

    @Inject(at = @At("HEAD"), method = "ceillog2(I)I", cancellable = true)
    private static void ceillog2_1235165526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235165526L))
            info.setReturnValue(401830082);
    }

    @Inject(at = @At("HEAD"), method = "absMax(FF)F", cancellable = true)
    private static void absMax_1787650773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787650773L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "absMax(II)I", cancellable = true)
    private static void absMax_1876311672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876311672L))
            info.setReturnValue(-410396512);
    }

    @Inject(at = @At("HEAD"), method = "absMax(DD)D", cancellable = true)
    private static void absMax_1728543507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728543507L))
            info.setReturnValue(6.349197009481246E8D);
    }

    @Inject(at = @At("HEAD"), method = "approach(FFF)F", cancellable = true)
    private static void approach__1891035451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891035451L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lfloor(D)J", cancellable = true)
    private static void lfloor__382526209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382526209L))
            info.setReturnValue(7952407051170543785L);
    }

    @Inject(at = @At("HEAD"), method = "hsvToArgb(FFFI)I", cancellable = true)
    private static void hsvToArgb__2038776613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038776613L))
            info.setReturnValue(-505783200);
    }

    @Inject(at = @At("HEAD"), method = "log2(I)I", cancellable = true)
    private static void log2__556770671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556770671L))
            info.setReturnValue(1414366986);
    }

    @Inject(at = @At("HEAD"), method = "lerp3(DDDDDDDDDDD)D", cancellable = true)
    private static void lerp3__379280267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379280267L))
            info.setReturnValue(6.349197004407319E8D);
    }

    @Inject(at = @At("HEAD"), method = "rotLerp(DDD)D", cancellable = true)
    private static void rotLerp__1857354041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857354041L))
            info.setReturnValue(6.349197002814527E8D);
    }

    @Inject(at = @At("HEAD"), method = "rotLerp(FFF)F", cancellable = true)
    private static void rotLerp__23239413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23239413L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "rotLerpRad(FFF)F", cancellable = true)
    private static void rotLerpRad__1929480860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929480860L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "frac(D)D", cancellable = true)
    private static void frac__1838628153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838628153L))
            info.setReturnValue(6.349197007158283E8D);
    }

    @Inject(at = @At("HEAD"), method = "frac(F)F", cancellable = true)
    private static void frac__1836779189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836779189L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "ceilLong(D)J", cancellable = true)
    private static void ceilLong__1963128256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963128256L))
            info.setReturnValue(-8263079139276877131L);
    }

    @Inject(at = @At("HEAD"), method = "smoothstep(D)D", cancellable = true)
    private static void smoothstep_1547094355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547094355L))
            info.setReturnValue(6.349197007196358E8D);
    }

    @Inject(at = @At("HEAD"), method = "cube(F)F", cancellable = true)
    private static void cube_1143182930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143182930L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "clampedMap(FFFFF)F", cancellable = true)
    private static void clampedMap__2110629313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110629313L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "clampedMap(DDDDD)D", cancellable = true)
    private static void clampedMap_479511611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479511611L))
            info.setReturnValue(6.349197003100581E8D);
    }

    @Inject(at = @At("HEAD"), method = "catmullrom(FFFFF)F", cancellable = true)
    private static void catmullrom_1416912111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416912111L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "hsvToRgb(FFF)I", cancellable = true)
    private static void hsvToRgb__1110107737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110107737L))
            info.setReturnValue(-589991731);
    }

    @Inject(at = @At("HEAD"), method = "wobble(D)D", cancellable = true)
    private static void wobble__2144152790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144152790L))
            info.setReturnValue(6.349197001260638E8D);
    }

    @Inject(at = @At("HEAD"), method = "quantize(DI)I", cancellable = true)
    private static void quantize__1178704674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178704674L))
            info.setReturnValue(1999696294);
    }

    @Inject(at = @At("HEAD"), method = "createInsecureUUID(Lnet/minecraft/util/RandomSource;)Ljava/util/UUID;", cancellable = true)
    private static void createInsecureUUID__772466204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772466204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotationAroundAxis(Lorg/joml/Vector3fc;Lorg/joml/Quaternionf;Lorg/joml/Quaternionf;)Lorg/joml/Quaternionf;", cancellable = true)
    private static void rotationAroundAxis_771566214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771566214L))
            info.setReturnValue(new org.joml.Quaternionf());
    }

    @Inject(at = @At("HEAD"), method = "degreesDifferenceAbs(FF)F", cancellable = true)
    private static void degreesDifferenceAbs__2116737831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116737831L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "mulAndTruncate(Lorg/apache/commons/lang3/math/Fraction;I)I", cancellable = true)
    private static void mulAndTruncate__2055407313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055407313L))
            info.setReturnValue(301375582);
    }

    @Inject(at = @At("HEAD"), method = "approachDegrees(FFF)F", cancellable = true)
    private static void approachDegrees__2135697796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2135697796L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "lerpDiscrete(FII)I", cancellable = true)
    private static void lerpDiscrete__730224560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730224560L))
            info.setReturnValue(-1954625747);
    }

    @Inject(at = @At("HEAD"), method = "chessboardDistance(IIII)I", cancellable = true)
    private static void chessboardDistance_2084359631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084359631L))
            info.setReturnValue(-1334957502);
    }

    @Inject(at = @At("HEAD"), method = "murmurHash3Mixer(I)I", cancellable = true)
    private static void murmurHash3Mixer_1327689383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327689383L))
            info.setReturnValue(1790415339);
    }

    @Inject(at = @At("HEAD"), method = "isMultipleOf(II)Z", cancellable = true)
    private static void isMultipleOf__1377859542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377859542L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "randomBetweenInclusive(Lnet/minecraft/util/RandomSource;II)I", cancellable = true)
    private static void randomBetweenInclusive_1963059857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963059857L))
            info.setReturnValue(-1854945028);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees90(F)F", cancellable = true)
    private static void wrapDegrees90__308148687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308148687L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "randomBetween(Lnet/minecraft/util/RandomSource;FF)F", cancellable = true)
    private static void randomBetween_1584475404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584475404L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "smoothstepDerivative(D)D", cancellable = true)
    private static void smoothstepDerivative_461911354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461911354L))
            info.setReturnValue(6.34919700729384E8D);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(II)I", cancellable = true)
    private static void positiveModulo__358635109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358635109L))
            info.setReturnValue(-671935284);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(DD)D", cancellable = true)
    private static void positiveModulo__506403274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506403274L))
            info.setReturnValue(6.349197001553203E8D);
    }

    @Inject(at = @At("HEAD"), method = "positiveModulo(FF)F", cancellable = true)
    private static void positiveModulo__447296008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447296008L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "triangleWave(FF)F", cancellable = true)
    private static void triangleWave__964456858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964456858L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "rayIntersectsAABB(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private static void rayIntersectsAABB__559777052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559777052L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "smallestSquareSide(I)I", cancellable = true)
    private static void smallestSquareSide_969309686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969309686L))
            info.setReturnValue(-1907708695);
    }

    @Inject(at = @At("HEAD"), method = "rotateIfNecessary(FFF)F", cancellable = true)
    private static void rotateIfNecessary_1677454964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677454964L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "roundToward(II)I", cancellable = true)
    private static void roundToward_1286247429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286247429L))
            info.setReturnValue(1439847868);
    }

    @Inject(at = @At("HEAD"), method = "roundToward(JJ)J", cancellable = true)
    private static void roundToward_1315801062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315801062L))
            info.setReturnValue(6036577072531395138L);
    }

    @Inject(at = @At("HEAD"), method = "fastInvCubeRoot(F)F", cancellable = true)
    private static void fastInvCubeRoot_1474811049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474811049L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(J)F", cancellable = true)
    private static void wrapDegrees__2019834466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019834466L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(F)F", cancellable = true)
    private static void wrapDegrees__2023528550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023528550L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(D)D", cancellable = true)
    private static void wrapDegrees__2025377514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025377514L))
            info.setReturnValue(6.349197008079664E8D);
    }

    @Inject(at = @At("HEAD"), method = "wrapDegrees(I)I", cancellable = true)
    private static void wrapDegrees__2020755104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020755104L))
            info.setReturnValue(-1053848853);
    }

    @Inject(at = @At("HEAD"), method = "positiveCeilDiv(II)I", cancellable = true)
    private static void positiveCeilDiv__195947049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195947049L))
            info.setReturnValue(-1479943982);
    }

    @Inject(at = @At("HEAD"), method = "positiveCeilDiv(JJ)J", cancellable = true)
    private static void positiveCeilDiv__166393416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166393416L))
            info.setReturnValue(-1017586739007916797L);
    }

    @Inject(at = @At("HEAD"), method = "outFromOrigin(III)Ljava/util/stream/IntStream;", cancellable = true)
    private static void outFromOrigin_1281335803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281335803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outFromOrigin(IIII)Ljava/util/stream/IntStream;", cancellable = true)
    private static void outFromOrigin__2101683920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101683920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inverseLerp(DDD)D", cancellable = true)
    private static void inverseLerp_494856864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494856864L))
            info.setReturnValue(6.349197003824472E8D);
    }

    @Inject(at = @At("HEAD"), method = "inverseLerp(FFF)F", cancellable = true)
    private static void inverseLerp__1965995804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965995804L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "degreesDifference(FF)F", cancellable = true)
    private static void degreesDifference_1877816931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877816931L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "fastInvSqrt(D)D", cancellable = true)
    private static void fastInvSqrt__1961966514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961966514L))
            info.setReturnValue(6.349197008418053E8D);
    }

    @Inject(at = @At("HEAD"), method = "clampedLerp(DDD)D", cancellable = true)
    private static void clampedLerp_883012362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883012362L))
            info.setReturnValue(6.349197000522963E8D);
    }

    @Inject(at = @At("HEAD"), method = "clampedLerp(FFF)F", cancellable = true)
    private static void clampedLerp__1577840306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577840306L))
            info.setReturnValue(6.349197E8F);
    }

    @Inject(at = @At("HEAD"), method = "smallestEncompassingPowerOfTwo(I)I", cancellable = true)
    private static void smallestEncompassingPowerOfTwo__885517717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885517717L))
            info.setReturnValue(1660740485);
    }

    @Inject(at = @At("HEAD"), method = "lerpInt(FII)I", cancellable = true)
    private static void lerpInt__2064285256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064285256L))
            info.setReturnValue(788707722);
    }


}
