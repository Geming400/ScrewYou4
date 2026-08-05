package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.class)
public class DownloadQueue_1805874277Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__308701153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-308701153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "downloadBatch(Lnet/minecraft/server/packs/DownloadQueue$BatchConfig;Ljava/util/Map;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void downloadBatch_761066479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761066479L))
            info.setReturnValue(null);
    }


}
