package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WaterDropParticle.class)
public class WaterDropParticle_889877250Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1261614380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261614380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_928151988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(928151988L))
            info.cancel();
    }


}
