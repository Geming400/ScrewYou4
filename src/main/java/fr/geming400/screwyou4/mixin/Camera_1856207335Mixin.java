package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Camera.class)
public class Camera_1856207335Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_126770346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(126770346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void update__393225431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-393225431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1861202410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861202410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1726523676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726523676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel__1930115118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1930115118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1872874131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872874131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDetached()Z", cancellable = true)
    private void isDetached_1095742049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095742049L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot__2127956821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127956821L))
            info.setReturnValue(4.346242E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__320502358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320502358L))
            info.setReturnValue(4.346242E8F);
    }

    @Inject(at = @At("HEAD"), method = "blockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPosition__579781295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579781295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getViewRotationProjectionMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getViewRotationProjectionMatrix_958883620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958883620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCameraEntityPartialTicks(Lnet/minecraft/client/DeltaTracker;)F", cancellable = true)
    private void getCameraEntityPartialTicks__613887293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613887293L))
            info.setReturnValue(4.346242E8F);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity_1854630953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854630953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_1621532538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621532538L))
            info.setReturnValue(4.346242E8F);
    }

    @Inject(at = @At("HEAD"), method = "upVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void upVector_1038635045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038635045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void leftVector_104570001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104570001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFov()F", cancellable = true)
    private void getFov_162327890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162327890L))
            info.setReturnValue(4.346242E8F);
    }

    @Inject(at = @At("HEAD"), method = "attributeProbe()Lnet/minecraft/world/attribute/EnvironmentAttributeProbe;", cancellable = true)
    private void attributeProbe_482869875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482869875L))
            info.setReturnValue(new net.minecraft.world.attribute.EnvironmentAttributeProbe());
    }

    @Inject(at = @At("HEAD"), method = "forwardVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void forwardVector__876761393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876761393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enablePanoramicMode()V", cancellable = true)
    private void enablePanoramicMode_102156499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(102156499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disablePanoramicMode()V", cancellable = true)
    private void disablePanoramicMode_200480504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(200480504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPanoramicMode()Z", cancellable = true)
    private void isPanoramicMode_1968948158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968948158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/renderer/state/level/CameraRenderState;F)V", cancellable = true)
    private void extractRenderState__1135815857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1135815857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewRotationMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getViewRotationMatrix_1569459701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569459701L))
            info.setReturnValue(new org.joml.Matrix4f());
    }

    @Inject(at = @At("HEAD"), method = "captureFrustum()V", cancellable = true)
    private void captureFrustum_1463260893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1463260893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCapturedFrustum()Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void getCapturedFrustum__1946770379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946770379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearPlane(F)Lnet/minecraft/client/Camera$NearPlane;", cancellable = true)
    private void getNearPlane_1462499129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462499129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killFrustum()V", cancellable = true)
    private void killFrustum_515155701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515155701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidInCamera()Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private void getFluidInCamera_575077254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575077254L))
            info.setReturnValue(net.minecraft.world.level.material.FogType.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getCullFrustum()Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void getCullFrustum__1376890423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376890423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "panoramicForwards()Lorg/joml/Vector3fc;", cancellable = true)
    private void panoramicForwards__1420771237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420771237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setEntity__1046124969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1046124969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void rotation__695049142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695049142L))
            info.setReturnValue(new org.joml.Quaternionf());
    }


}
