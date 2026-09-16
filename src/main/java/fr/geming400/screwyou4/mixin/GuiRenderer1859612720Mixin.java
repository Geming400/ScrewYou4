package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.GuiRenderer.class)
public class GuiRenderer1859612720Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__254962709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-254962709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render()V", cancellable = true)
    private void render_179028749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(179028749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerPanoramaTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerPanoramaTextures__417169408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-417169408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFrame()V", cancellable = true)
    private void endFrame_1673328849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1673328849L))
            info.cancel();
    }


}
