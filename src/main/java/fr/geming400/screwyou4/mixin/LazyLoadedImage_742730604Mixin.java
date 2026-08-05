package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.LazyLoadedImage.class)
public class LazyLoadedImage_742730604Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void get__528799354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528799354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release__1275660681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1275660681L))
            info.cancel();
    }


}
