package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.OldMinecartBehavior.class)
public class OldMinecartBehavior_1377647554Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1415922292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1415922292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed(Lnet/minecraft/server/level/ServerLevel;)D", cancellable = true)
    private void getMaxSpeed_399220915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(399220915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosOffs(DDDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosOffs_783785658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783785658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPos_562551598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562551598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnownMovement(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownMovement__1227664698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227664698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotionDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getMotionDirection_614792268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614792268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerpMotion(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lerpMotion_1745383552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1745383552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation__2060884156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060884156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveAlongTrack(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void moveAlongTrack_399238213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(399238213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stepAlongTrack(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/RailShape;D)D", cancellable = true)
    private void stepAlongTrack_845175042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845175042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlowdownFactor()D", cancellable = true)
    private void getSlowdownFactor_1415904994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415904994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushAndPickupEntities()Z", cancellable = true)
    private void pushAndPickupEntities_1415926136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415926136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onInterpolation(Lnet/minecraft/world/entity/InterpolationHandler;)V", cancellable = true)
    private void onInterpolation_1642254154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642254154L))
            info.cancel();
    }


}
