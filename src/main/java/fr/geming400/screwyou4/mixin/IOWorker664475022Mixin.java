package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.IOWorker.class)
public class IOWorker664475022Mixin {
        @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void store__394702036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394702036L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void store__337407613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337407613L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_702749761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702749761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadAsync(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadAsync_2052542015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052542015L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "scanChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/StreamTagVisitor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void scanChunk__1742430233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742430233L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "storageInfo()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void storageInfo__90301745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-90301745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "synchronize(Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void synchronize__922347935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922347935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_408587090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408587090L))
            info.setReturnValue(true);
    }


}
