package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.DynamicTexture.class)
public class DynamicTexture_903633656Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_941908394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(941908394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "upload()V", cancellable = true)
    private void upload_941908394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(941908394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPixels(Lcom/mojang/blaze3d/platform/NativeImage;)V", cancellable = true)
    private void setPixels_1644155438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1644155438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPixels()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void getPixels_1177416872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177416872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpContents(Lnet/minecraft/resources/Identifier;Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpContents_1730847633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1730847633L))
            info.cancel();
    }


}
