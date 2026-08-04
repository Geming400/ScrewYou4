package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.DustPlumeParticle.class)
public class DustPlumeParticle2070779607Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2109054346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2109054346L))
            info.cancel();
    }


}
