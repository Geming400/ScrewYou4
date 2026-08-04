package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.SpecialModelRenderers.class)
public class SpecialModelRenderers2121374514Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap()V", cancellable = true)
    private static void bootstrap__2135317795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2135317795L))
            info.cancel();
    }


}
