package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.MutableBlockPos.class)
public class MutableBlockPos1708386020Mixin {
        @Inject(at = @At("HEAD"), method = "clamp(Lnet/minecraft/core/Direction$Axis;II)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void clamp_1558047505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558047505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_370112003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370112003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__620283157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620283157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset_428261950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428261950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set__1996994947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996994947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(J)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set_1502862774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502862774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/AxisCycle;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set_1953315919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953315919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(DDD)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set__441158864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441158864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void set__311670635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311670635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void multiply__1161888418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161888418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void rotate__1256554152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256554152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move_143713577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143713577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move__311670635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311670635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move__1996994947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996994947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void move__1125067576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125067576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract_370112003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370112003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1545380137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1545380137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative_628313496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628313496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__150972544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150972544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_1542185353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542185353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_1669269202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669269202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immutable()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void immutable__185000859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185000859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setX_1510622133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510622133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setX__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZ(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setZ__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZ(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setZ_1510622133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510622133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void setY__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setY_1510622133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510622133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross_370112003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370112003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;III)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset_723096372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723096372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset_1494802121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494802121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setWithOffset(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void setWithOffset_821000446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821000446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1324116516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324116516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above__1450322997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450322997L))
            info.setReturnValue(null);
    }


}
