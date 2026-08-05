package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargePopParticle.class)
public class SculkChargePopParticle_417510817Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1733980813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733980813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_455785555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455785555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1628644732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628644732L))
            info.setReturnValue(-762256029);
    }


}
