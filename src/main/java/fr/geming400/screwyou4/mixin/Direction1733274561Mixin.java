package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.class)
public class Direction1733274561Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__155572341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155572341L))
            info.setReturnValue("^{Z\"d%]F7%z\u6403>:s\"W:95[u(e:}W+\uF9A7RHLN\u3054AY$\u3775\"<tNp8)8D");
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$AxisDirection;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void get__280863669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280863669L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1791269706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791269706L))
            info.setReturnValue("UskX\u46DFphtg8<I.KzDK.Z%\uC56A\u962AHu=iz\uAADB.j;M'DS\uAA77WP+\uCBBAW{N|UIpK2F\uD588_\u00CA\u6395.t\uB170-6thunNL\u2AB111Vu:[a[");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction;", cancellable = true)
    private static void values_837459803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837459803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void valueOf__1473100638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1473100638L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private static void stream_995585454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995585454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "step()Lorg/joml/Vector3f;", cancellable = true)
    private void step_1156909635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156909635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lorg/joml/Matrix4fc;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void rotate__463915372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463915372L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getRandom_2120142155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120142155L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void byName_389914620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389914620L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getYRot(Lnet/minecraft/core/Direction;)F", cancellable = true)
    private static void getYRot_1396676052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396676052L))
            info.setReturnValue(8.053519E8F);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getOpposite_1415547241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415547241L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "axisStepOrder(Lnet/minecraft/world/phys/Vec3;)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void axisStepOrder_1551485803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551485803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(DDD)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest__242739024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242739024L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(FFF)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest_569872686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569872686L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest__697926120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697926120L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getAxisDirection()Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private void getAxisDirection__225363814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225363814L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.POSITIVE);
    }

    @Inject(at = @At("HEAD"), method = "fromYRot(D)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void fromYRot__272944024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272944024L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getStepX()I", cancellable = true)
    private void getStepX__91001327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91001327L))
            info.setReturnValue(-760861928);
    }

    @Inject(at = @At("HEAD"), method = "getStepZ()I", cancellable = true)
    private void getStepZ__33743025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33743025L))
            info.setReturnValue(-1320489553);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void getAxis_880606828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880606828L))
            info.setReturnValue(net.minecraft.core.Direction.Axis.Z);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void getRotation__1963701221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963701221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1821483183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821483183L))
            info.setReturnValue("l=y*X\uA33D}7");
    }

    @Inject(at = @At("HEAD"), method = "getStepY()I", cancellable = true)
    private void getStepY__62372176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62372176L))
            info.setReturnValue(-1070183369);
    }

    @Inject(at = @At("HEAD"), method = "isFacingAngle(F)Z", cancellable = true)
    private void isFacingAngle__164109891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164109891L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getClockWise(Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClockWise_575669979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575669979L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getClockWise()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClockWise__393125784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393125784L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "from3DDataValue(I)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void from3DDataValue__148983457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148983457L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "orderedByNearest(Lnet/minecraft/world/entity/Entity;)[Lnet/minecraft/core/Direction;", cancellable = true)
    private static void orderedByNearest_336925808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336925808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFacingAxis(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getFacingAxis__365037863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-365037863L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3f()Lorg/joml/Vector3fc;", cancellable = true)
    private void getUnitVec3f__646349681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646349681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allShuffled(Lnet/minecraft/util/RandomSource;)Ljava/util/Collection;", cancellable = true)
    private static void allShuffled__357410115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357410115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get2DDataValue()I", cancellable = true)
    private void get2DDataValue_1632791656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632791656L))
            info.setReturnValue(237574297);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getUnitVec3__1102615839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102615839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get3DDataValue()I", cancellable = true)
    private void get3DDataValue_1122257479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122257479L))
            info.setReturnValue(-156168461);
    }

    @Inject(at = @At("HEAD"), method = "fromAxisAndDirection(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/core/Direction$AxisDirection;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void fromAxisAndDirection__24973910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24973910L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "from2DDataValue(I)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void from2DDataValue_1034363840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034363840L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3i()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getUnitVec3i__1811235183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811235183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCounterClockWise()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getCounterClockWise_1108293624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108293624L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getCounterClockWise(Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getCounterClockWise_731546955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731546955L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getNearest(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getNearest__1828875009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828875009L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getNearest(IIILnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getNearest__1618814825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618814825L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "toYRot()F", cancellable = true)
    private void toYRot_1421955659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421955659L))
            info.setReturnValue(8.053519E8F);
    }


}
