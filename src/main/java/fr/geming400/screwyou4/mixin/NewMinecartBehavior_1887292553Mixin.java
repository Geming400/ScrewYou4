package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior.class)
public class NewMinecartBehavior_1887292553Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1925567291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1925567291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushEntities(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void pushEntities_151827402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151827402L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "moveAlongTrack(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void moveAlongTrack_908883212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(908883212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stepAlongTrack(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/RailShape;D)D", cancellable = true)
    private void stepAlongTrack_1354820041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354820041L))
            info.setReturnValue(4.737128005800134E8D);
    }

    @Inject(at = @At("HEAD"), method = "getSlowdownFactor()D", cancellable = true)
    private void getSlowdownFactor_1925549993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925549993L))
            info.setReturnValue(4.7371280079615754E8D);
    }

    @Inject(at = @At("HEAD"), method = "pushAndPickupEntities()Z", cancellable = true)
    private void pushAndPickupEntities_1925571135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925571135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "adjustToRails(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void adjustToRails_1159806882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1159806882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed(Lnet/minecraft/server/level/ServerLevel;)D", cancellable = true)
    private void getMaxSpeed_908865914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908865914L))
            info.setReturnValue(4.737128003178801E8D);
    }

    @Inject(at = @At("HEAD"), method = "setOldLerpValues()V", cancellable = true)
    private void setOldLerpValues_1925567291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1925567291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cartHasPosRotLerp()Z", cancellable = true)
    private void cartHasPosRotLerp_1925571135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925571135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCartLerpPosition__382526985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382526985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpMovements(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCartLerpMovements__382526985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382526985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpXRot(F)F", cancellable = true)
    private void getCartLerpXRot__1196543711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1196543711L))
            info.setReturnValue(4.737128E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpYRot(F)F", cancellable = true)
    private void getCartLerpYRot__1196543711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1196543711L))
            info.setReturnValue(4.737128E8F);
    }

    @Inject(at = @At("HEAD"), method = "pickupEntities(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void pickupEntities_151827402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151827402L))
            info.setReturnValue(false);
    }


}
