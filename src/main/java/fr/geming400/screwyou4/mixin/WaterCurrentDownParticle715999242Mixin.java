package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.WaterCurrentDownParticle.class)
public class WaterCurrentDownParticle715999242Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_117655800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117655800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_586315584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(586315584L))
            info.cancel();
    }


}
