package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadCacheCleaner.class)
public class DownloadCacheCleaner867204968Mixin {
        @Inject(at = @At("HEAD"), method = "vacuumCacheDir(Ljava/nio/file/Path;I)V", cancellable = true)
    private static void vacuumCacheDir_178468493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(178468493L))
            info.cancel();
    }


}
