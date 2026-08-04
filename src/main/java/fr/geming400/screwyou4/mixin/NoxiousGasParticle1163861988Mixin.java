package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.NoxiousGasParticle.class)
public class NoxiousGasParticle1163861988Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__987629641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987629641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1202136727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1202136727L))
            info.cancel();
    }


}
