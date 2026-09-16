package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.HugeExplosionParticle.class)
public class HugeExplosionParticle492081026Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__106262416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106262416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_362397368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(362397368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_508769404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508769404L))
            info.setReturnValue(1634298519);
    }


}
