package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.FaviconTexture.class)
public class FaviconTexture_150406001Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_188680739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188680739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_188680739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188680739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isClosed()Z", cancellable = true)
    private void isClosed_188684583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188684583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forWorld(Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/lang/String;)Lnet/minecraft/client/gui/screens/FaviconTexture;", cancellable = true)
    private static void forWorld__832937904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832937904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forServer(Lnet/minecraft/client/renderer/texture/TextureManager;Ljava/lang/String;)Lnet/minecraft/client/gui/screens/FaviconTexture;", cancellable = true)
    private static void forServer__832937904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832937904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upload(Lcom/mojang/blaze3d/platform/NativeImage;)V", cancellable = true)
    private void upload_890927783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(890927783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textureLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void textureLocation_2002306743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002306743L))
            info.setReturnValue(null);
    }


}
