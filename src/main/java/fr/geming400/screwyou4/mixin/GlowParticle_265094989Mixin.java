package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GlowParticle.class)
public class GlowParticle_265094989Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1886396641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886396641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_303369727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303369727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1476228904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1476228904L))
            info.setReturnValue(null);
    }


}
