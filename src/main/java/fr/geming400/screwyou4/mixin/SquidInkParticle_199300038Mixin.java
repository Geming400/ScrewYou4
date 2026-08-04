package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.SquidInkParticle.class)
public class SquidInkParticle_199300038Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_237574776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(237574776L))
            info.cancel();
    }


}
