package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.VibrationSignalParticle.class)
public class VibrationSignalParticle1647197298Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1504524761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1504524761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__504294331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504294331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1685472037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1685472037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1436636082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436636082L))
            info.setReturnValue(-847866867);
    }


}
