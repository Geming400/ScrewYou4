package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlameParticle.class)
public class FlameParticle_914257973Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_315914530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315914530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__447203796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-447203796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_930946350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930946350L))
            info.setReturnValue(1491193474);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1715858005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715858005L))
            info.setReturnValue(8.68055E8F);
    }


}
