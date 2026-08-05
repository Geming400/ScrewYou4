package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Screenshot.class)
public class Screenshot326273946Mixin {
        @Inject(at = @At("HEAD"), method = "grab(Ljava/io/File;Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void grab_1164333970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1164333970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grab(Lnet/minecraft/client/Minecraft;Z)V", cancellable = true)
    private static void grab__664475491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-664475491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grab(Ljava/io/File;Ljava/lang/String;Lcom/mojang/blaze3d/pipeline/RenderTarget;ILjava/util/function/Consumer;)V", cancellable = true)
    private static void grab__290946275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-290946275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeScreenshot(Lcom/mojang/blaze3d/pipeline/RenderTarget;ILjava/util/function/Consumer;)V", cancellable = true)
    private static void takeScreenshot__815175460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-815175460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeScreenshot(Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void takeScreenshot_817010281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(817010281L))
            info.cancel();
    }


}
