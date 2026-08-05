package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DustParticleBase.class)
public class DustParticleBase362026697Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1789464932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789464932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_400301436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(400301436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_1573157730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573157730L))
            info.setReturnValue(7.412871E8F);
    }


}
