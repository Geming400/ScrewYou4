package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TrialSpawnerDetectionParticle.class)
public class TrialSpawnerDetectionParticle_254672949Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1896818681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896818681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_292947687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(292947687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFacingCameraMode()Lnet/minecraft/client/particle/SingleQuadParticle$FacingCameraMode;", cancellable = true)
    private void getFacingCameraMode_529952608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529952608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1465806864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465806864L))
            info.setReturnValue(-735201838);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1465803981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465803981L))
            info.setReturnValue(4.115334E8F);
    }


}
