package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.FileFixUtil.class)
public class FileFixUtil2002570829Mixin {
        @Inject(at = @At("HEAD"), method = "deleteFileOrEmptyDirectory(Ljava/nio/file/Path;Ljava/lang/String;)V", cancellable = true)
    private static void deleteFileOrEmptyDirectory__2028962025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2028962025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveFile(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private static void moveFile_805214110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805214110L))
            info.cancel();
    }


}
