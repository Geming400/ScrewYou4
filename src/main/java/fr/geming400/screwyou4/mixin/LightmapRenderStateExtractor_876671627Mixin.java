package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LightmapRenderStateExtractor.class)
public class LightmapRenderStateExtractor_876671627Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/renderer/state/LightmapRenderState;F)V", cancellable = true)
    private void extract__2074551754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074551754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_746987968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(746987968L))
            info.cancel();
    }


}
