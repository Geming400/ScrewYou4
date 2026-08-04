package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.Vec3.class)
public class Vec3_1654933363Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void get__1473427832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473427832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1254522171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1254522171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "length()D", cancellable = true)
    private void length_1693190803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693190803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_519472891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519472891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1693195608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693195608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFinite()Z", cancellable = true)
    private void isFinite_1693211945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693211945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reverse()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void reverse__1542304405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542304405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void scale_229119327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229119327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add_839837407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839837407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add_229119327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229119327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x_1693191299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693191299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dot(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void dot_2022652063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022652063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/core/Direction$Axis;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void with_388799178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388799178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()D", cancellable = true)
    private void z_1693191299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693191299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y_1693191299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693191299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void multiply__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void multiply_839837407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839837407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void normalize__1542304405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542304405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "align(Ljava/util/EnumSet;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void align__178847999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178847999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract_839837407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839837407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract_229119327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229119327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void relative__2037673517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2037673517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetRandom(Lnet/minecraft/util/RandomSource;F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offsetRandom_296280897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296280897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalDistance()D", cancellable = true)
    private void horizontalDistance_1693190803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693190803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalDistanceSqr()D", cancellable = true)
    private void horizontalDistanceSqr_1693190803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693190803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atBottomCenterOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atBottomCenterOf_480695780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480695780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directionFromRotation(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void directionFromRotation_1394288400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394288400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directionFromRotation(FF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void directionFromRotation__1929691869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1929691869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(DDD)D", cancellable = true)
    private void distanceToSqr_584509191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584509191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceToSqr_2022652063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022652063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atCenterOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atCenterOf_480695780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480695780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void horizontal__1542304405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542304405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void cross__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vectorTo(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void vectorTo__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceTo_2022652063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022652063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/world/phys/Vec3;DD)Z", cancellable = true)
    private void closerThan__704014667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704014667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/core/Position;D)Z", cancellable = true)
    private void closerThan_1718085099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718085099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lengthSqr()D", cancellable = true)
    private void lengthSqr_1693190803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693190803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void xRot__614886175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614886175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void yRot__614886175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614886175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void rotation__1542334196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542334196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void lerp_1398941139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398941139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void zRot__614886175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614886175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toVector3f()Lorg/joml/Vector3f;", cancellable = true)
    private void toVector3f_1118343744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118343744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLowerCornerWithOffset(Lnet/minecraft/core/Vec3i;DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atLowerCornerWithOffset_1049863350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049863350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLowerCornerOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atLowerCornerOf_480695780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480695780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyLocalCoordinatesToRotation(Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void applyLocalCoordinatesToRotation__170807006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170807006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateClockwise90()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void rotateClockwise90__1542304405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542304405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectedOn(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void projectedOn__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetRandomXZ(Lnet/minecraft/util/RandomSource;F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offsetRandomXZ_296280897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296280897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLocalCoordinates(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void addLocalCoordinates__950378889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950378889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upFromBottomCenterOf(Lnet/minecraft/core/Vec3i;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void upFromBottomCenterOf__1482391818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482391818L))
            info.setReturnValue(null);
    }


}
