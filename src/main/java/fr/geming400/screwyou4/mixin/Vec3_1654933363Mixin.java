package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.Vec3.class)
public class Vec3_1654933363Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void get__1996339234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996339234L))
            info.setReturnValue(8.725505000675831E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_746306598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746306598L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "length()D", cancellable = true)
    private void length__1054036115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054036115L))
            info.setReturnValue(8.725505001546565E8D);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1869610905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869610905L))
            info.setReturnValue("&A25\uBEFAz/\u6922#-y*r\u553D\"]2m7is.o\"C2f.',#`EP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2082682339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082682339L))
            info.setReturnValue(-1367925485);
    }

    @Inject(at = @At("HEAD"), method = "isFinite()Z", cancellable = true)
    private void isFinite__1953562032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953562032L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "reverse()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void reverse__408780983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408780983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void scale__476200535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476200535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add_701278936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701278936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add__388394624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388394624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void add_114417344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114417344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x_833722123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833722123L))
            info.setReturnValue(8.725505002541177E8D);
    }

    @Inject(at = @At("HEAD"), method = "dot(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void dot_399347048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399347048L))
            info.setReturnValue(8.725505006948342E8D);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/core/Direction$Axis;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void with_355913540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355913540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()D", cancellable = true)
    private void z_890980425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890980425L))
            info.setReturnValue(8.72550500049099E8D);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y_862351274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862351274L))
            info.setReturnValue(8.725505001485168E8D);
    }

    @Inject(at = @At("HEAD"), method = "multiply(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void multiply__1379472485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379472485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void multiply_1132319235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132319235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void normalize__321295554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321295554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "align(Ljava/util/EnumSet;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void align_1729036358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729036358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract_1190683787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190683787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract_120132339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120132339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void subtract_1908815475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908815475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void relative_1841801631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841801631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerp(Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void lerp__2134362884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134362884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void xRot_781152160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781152160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void yRot__2052235137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052235137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zRot(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void zRot__590655138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590655138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vectorTo(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void vectorTo__1905801707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905801707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceTo(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceTo_1980579311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980579311L))
            info.setReturnValue(8.725505009306476E8D);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceToSqr__2042696445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042696445L))
            info.setReturnValue(8.725505001644052E8D);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(DDD)D", cancellable = true)
    private void distanceToSqr__1726981781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726981781L))
            info.setReturnValue(8.725505001250463E8D);
    }

    @Inject(at = @At("HEAD"), method = "horizontalDistanceSqr()D", cancellable = true)
    private void horizontalDistanceSqr__523238248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523238248L))
            info.setReturnValue(8.725505004265425E8D);
    }

    @Inject(at = @At("HEAD"), method = "directionFromRotation(FF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void directionFromRotation__1936807140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936807140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "directionFromRotation(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void directionFromRotation_1835911095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1835911095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void cross__1797527881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797527881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontalDistance()D", cancellable = true)
    private void horizontalDistance__158716422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158716422L))
            info.setReturnValue(8.725505001057615E8D);
    }

    @Inject(at = @At("HEAD"), method = "atBottomCenterOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atBottomCenterOf__1303039302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303039302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atCenterOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atCenterOf__1909202971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909202971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void rotation_591669454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591669454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/world/phys/Vec3;DD)Z", cancellable = true)
    private void closerThan__1922144080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922144080L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "closerThan(Lnet/minecraft/core/Position;D)Z", cancellable = true)
    private void closerThan_1380830672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380830672L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lengthSqr()D", cancellable = true)
    private void lengthSqr__1245304251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245304251L))
            info.setReturnValue(8.725505008718106E8D);
    }

    @Inject(at = @At("HEAD"), method = "applyLocalCoordinatesToRotation(Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void applyLocalCoordinatesToRotation_1967033643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967033643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toVector3f()Lorg/joml/Vector3f;", cancellable = true)
    private void toVector3f_594587759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594587759L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "atLowerCornerOf(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atLowerCornerOf__445167510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445167510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atLowerCornerWithOffset(Lnet/minecraft/core/Vec3i;DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void atLowerCornerWithOffset_1369964690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369964690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upFromBottomCenterOf(Lnet/minecraft/core/Vec3i;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void upFromBottomCenterOf__1927513454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927513454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetRandom(Lnet/minecraft/util/RandomSource;F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offsetRandom__444995125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444995125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offsetRandomXZ(Lnet/minecraft/util/RandomSource;F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offsetRandomXZ_1262093705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262093705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "projectedOn(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void projectedOn_757671470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757671470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateClockwise90()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void rotateClockwise90_907160253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907160253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLocalCoordinates(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void addLocalCoordinates_2110497416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110497416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void horizontal__655020345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655020345L))
            info.setReturnValue(null);
    }


}
