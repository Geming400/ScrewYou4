package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.BubbleColumnAmbientSoundHandler.class)
public class BubbleColumnAmbientSoundHandler631578979Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_669853718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(669853718L))
            info.cancel();
    }


}
