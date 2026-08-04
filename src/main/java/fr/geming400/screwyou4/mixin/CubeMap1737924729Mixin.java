package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CubeMap.class)
public class CubeMap1737924729Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1776199468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776199468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(FF)V", cancellable = true)
    private void render_653387244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(653387244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerTextures__29295783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-29295783L))
            info.cancel();
    }


}
