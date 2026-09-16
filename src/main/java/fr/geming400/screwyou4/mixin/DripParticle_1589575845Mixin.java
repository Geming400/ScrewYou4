package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DripParticle.class)
public class DripParticle_1589575845Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_991232402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991232402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1459892186(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1459892186L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1606264222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606264222L))
            info.setReturnValue(560026158);
    }


}
