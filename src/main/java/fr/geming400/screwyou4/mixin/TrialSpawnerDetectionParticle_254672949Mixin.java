package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TrialSpawnerDetectionParticle.class)
public class TrialSpawnerDetectionParticle_254672949Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__343670494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343670494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_124989290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(124989290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_271361326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271361326L))
            info.setReturnValue(287129250);
    }

    @Inject(at = @At("HEAD"), method = "getFacingCameraMode()Lnet/minecraft/client/particle/SingleQuadParticle$FacingCameraMode;", cancellable = true)
    private void getFacingCameraMode_2059901704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059901704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1919524267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919524267L))
            info.setReturnValue(8.557933E8F);
    }


}
