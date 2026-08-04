package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LightmapRenderStateExtractor.class)
public class LightmapRenderStateExtractor_876671627Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/LightmapRenderState;F)V", cancellable = true)
    private void extract__1500233001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1500233001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_914946365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(914946365L))
            info.cancel();
    }


}
