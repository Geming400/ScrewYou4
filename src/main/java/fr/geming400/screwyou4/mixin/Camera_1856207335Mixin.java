package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Camera.class)
public class Camera_1856207335Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/DeltaTracker;)V", cancellable = true)
    private void update__1486495904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1486495904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1341030433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341030433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel__1475356844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1475356844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInitialized()Z", cancellable = true)
    private void isInitialized_1894485917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894485917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void entity__609871508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609871508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "panoramicForwards()Lorg/joml/Vector3fc;", cancellable = true)
    private void panoramicForwards__1892815257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892815257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPosition__37179545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37179545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/renderer/state/level/CameraRenderState;F)V", cancellable = true)
    private void extractRenderState__731153687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-731153687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "captureFrustum()V", cancellable = true)
    private void captureFrustum_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "attributeProbe()Lnet/minecraft/world/attribute/EnvironmentAttributeProbe;", cancellable = true)
    private void attributeProbe_803871847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803871847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getViewRotationMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getViewRotationMatrix__2005017189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005017189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPanoramicMode()Z", cancellable = true)
    private void isPanoramicMode_1894485917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894485917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCullFrustum()Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void getCullFrustum_1228413539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228413539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "killFrustum()V", cancellable = true)
    private void killFrustum_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCapturedFrustum()Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void getCapturedFrustum_1228413539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228413539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidInCamera()Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private void getFluidInCamera_1383264936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383264936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearPlane(F)Lnet/minecraft/client/Camera$NearPlane;", cancellable = true)
    private void getNearPlane__244588581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244588581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forwardVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void forwardVector__1892815257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892815257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disablePanoramicMode()V", cancellable = true)
    private void disablePanoramicMode_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enablePanoramicMode()V", cancellable = true)
    private void enablePanoramicMode_1894482073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1894482073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCameraEntityPartialTicks(Lnet/minecraft/client/DeltaTracker;)F", cancellable = true)
    private void getCameraEntityPartialTicks__1486511280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486511280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getViewRotationProjectionMatrix(Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;", cancellable = true)
    private void getViewRotationProjectionMatrix__2005017189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005017189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_1894466697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894466697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_1894466697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894466697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lorg/joml/Quaternionf;", cancellable = true)
    private void rotation_542627404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542627404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setEntity_1404482674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1404482674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_1894466697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894466697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void leftVector__1892815257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892815257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upVector()Lorg/joml/Vector3fc;", cancellable = true)
    private void upVector__1892815257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892815257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFov()F", cancellable = true)
    private void getFov_1894466697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894466697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDetached()Z", cancellable = true)
    private void isDetached_1894485917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894485917L))
            info.setReturnValue(null);
    }


}
