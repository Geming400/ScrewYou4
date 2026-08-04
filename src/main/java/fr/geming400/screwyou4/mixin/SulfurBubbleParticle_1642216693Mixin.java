package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SulfurBubbleParticle.class)
public class SulfurBubbleParticle_1642216693Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__509274937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509274937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1680491431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680491431L))
            info.cancel();
    }


}
