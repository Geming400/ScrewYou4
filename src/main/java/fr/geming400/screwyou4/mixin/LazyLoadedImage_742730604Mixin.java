package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.LazyLoadedImage.class)
public class LazyLoadedImage_742730604Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void get_1016513820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016513820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release_781005342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(781005342L))
            info.cancel();
    }


}
