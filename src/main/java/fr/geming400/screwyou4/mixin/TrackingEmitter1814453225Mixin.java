package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.TrackingEmitter.class)
public class TrackingEmitter1814453225Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1852727964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852727964L))
            info.cancel();
    }


}
