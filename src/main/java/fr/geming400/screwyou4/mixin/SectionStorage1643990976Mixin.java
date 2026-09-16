package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SectionStorage.class)
public class SectionStorage1643990976Mixin {
        @Inject(at = @At("HEAD"), method = "flush(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void flush__246706725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-246706725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__470584453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-470584453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1595358092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595358092L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "flushAll()V", cancellable = true)
    private void flushAll_441783446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441783446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prefetch(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prefetch_1095894120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095894120L))
            info.setReturnValue(null);
    }


}
