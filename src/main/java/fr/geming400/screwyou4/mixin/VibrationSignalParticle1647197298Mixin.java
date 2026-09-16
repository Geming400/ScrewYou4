package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.VibrationSignalParticle.class)
public class VibrationSignalParticle1647197298Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1858162200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1858162200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1048853856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048853856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1517513640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517513640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1663885676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663885676L))
            info.setReturnValue(-1021721271);
    }


}
