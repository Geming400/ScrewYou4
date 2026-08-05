package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FileZipper.class)
public class FileZipper1120272254Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;)V", cancellable = true)
    private void add__27914737(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-27914737L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;Ljava/lang/String;)V", cancellable = true)
    private void add__2127909223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2127909223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;Ljava/io/File;)V", cancellable = true)
    private void add__396232570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-396232570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__994303175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-994303175L))
            info.cancel();
    }


}
