package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.Screenshot.class)
public class Screenshot326273946Mixin {
        @Inject(at = @At("HEAD"), method = "takeScreenshot(Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void takeScreenshot_380107830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(380107830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "takeScreenshot(Lcom/mojang/blaze3d/pipeline/RenderTarget;ILjava/util/function/Consumer;)V", cancellable = true)
    private static void takeScreenshot__1474249553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1474249553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grab(Lnet/minecraft/client/Minecraft;Z)V", cancellable = true)
    private static void grab_1713854953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713854953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grab(Ljava/io/File;Ljava/lang/String;Lcom/mojang/blaze3d/pipeline/RenderTarget;ILjava/util/function/Consumer;)V", cancellable = true)
    private static void grab_2058003537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2058003537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "grab(Ljava/io/File;Lcom/mojang/blaze3d/pipeline/RenderTarget;Ljava/util/function/Consumer;)V", cancellable = true)
    private static void grab__1410402594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1410402594L))
            info.cancel();
    }


}
