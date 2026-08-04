package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DripParticle.class)
public class DripParticle_1589575845Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__561915785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561915785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1627850583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1627850583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1494257536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494257536L))
            info.setReturnValue(null);
    }


}
