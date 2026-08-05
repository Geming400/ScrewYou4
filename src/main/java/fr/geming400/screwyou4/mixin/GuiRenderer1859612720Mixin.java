package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiRenderer.class)
public class GuiRenderer1859612720Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1897887459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1897887459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerPanoramaTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerPanoramaTextures_92392208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(92392208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render()V", cancellable = true)
    private void render_1897887459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1897887459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1897887459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1897887459L))
            info.cancel();
    }


}
