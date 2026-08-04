package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TrailParticle.class)
public class TrailParticle_231842082Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1919649548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919649548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_270116820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(270116820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1442975997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442975997L))
            info.setReturnValue(null);
    }


}
