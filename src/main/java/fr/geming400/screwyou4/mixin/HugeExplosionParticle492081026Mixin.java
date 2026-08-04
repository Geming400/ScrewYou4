package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.HugeExplosionParticle.class)
public class HugeExplosionParticle492081026Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__1659410603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659410603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_530355765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530355765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1703214942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703214942L))
            info.setReturnValue(null);
    }


}
