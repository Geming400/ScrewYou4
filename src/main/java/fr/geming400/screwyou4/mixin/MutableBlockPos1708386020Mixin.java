package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.MutableBlockPos.class)
public class MutableBlockPos1708386020Mixin {
        @Inject(at = @At("HEAD"), method = "clamp(Lnet/minecraft/core/Direction$Axis;II)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void clamp_549399948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549399948L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_478803128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478803128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_801899926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801899926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset__1522886319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522886319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set_143157467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143157467L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "set(J)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set_2087714200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087714200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/AxisCycle;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set_1602311217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602311217L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "set(DDD)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set__1039654254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039654254L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "set(III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set__910166025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910166025L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply_331966759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331966759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void multiply_646519426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646519426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void rotate_275293469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275293469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move_502459878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502459878L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move__549046772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549046772L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move_1418618071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418618071L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move_1688557306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688557306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract__221887209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221887209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__566464692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566464692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__765448604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-765448604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_1711351357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1711351357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1802332277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802332277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_439787934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439787934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1371241614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371241614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1138040065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138040065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset_1298581219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298581219L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset__1413696978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413696978L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset_354468591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354468591L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross_1309822531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1309822531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1705247098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705247098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below__1483584875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483584875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1545523154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545523154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1034259103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034259103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_99954579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(99954579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__744637380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744637380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north__969692634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969692634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_1062526057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062526057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1026617250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026617250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1156067535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156067535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setY_235894828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235894828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setY_1492892852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492892852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setX__791970603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791970603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setX__897295765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897295765L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "setZ(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setZ__517210989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517210989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZ(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setZ_1369085421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369085421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immutable()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void immutable_1611774755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611774755L))
            info.setReturnValue(null);
    }


}
