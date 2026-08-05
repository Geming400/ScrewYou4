package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FallingLeavesParticle.class)
public class FallingLeavesParticle620419483Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_22076041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22076041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_490735825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(490735825L))
            info.cancel();
    }


}
