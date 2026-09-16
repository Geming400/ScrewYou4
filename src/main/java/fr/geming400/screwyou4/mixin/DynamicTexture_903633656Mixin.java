package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.DynamicTexture.class)
public class DynamicTexture_903633656Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1210941774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1210941774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPixels()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void getPixels__179757083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179757083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upload()V", cancellable = true)
    private void upload_1915612233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915612233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPixels(Lcom/mojang/blaze3d/platform/NativeImage;)V", cancellable = true)
    private void setPixels__2042753635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2042753635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents__977335005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-977335005L))
            info.cancel();
    }


}
