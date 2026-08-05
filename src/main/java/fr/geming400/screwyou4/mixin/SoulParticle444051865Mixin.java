package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SoulParticle.class)
public class SoulParticle444051865Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1707439764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707439764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_482326604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482326604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1655185781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655185781L))
            info.setReturnValue(1360372324);
    }


}
