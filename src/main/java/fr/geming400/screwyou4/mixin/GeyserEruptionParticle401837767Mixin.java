package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.GeyserEruptionParticle.class)
public class GeyserEruptionParticle401837767Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_440112506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(440112506L))
            info.cancel();
    }


}
