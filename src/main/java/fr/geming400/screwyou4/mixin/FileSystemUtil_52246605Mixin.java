package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.FileSystemUtil.class)
public class FileSystemUtil_52246605Mixin {
        @Inject(at = @At("HEAD"), method = "safeGetPath(Ljava/net/URI;)Ljava/nio/file/Path;", cancellable = true)
    private static void safeGetPath__185845056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185845056L))
            info.setReturnValue(null);
    }


}
