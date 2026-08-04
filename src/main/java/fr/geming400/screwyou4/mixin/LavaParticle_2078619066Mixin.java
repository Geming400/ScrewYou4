package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.LavaParticle.class)
public class LavaParticle_2078619066Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__72872564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72872564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2116893804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116893804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1005217198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005217198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1005214315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005214315L))
            info.setReturnValue(null);
    }


}
