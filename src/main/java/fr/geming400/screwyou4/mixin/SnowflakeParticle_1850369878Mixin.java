package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SnowflakeParticle.class)
public class SnowflakeParticle_1850369878Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__301121752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301121752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1888644616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888644616L))
            info.cancel();
    }


}
