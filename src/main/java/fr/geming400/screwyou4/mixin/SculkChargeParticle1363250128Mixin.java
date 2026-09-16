package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargeParticle.class)
public class SculkChargeParticle1363250128Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_764906686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764906686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1233566470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1233566470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1379938506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379938506L))
            info.setReturnValue(-519888551);
    }


}
