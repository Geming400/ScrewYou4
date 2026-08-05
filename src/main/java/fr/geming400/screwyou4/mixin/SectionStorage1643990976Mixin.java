package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SectionStorage.class)
public class SectionStorage1643990976Mixin {
        @Inject(at = @At("HEAD"), method = "flush(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void flush__1136094113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1136094113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1682265715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682265715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1682269559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682269559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "flushAll()V", cancellable = true)
    private void flushAll_1682265715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682265715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prefetch(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prefetch__1262909327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1262909327L))
            info.setReturnValue(null);
    }


}
