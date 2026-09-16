package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Vec3i.class)
public class Vec3i_1702107108Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void get__1949160684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949160684L))
            info.setReturnValue(461229492);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_793480343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793480343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1822437160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822437160L))
            info.setReturnValue("\u707FTJ*cY:\uAF319N]wn'JXz\u8D55A#DT.pjjD#z.K\u01B1G&4l=\u4FAC]=\u41C1J2[>\uB4966\u2109WPs\u1901}2JO'9`\u8A87oSl\u0A20,\"yU2'\uA625^9:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2035508594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035508594L))
            info.setReturnValue(-957334851);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__189996827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-189996827L))
            info.setReturnValue(2125542480);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void compareTo_877785802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(877785802L))
            info.setReturnValue(1053125331);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_795492053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795492053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_472395255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472395255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString__1391618018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1391618018L))
            info.setReturnValue("GR`\u704AYoJ\u8E14X{5F\u48B3:FRvqVs");
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply_325558886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325558886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply__1538186618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538186618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract__228295082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228295082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY__1689422874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689422874L))
            info.setReturnValue(978973723);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX__1718052025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718052025L))
            info.setReturnValue(1432526741);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ__1660793723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660793723L))
            info.setReturnValue(-348531749);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__572872565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-572872565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__771856477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771856477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1808740150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808740150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below__1489992748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489992748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1698839225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698839225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross_1303414658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303414658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1131632192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131632192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1364833741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364833741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/core/Vec3i;D)Z", cancellable = true)
    private void closerThan_1224555432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224555432L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toMutable()Lorg/joml/Vector3i;", cancellable = true)
    private void toMutable__564727997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564727997L))
            info.setReturnValue(new org.joml.Vector3i());
    }

    @Inject(at = @At("HEAD"), method = "distSqr(Lnet/minecraft/core/Vec3i;)D", cancellable = true)
    private void distSqr__289607113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289607113L))
            info.setReturnValue(6.364212001490681E8D);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1551931027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551931027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1040666976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040666976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__751045253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751045253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_93546706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93546706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north__976100507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976100507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_1056118184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056118184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1033025123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033025123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1162475408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162475408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distToCenterSqr(DDD)D", cancellable = true)
    private void distToCenterSqr_1521801462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521801462L))
            info.setReturnValue(6.364212007184411E8D);
    }

    @Inject(at = @At("HEAD"), method = "distToCenterSqr(Lnet/minecraft/core/Position;)D", cancellable = true)
    private void distToCenterSqr_2055727988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055727988L))
            info.setReturnValue(6.364212007408438E8D);
    }

    @Inject(at = @At("HEAD"), method = "distManhattan(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void distManhattan__212732976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212732976L))
            info.setReturnValue(2020036502);
    }

    @Inject(at = @At("HEAD"), method = "distChessboard(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void distChessboard_1059036510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059036510L))
            info.setReturnValue(1253820079);
    }

    @Inject(at = @At("HEAD"), method = "closerToCenterThan(Lnet/minecraft/core/Position;D)Z", cancellable = true)
    private void closerToCenterThan_549342065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549342065L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offsetCodec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void offsetCodec_1069104165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069104165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distToLowCornerSqr(DDD)D", cancellable = true)
    private void distToLowCornerSqr_2013593380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013593380L))
            info.setReturnValue(6.364212007214081E8D);
    }


}
