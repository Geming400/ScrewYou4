package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.NoRenderParticle.class)
public class NoRenderParticle84961757Mixin {
        @Inject(at = @At("HEAD"), method = "getGroup()Lnet/minecraft/client/particle/ParticleRenderType;", cancellable = true)
    private void getGroup__926976452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926976452L))
            info.setReturnValue(null);
    }


}
