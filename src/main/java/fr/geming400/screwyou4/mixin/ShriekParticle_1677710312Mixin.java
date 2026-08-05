package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ShriekParticle.class)
public class ShriekParticle_1677710312Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1474011748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1474011748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__473781318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473781318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1715985050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1715985050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1406125952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406125952L))
            info.setReturnValue(6.461831E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1406123069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406123069L))
            info.setReturnValue(-1630224912);
    }


}
