package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GeyserPlumeParticle.class)
public class GeyserPlumeParticle_411722812Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_449997550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(449997550L))
            info.cancel();
    }


}
