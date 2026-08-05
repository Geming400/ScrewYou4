package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.culling.Frustum.class)
public class Frustum416170996Mixin {
        @Inject(at = @At("HEAD"), method = "offset(F)Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void offset_126386151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126386151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/client/renderer/culling/Frustum;)V", cancellable = true)
    private void set_1612148791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1612148791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(DDD)V", cancellable = true)
    private void prepare__654235877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-654235877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCamX()D", cancellable = true)
    private void getCamX_454428437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454428437L))
            info.setReturnValue(2.0423020067374593E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCamY()D", cancellable = true)
    private void getCamY_454428437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454428437L))
            info.setReturnValue(2.0423020067374593E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCamZ()D", cancellable = true)
    private void getCamZ_454428437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454428437L))
            info.setReturnValue(2.0423020067374593E8D);
    }

    @Inject(at = @At("HEAD"), method = "pointInFrustum(DDD)Z", cancellable = true)
    private void pointInFrustum__654232033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654232033L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cubeInFrustum(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)I", cancellable = true)
    private void cubeInFrustum_1988654821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988654821L))
            info.setReturnValue(1754433603);
    }

    @Inject(at = @At("HEAD"), method = "getFrustumPoints()[Lorg/joml/Vector4f;", cancellable = true)
    private void getFrustumPoints__378600086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378600086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisible(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void isVisible__1319294154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319294154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "offsetToFullyIncludeCameraCube(I)Lnet/minecraft/client/renderer/culling/Frustum;", cancellable = true)
    private void offsetToFullyIncludeCameraCube__769009366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769009366L))
            info.setReturnValue(null);
    }


}
