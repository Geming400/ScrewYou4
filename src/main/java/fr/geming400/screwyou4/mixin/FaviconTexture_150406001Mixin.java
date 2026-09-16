package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.FaviconTexture.class)
public class FaviconTexture_150406001Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear__635421706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-635421706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1964169429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1964169429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isClosed()Z", cancellable = true)
    private void isClosed__672278607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672278607L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "upload(Lcom/mojang/blaze3d/platform/NativeImage;)V", cancellable = true)
    private void upload_1068510952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068510952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forWorld(Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/lang/String;)Lnet/minecraft/client/gui/screens/FaviconTexture;", cancellable = true)
    private static void forWorld_2081704103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081704103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forServer(Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/lang/String;)Lnet/minecraft/client/gui/screens/FaviconTexture;", cancellable = true)
    private static void forServer_1621215844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621215844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureLocation_711632039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711632039L))
            info.setReturnValue(null);
    }


}
