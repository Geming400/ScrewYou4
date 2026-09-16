package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior.class)
public class NewMinecartBehavior_1887292553Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1757608894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1757608894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushEntities(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void pushEntities_1558229829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558229829L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMaxSpeed(Lnet/minecraft/server/level/ServerLevel;)D", cancellable = true)
    private void getMaxSpeed_398254945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398254945L))
            info.setReturnValue(7.19798400284022E8D);
    }

    @Inject(at = @At("HEAD"), method = "adjustToRails(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void adjustToRails_1080780075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1080780075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveAlongTrack(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void moveAlongTrack__914669619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-914669619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pushAndPickupEntities()Z", cancellable = true)
    private void pushAndPickupEntities_26197605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26197605L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSlowdownFactor()D", cancellable = true)
    private void getSlowdownFactor__2016064927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016064927L))
            info.setReturnValue(7.197984005404483E8D);
    }

    @Inject(at = @At("HEAD"), method = "stepAlongTrack(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/RailShape;D)D", cancellable = true)
    private void stepAlongTrack_1996522927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996522927L))
            info.setReturnValue(7.197984006886586E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpYRot(F)F", cancellable = true)
    private void getCartLerpYRot__1303409844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1303409844L))
            info.setReturnValue(7.197984E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpXRot(F)F", cancellable = true)
    private void getCartLerpXRot__1106896339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106896339L))
            info.setReturnValue(7.197984E8F);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCartLerpPosition_1964529005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964529005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickupEntities(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void pickupEntities__1469119577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469119577L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCartLerpMovements(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCartLerpMovements__1162066834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162066834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cartHasPosRotLerp()Z", cancellable = true)
    private void cartHasPosRotLerp__245411637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245411637L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setOldLerpValues()V", cancellable = true)
    private void setOldLerpValues_426466365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426466365L))
            info.cancel();
    }


}
