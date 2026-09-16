package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GustParticle.class)
public class GustParticle_1293504395Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_695160952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695160952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1163820736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1163820736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightCoords(F)I", cancellable = true)
    private void getLightCoords_1310192772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310192772L))
            info.setReturnValue(-996720600);
    }


}
