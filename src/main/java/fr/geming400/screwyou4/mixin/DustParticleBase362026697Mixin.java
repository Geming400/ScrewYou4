package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DustParticleBase.class)
public class DustParticleBase362026697Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__236316745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236316745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_232343039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(232343039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_2026878016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026878016L))
            info.setReturnValue(5.328859E8F);
    }


}
