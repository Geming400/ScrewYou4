package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SuspendedParticle.class)
public class SuspendedParticle2075645939Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer_1477302497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477302497L))
            info.setReturnValue(null);
    }


}
