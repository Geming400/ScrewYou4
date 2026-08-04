package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.BiomeAmbientSoundsHandler.LoopSoundInstance.class)
public class LoopSoundInstance1423337796Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1461612535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461612535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fadeIn()V", cancellable = true)
    private void fadeIn_1461612535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461612535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fadeOut()V", cancellable = true)
    private void fadeOut_1461612535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461612535L))
            info.cancel();
    }


}
