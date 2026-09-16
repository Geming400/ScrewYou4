package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.gui.MinecraftServerGui.class)
public class MinecraftServerGui994453237Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__631712122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-631712122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "print(Ljavax/swing/JTextArea;Ljavax/swing/JScrollPane;Ljava/lang/String;)V", cancellable = true)
    private void print__2045406934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2045406934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1120122192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1120122192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFinalizer(Ljava/lang/Runnable;)V", cancellable = true)
    private void addFinalizer__853104877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-853104877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFrameFor(Lnet/minecraft/server/dedicated/DedicatedServer;)Lnet/minecraft/server/gui/MinecraftServerGui;", cancellable = true)
    private static void showFrameFor__170475722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170475722L))
            info.setReturnValue(null);
    }


}
