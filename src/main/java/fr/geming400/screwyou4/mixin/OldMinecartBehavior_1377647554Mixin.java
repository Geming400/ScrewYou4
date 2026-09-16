package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.OldMinecartBehavior.class)
public class OldMinecartBehavior_1377647554Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1247963895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1247963895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKnownMovement(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownMovement__377144030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377144030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotionDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getMotionDirection_749745599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749745599L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation_1117899286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117899286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lerpMotion(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lerpMotion__2070591987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2070591987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed(Lnet/minecraft/server/level/ServerLevel;)D", cancellable = true)
    private void getMaxSpeed__111390054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111390054L))
            info.setReturnValue(1.1690000010088627E8D);
    }

    @Inject(at = @At("HEAD"), method = "moveAlongTrack(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void moveAlongTrack__1424314618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1424314618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushAndPickupEntities()Z", cancellable = true)
    private void pushAndPickupEntities__483447394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483447394L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSlowdownFactor()D", cancellable = true)
    private void getSlowdownFactor_1769257370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769257370L))
            info.setReturnValue(1.1690000040975547E8D);
    }

    @Inject(at = @At("HEAD"), method = "stepAlongTrack(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/RailShape;D)D", cancellable = true)
    private void stepAlongTrack_1486877928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486877928L))
            info.setReturnValue(1.1690000006987059E8D);
    }

    @Inject(at = @At("HEAD"), method = "getPos(DDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPos_1590360012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590360012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosOffs(DDDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosOffs_1953260376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953260376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onInterpolation(Lnet/minecraft/world/entity/InterpolationHandler;)V", cancellable = true)
    private void onInterpolation_868980623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(868980623L))
            info.cancel();
    }


}
