package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WaterDropParticle.class)
public class WaterDropParticle_889877250Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_291533807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291533807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_760193591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(760193591L))
            info.cancel();
    }


}
