package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Panorama.class)
public class Panorama_543471109Mixin {
        @Inject(at = @At("HEAD"), method = "holdSpin()V", cancellable = true)
    private void holdSpin_581745847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(581745847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSpin()V", cancellable = true)
    private void startSpin_581745847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(581745847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_1758644940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758644940L))
            info.cancel();
    }


}
