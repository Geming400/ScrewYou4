package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.CubeMap.class)
public class CubeMap1737924729Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__376650700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-376650700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "render(FF)V", cancellable = true)
    private void render__1902391402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1902391402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTextures(Lnet/minecraft/client/renderer/texture/TextureManager;)V", cancellable = true)
    private void registerTextures__172301314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-172301314L))
            info.cancel();
    }


}
