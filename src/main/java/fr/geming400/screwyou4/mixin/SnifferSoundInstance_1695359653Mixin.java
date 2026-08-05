package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SnifferSoundInstance.class)
public class SnifferSoundInstance_1695359653Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1733634391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1733634391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaySound()Z", cancellable = true)
    private void canPlaySound_1733638235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733638235L))
            info.setReturnValue(true);
    }


}
