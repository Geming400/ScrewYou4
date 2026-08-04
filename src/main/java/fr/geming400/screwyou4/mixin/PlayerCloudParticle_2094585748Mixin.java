package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.PlayerCloudParticle.class)
public class PlayerCloudParticle_2094585748Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__56905882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56905882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2132860486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2132860486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__989250516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989250516L))
            info.setReturnValue(null);
    }


}
