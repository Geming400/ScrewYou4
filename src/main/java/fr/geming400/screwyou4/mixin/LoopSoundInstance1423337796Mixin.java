package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler.LoopSoundInstance.class)
public class LoopSoundInstance1423337796Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1293654138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293654138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fadeIn()V", cancellable = true)
    private void fadeIn__234909738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-234909738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fadeOut()V", cancellable = true)
    private void fadeOut__1075437563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1075437563L))
            info.cancel();
    }


}
