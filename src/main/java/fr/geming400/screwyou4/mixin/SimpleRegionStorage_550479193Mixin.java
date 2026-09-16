package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.SimpleRegionStorage.class)
public class SimpleRegionStorage_550479193Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void write_19333070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19333070L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void write_897525047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897525047L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1564096237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1564096237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void read__138437729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-138437729L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "injectDatafixingContext(Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private static void injectDatafixingContext__1532755460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1532755460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_1057431705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057431705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lnet/minecraft/nbt/CompoundTag;ILnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void upgradeChunkTag__1751663133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751663133L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lnet/minecraft/nbt/CompoundTag;I)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void upgradeChunkTag_34188693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(34188693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeChunkTag(Lcom/mojang/serialization/Dynamic;I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void upgradeChunkTag_56967537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56967537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkScanner()Lnet/minecraft/world/level/chunk/storage/ChunkScanAccess;", cancellable = true)
    private void chunkScanner_1269339055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269339055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "synchronize(Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void synchronize__769662245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769662245L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "storageInfo()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void storageInfo_452898736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452898736L))
            info.setReturnValue(null);
    }


}
