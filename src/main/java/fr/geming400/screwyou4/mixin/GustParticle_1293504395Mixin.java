package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GustParticle.class)
public class GustParticle_1293504395Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__857987235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857987235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1331779133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1331779133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1790328986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790328986L))
            info.setReturnValue(-240403602);
    }


}
