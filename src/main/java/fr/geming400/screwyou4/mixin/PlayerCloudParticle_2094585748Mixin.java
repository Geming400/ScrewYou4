package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.PlayerCloudParticle.class)
public class PlayerCloudParticle_2094585748Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1496242305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496242305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1964902089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1964902089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__535530230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535530230L))
            info.setReturnValue(4.354352E8F);
    }


}
