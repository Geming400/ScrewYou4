package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.culling.Frustum.class)
public class Frustum416170996Mixin {
        @Inject(at = @At("HEAD"), method = "offset(F)Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void offset_1934217466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934217466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/client/renderer/culling/Frustum;)V", cancellable = true)
    private void set_1013653401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1013653401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(DDD)V", cancellable = true)
    private void prepare__410436318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-410436318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isVisible_1671991070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671991070L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "pointInFrustum(DDD)Z", cancellable = true)
    private void pointInFrustum_1701537260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701537260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offsetToFullyIncludeCameraCube(I)Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void offsetToFullyIncludeCameraCube__1340339376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340339376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCamX()D", cancellable = true)
    private void getCamX__377612394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377612394L))
            info.setReturnValue(6.139314001823337E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCamY()D", cancellable = true)
    private void getCamY__348983243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348983243L))
            info.setReturnValue(6.139314004756374E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCamZ()D", cancellable = true)
    private void getCamZ__320354092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320354092L))
            info.setReturnValue(6.139314005192544E8D);
    }

    @Inject(at = @At("HEAD"), method = "cubeInFrustum(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)I", cancellable = true)
    private void cubeInFrustum__1101785571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101785571L))
            info.setReturnValue(1380448138);
    }

    @Inject(at = @At("HEAD"), method = "getFrustumPoints()[Lorg/joml/Vector4f;", cancellable = true)
    private void getFrustumPoints__521276007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521276007L))
            info.setReturnValue(null);
    }


}
