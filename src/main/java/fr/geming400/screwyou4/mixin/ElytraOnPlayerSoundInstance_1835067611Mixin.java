package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.ElytraOnPlayerSoundInstance.class)
public class ElytraOnPlayerSoundInstance_1835067611Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1873342349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1873342349L))
            info.cancel();
    }


}
