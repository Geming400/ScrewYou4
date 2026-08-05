package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Vec3i.class)
public class Vec3i_1702107108Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$Axis;)I", cancellable = true)
    private void get__1426249282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426249282L))
            info.setReturnValue(-1932648815);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1207348426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207348426L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_566646636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566646636L))
            info.setReturnValue("@a\uC218=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1740369353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740369353L))
            info.setReturnValue(-1029819531);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1207235803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207235803L))
            info.setReturnValue(-1624473586);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void compareTo_84008202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84008202L))
            info.setReturnValue(-261226988);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__626691030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626691030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_363704130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363704130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString_566646636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566646636L))
            info.setReturnValue("@a\uC218=");
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply__626691030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626691030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract_363704130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363704130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY_1740369353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740369353L))
            info.setReturnValue(-1029819531);
    }

    @Inject(at = @At("HEAD"), method = "getX()I", cancellable = true)
    private void getX_1740369353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740369353L))
            info.setReturnValue(-1029819531);
    }

    @Inject(at = @At("HEAD"), method = "getZ()I", cancellable = true)
    private void getZ_1740369353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740369353L))
            info.setReturnValue(-1029819531);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative_621905623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621905623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1551788010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551788010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__157380417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157380417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross_363704130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363704130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above__1456730870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456730870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1317708643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317708643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distSqr(Lnet/minecraft/core/Vec3i;)D", cancellable = true)
    private void distSqr_84003397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84003397L))
            info.setReturnValue(1.5303520055391112E8D);
    }

    @Inject(at = @At("HEAD"), method = "toMutable()Lorg/joml/Vector3i;", cancellable = true)
    private void toMutable_1165606862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165606862L))
            info.setReturnValue(new org.joml.Vector3i());
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/core/Vec3i;D)Z", cancellable = true)
    private void closerThan__1191145107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191145107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "closerToCenterThan(Lnet/minecraft/core/Position;D)Z", cancellable = true)
    private void closerToCenterThan_1765258844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765258844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offsetCodec(I)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void offsetCodec_1551269256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551269256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distChessboard(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void distChessboard_84008202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84008202L))
            info.setReturnValue(-261226988);
    }

    @Inject(at = @At("HEAD"), method = "distManhattan(Lnet/minecraft/core/Vec3i;)I", cancellable = true)
    private void distManhattan_84008202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84008202L))
            info.setReturnValue(-261226988);
    }

    @Inject(at = @At("HEAD"), method = "distToCenterSqr(Lnet/minecraft/core/Position;)D", cancellable = true)
    private void distToCenterSqr__236270730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236270730L))
            info.setReturnValue(1.5303520035198313E8D);
    }

    @Inject(at = @At("HEAD"), method = "distToCenterSqr(DDD)D", cancellable = true)
    private void distToCenterSqr_631682936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631682936L))
            info.setReturnValue(1.5303520007245976E8D);
    }

    @Inject(at = @At("HEAD"), method = "distToLowCornerSqr(DDD)D", cancellable = true)
    private void distToLowCornerSqr_631682936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631682936L))
            info.setReturnValue(1.5303520007245976E8D);
    }


}
