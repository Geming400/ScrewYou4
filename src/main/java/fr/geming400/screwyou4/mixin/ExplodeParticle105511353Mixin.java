package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ExplodeParticle.class)
public class ExplodeParticle105511353Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__492832089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492832089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__24172305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-24172305L))
            info.cancel();
    }


}
