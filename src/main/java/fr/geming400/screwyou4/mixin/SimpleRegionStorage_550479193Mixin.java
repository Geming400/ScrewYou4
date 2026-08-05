package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SimpleRegionStorage.class)
public class SimpleRegionStorage_550479193Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void write__451403443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451403443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void write__508697866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508697866L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_588753931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(588753931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void read_1938546185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938546185L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "synchronize(Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void synchronize__1036343765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036343765L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_294591260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294591260L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "injectDatafixingContext(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void injectDatafixingContext__124630109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-124630109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chunkScanner()Lnet/minecraft/world/level/chunk/storage/ChunkScanAccess;", cancellable = true)
    private void chunkScanner__2107967264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107967264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void upgradeChunkTag_2082434938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082434938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lnet/minecraft/nbt/CompoundTag;ILnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void upgradeChunkTag__793902420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793902420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void upgradeChunkTag__446867874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446867874L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "storageInfo()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void storageInfo__204297575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204297575L))
            info.setReturnValue(null);
    }


}
