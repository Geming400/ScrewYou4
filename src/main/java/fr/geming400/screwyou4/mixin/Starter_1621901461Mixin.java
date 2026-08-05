package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.FireworkParticles.Starter.class)
public class Starter_1621901461Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1492217802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1492217802L))
            info.cancel();
    }


}
