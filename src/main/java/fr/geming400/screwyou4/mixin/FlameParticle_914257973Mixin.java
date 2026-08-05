package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FlameParticle.class)
public class FlameParticle_914257973Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1237233657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237233657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__156148901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-156148901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize_2125389005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125389005L))
            info.setReturnValue(5.424151E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_2125391888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125391888L))
            info.setReturnValue(2124148572);
    }


}
