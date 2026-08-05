package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FireflyParticle.class)
public class FireflyParticle584978517Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1566513112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566513112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_623253256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(623253256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1796112433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796112433L))
            info.setReturnValue(1560711104);
    }


}
