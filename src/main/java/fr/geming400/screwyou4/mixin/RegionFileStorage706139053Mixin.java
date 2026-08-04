package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFileStorage.class)
public class RegionFileStorage706139053Mixin {
        @Inject(at = @At("HEAD"), method = "flush()V", cancellable = true)
    private void flush_744413792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744413792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void info__48637714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48637714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void write__1093296129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1093296129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_744413792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744413792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void read_999438673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999438673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scanChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/StreamTagVisitor;)V", cancellable = true)
    private void scanChunk_1302803364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302803364L))
            info.cancel();
    }


}
