package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlyStraightTowardsParticle.class)
public class FlyStraightTowardsParticle_753826059Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_155482616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155482616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__607635710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-607635710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_624142400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624142400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_770514436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770514436L))
            info.setReturnValue(258938385);
    }


}
