package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FileZipper.class)
public class FileZipper1120272254Mixin {
        @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;)V", cancellable = true)
    private void add__1567408240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1567408240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;Ljava/lang/String;)V", cancellable = true)
    private void add__1346838054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1346838054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/nio/file/Path;Ljava/io/File;)V", cancellable = true)
    private void add_616952903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(616952903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1158546993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1158546993L))
            info.cancel();
    }


}
