package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SnifferSoundInstance.class)
public class SnifferSoundInstance_1695359653Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1565675994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1565675994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound__1987569936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987569936L))
            info.setReturnValue(true);
    }


}
