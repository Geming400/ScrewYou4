package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.NoxiousGasCloudParticle.class)
public class NoxiousGasCloudParticle_977435153Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1015709891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1015709891L))
            info.cancel();
    }


}
