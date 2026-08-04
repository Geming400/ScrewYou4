package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFile.class)
public class RegionFile1501492730Mixin {
        @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void clear__1278592359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1278592359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flush()V", cancellable = true)
    private void flush_1539767469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539767469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1539767469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539767469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPath()Ljava/nio/file/Path;", cancellable = true)
    private void getPath_367129048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367129048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void hasChunk__1278588515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278588515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doesChunkExist(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void doesChunkExist__1278588515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278588515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataInputStream(Lnet/minecraft/world/level/ChunkPos;)Ljava/io/DataInputStream;", cancellable = true)
    private void getChunkDataInputStream__1644236026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644236026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataOutputStream(Lnet/minecraft/world/level/ChunkPos;)Ljava/io/DataOutputStream;", cancellable = true)
    private void getChunkDataOutputStream__67596107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67596107L))
            info.setReturnValue(null);
    }


}
