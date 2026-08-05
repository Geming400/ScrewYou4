package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WakeParticle.class)
public class WakeParticle932389898Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_334046456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334046456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_802706240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(802706240L))
            info.cancel();
    }


}
