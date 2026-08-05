package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.Panorama.class)
public class Panorama_543471109Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__672414554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-672414554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSpin()V", cancellable = true)
    private void startSpin__1997355149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1997355149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "holdSpin()V", cancellable = true)
    private void holdSpin__1913606218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1913606218L))
            info.cancel();
    }


}
