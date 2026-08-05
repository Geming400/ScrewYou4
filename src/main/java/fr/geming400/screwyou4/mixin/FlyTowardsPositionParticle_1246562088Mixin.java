package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlyTowardsPositionParticle.class)
public class FlyTowardsPositionParticle_1246562088Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__1905159972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1905159972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__904929542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904929542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move_176155214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(176155214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1284836826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284836826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1837271293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837271293L))
            info.setReturnValue(-1051667869);
    }


}
