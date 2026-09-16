package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.IOWorker.class)
public class IOWorker664475022Mixin {
        @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void store_918133314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918133314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "store(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void store__705681365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705681365L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1450100407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1450100407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "synchronize(Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void synchronize__655666415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655666415L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "loadAsync(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadAsync__1766203531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766203531L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "storageInfo()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void storageInfo_566894566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566894566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_1171427535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171427535L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "scanChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/StreamTagVisitor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void scanChunk_404879831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404879831L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
