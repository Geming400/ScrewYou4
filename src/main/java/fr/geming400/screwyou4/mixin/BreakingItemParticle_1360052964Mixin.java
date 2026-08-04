package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.BreakingItemParticle.class)
public class BreakingItemParticle_1360052964Mixin {
        @Inject(at = @At("HEAD"), method = "getLayer()Lnet/minecraft/client/particle/SingleQuadParticle$Layer;", cancellable = true)
    private void getLayer__791438666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791438666L))
            info.setReturnValue(null);
    }


}
