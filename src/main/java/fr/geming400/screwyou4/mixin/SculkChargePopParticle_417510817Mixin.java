package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargePopParticle.class)
public class SculkChargePopParticle_417510817Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__180832626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180832626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_287827158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(287827158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_434199194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434199194L))
            info.setReturnValue(-2114461597);
    }


}
