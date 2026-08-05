package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction.class)
public class Direction1733274561Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_597814090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597814090L))
            info.setReturnValue("\\\"&P\u9187n`jLj|HTW|(wy\u2A94/c;Y \uD59C\u8186T;;A(OOMw(gYHQ|p.><|D`\uC864k\u5638*R3<pk");
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/Direction$AxisDirection;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void get_898272481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898272481L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_597814090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597814090L))
            info.setReturnValue("\\\"&P\u9187n`jLj|HTW|(wy\u2A94/c;Y \uD59C\u8186T;;A(OOMw(gYHQ|p.><|D`\uC864k\u5638*R3<pk");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction;", cancellable = true)
    private static void values_486006717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486006717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void valueOf__2078014086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078014086L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private static void stream_1522568494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522568494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "step()Lorg/joml/Vector3f;", cancellable = true)
    private void step_1196684943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196684943L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lorg/joml/Matrix4fc;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void rotate_1626074297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1626074297L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getRandom_1449579428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449579428L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void byName__2078014086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078014086L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void getRotation_419694631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419694631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void getAxis__1012684189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012684189L))
            info.setReturnValue(net.minecraft.core.Direction.Axis.Y);
    }

    @Inject(at = @At("HEAD"), method = "getStepY()I", cancellable = true)
    private void getStepY_1771536807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771536807L))
            info.setReturnValue(2065029958);
    }

    @Inject(at = @At("HEAD"), method = "getStepZ()I", cancellable = true)
    private void getStepZ_1771536807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771536807L))
            info.setReturnValue(2065029958);
    }

    @Inject(at = @At("HEAD"), method = "getStepX()I", cancellable = true)
    private void getStepX_1771536807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771536807L))
            info.setReturnValue(2065029958);
    }

    @Inject(at = @At("HEAD"), method = "getYRot(Lnet/minecraft/core/Direction;)F", cancellable = true)
    private static void getYRot_613333352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613333352L))
            info.setReturnValue(6.222649E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromYRot(D)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void fromYRot__80816432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80816432L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getNearest(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getNearest_134662871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134662871L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getNearest(IIILnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getNearest__159689281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159689281L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "toYRot()F", cancellable = true)
    private void toYRot_1771533924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771533924L))
            info.setReturnValue(6.222649E8F);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getUnitVec3__1463963206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463963206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3f()Lorg/joml/Vector3fc;", cancellable = true)
    private void getUnitVec3f__2015748030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015748030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClockWise()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClockWise_970419276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970419276L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getClockWise(Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getClockWise__620474249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620474249L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "from2DDataValue(I)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void from2DDataValue_751676267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751676267L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "isFacingAngle(F)Z", cancellable = true)
    private void isFacingAngle__1350542482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350542482L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "from3DDataValue(I)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void from3DDataValue_751676267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751676267L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "get2DDataValue()I", cancellable = true)
    private void get2DDataValue_1771536807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771536807L))
            info.setReturnValue(2065029958);
    }

    @Inject(at = @At("HEAD"), method = "orderedByNearest(Lnet/minecraft/world/entity/Entity;)[Lnet/minecraft/core/Direction;", cancellable = true)
    private static void orderedByNearest_1673105878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673105878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromAxisAndDirection(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/core/Direction$AxisDirection;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void fromAxisAndDirection_1063288509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063288509L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getFacingAxis(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getFacingAxis__234603192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-234603192L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "get3DDataValue()I", cancellable = true)
    private void get3DDataValue_1771536807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771536807L))
            info.setReturnValue(2065029958);
    }

    @Inject(at = @At("HEAD"), method = "allShuffled(Lnet/minecraft/util/RandomSource;)Ljava/util/Collection;", cancellable = true)
    private static void allShuffled__884908151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884908151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAxisDirection()Lnet/minecraft/core/Direction$AxisDirection;", cancellable = true)
    private void getAxisDirection__1504761998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504761998L))
            info.setReturnValue(net.minecraft.core.Direction.AxisDirection.POSITIVE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_597814090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597814090L))
            info.setReturnValue("\\\"&P\u9187n`jLj|HTW|(wy\u2A94/c;Y \uD59C\u8186T;;A(OOMw(gYHQ|p.><|D`\uC864k\u5638*R3<pk");
    }

    @Inject(at = @At("HEAD"), method = "getCounterClockWise(Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void getCounterClockWise__620474249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620474249L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getCounterClockWise()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getCounterClockWise_970419276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970419276L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getOpposite_970419276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970419276L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getUnitVec3i()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getUnitVec3i_1348876097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348876097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "axisStepOrder(Lnet/minecraft/world/phys/Vec3;)Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private static void axisStepOrder_1960705962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960705962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(FFF)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest_1582779854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582779854L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest_1543703224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543703224L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getApproximateNearest(DDD)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getApproximateNearest_770168144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770168144L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }


}
