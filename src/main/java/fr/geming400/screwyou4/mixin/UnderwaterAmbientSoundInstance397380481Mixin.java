package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.UnderwaterAmbientSoundInstances.UnderwaterAmbientSoundInstance.class)
public class UnderwaterAmbientSoundInstance397380481Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_435655220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(435655220L))
            info.cancel();
    }


}
