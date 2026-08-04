package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.HugeExplosionSeedParticle.class)
public class HugeExplosionSeedParticle_1955475629Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1993750367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1993750367L))
            info.cancel();
    }


}
