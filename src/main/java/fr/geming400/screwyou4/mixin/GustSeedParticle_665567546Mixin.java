package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GustSeedParticle.class)
public class GustSeedParticle_665567546Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_535883887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(535883887L))
            info.cancel();
    }


}
