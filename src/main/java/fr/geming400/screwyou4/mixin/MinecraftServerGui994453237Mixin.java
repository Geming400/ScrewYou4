package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.gui.MinecraftServerGui.class)
public class MinecraftServerGui994453237Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_1032727976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1032727976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "print(Ljavax/swing/JTextArea;Ljavax/swing/JScrollPane;Ljava/lang/String;)V", cancellable = true)
    private void print_789923959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789923959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1032727976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1032727976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFinalizer(Ljava/lang/Runnable;)V", cancellable = true)
    private void addFinalizer__1843772378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1843772378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showFrameFor(Lnet/minecraft/server/dedicated/DedicatedServer;)Lnet/minecraft/server/gui/MinecraftServerGui;", cancellable = true)
    private static void showFrameFor_840488527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840488527L))
            info.setReturnValue(null);
    }


}
