package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlyTowardsPositionParticle.class)
public class FlyTowardsPositionParticle_1246562088Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/level/QuadParticleRenderState;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract_2036169885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2036169885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_648218645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648218645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__114899681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114899681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1116878429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1116878429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1263250465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263250465L))
            info.setReturnValue(-1756348422);
    }


}
