package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlyStraightTowardsParticle.class)
public class FlyStraightTowardsParticle_753826059Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1397665571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397665571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__316580815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-316580815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_792100797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792100797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1964959974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964959974L))
            info.setReturnValue(-654655415);
    }


}
