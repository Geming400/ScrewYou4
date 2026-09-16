package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GlowParticle.class)
public class GlowParticle_265094989Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__333248454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333248454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_135411330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(135411330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_281783366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281783366L))
            info.setReturnValue(-802366187);
    }


}
