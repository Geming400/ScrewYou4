package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.SpecialModelRenderers.class)
public class SpecialModelRenderers2121374514Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap_683256111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(683256111L))
            info.cancel();
    }


}
