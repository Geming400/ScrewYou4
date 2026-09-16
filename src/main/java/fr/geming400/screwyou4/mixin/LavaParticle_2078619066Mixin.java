package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.LavaParticle.class)
public class LavaParticle_2078619066Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1480275623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480275623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1948935407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1948935407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_2095307443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095307443L))
            info.setReturnValue(-57665168);
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__551496912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551496912L))
            info.setReturnValue(4.932095E8F);
    }


}
