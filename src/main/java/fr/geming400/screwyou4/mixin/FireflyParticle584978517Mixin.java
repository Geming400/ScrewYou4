package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FireflyParticle.class)
public class FireflyParticle584978517Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__13364925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13364925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_455294859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455294859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_601666895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601666895L))
            info.setReturnValue(1524358995);
    }


}
