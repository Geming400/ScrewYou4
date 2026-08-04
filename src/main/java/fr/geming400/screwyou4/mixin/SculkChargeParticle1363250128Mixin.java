package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SculkChargeParticle.class)
public class SculkChargeParticle1363250128Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__788241501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788241501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1401524867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1401524867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords__1720583252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720583252L))
            info.setReturnValue(null);
    }


}
