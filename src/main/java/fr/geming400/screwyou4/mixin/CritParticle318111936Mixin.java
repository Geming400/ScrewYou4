package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.CritParticle.class)
public class CritParticle318111936Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1833379693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833379693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_356386675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(356386675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1529242969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529242969L))
            info.setReturnValue(1.142465E8F);
    }


}
