package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FireworkParticles.OverlayParticle.class)
public class OverlayParticle1505086738Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1646635321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1646635321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__646404891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646404891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1578749525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578749525L))
            info.setReturnValue(9.402044E8F);
    }


}
