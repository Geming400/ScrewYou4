package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.EndRodParticle.class)
public class EndRodParticle_739017326Mixin {
        @Inject(at = @At("HEAD"), method = "move(DDD)V", cancellable = true)
    private void move__622444443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-622444443L))
            info.cancel();
    }


}
