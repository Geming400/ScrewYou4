package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ReversePortalParticle.class)
public class ReversePortalParticle1291536326Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1329811065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1329811065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getQuadSize(F)F", cancellable = true)
    private void getQuadSize__1792299937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792299937L))
            info.setReturnValue(null);
    }


}
