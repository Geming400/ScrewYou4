package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FireworkParticles.OverlayParticle.class)
public class OverlayParticle1505086738Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__2000272760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2000272760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_906743296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906743296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1125029239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125029239L))
            info.setReturnValue(1.320909E8F);
    }


}
