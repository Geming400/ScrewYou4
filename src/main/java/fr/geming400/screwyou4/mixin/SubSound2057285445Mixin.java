package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.UnderwaterAmbientSoundInstances.SubSound.class)
public class SubSound2057285445Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_2095560184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095560184L))
            info.cancel();
    }


}
