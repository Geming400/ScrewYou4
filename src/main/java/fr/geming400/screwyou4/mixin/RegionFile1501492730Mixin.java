package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFile.class)
public class RegionFile1501492730Mixin {
        @Inject(at = @At("HEAD"), method = "clear(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void clear__1191559444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1191559444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flush()V", cancellable = true)
    private void flush_750191657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(750191657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__613082699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-613082699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPath()Ljava/nio/file/Path;", cancellable = true)
    private void getPath__16753293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16753293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void hasChunk_979855114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979855114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doesChunkExist(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void doesChunkExist__801082086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801082086L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataOutputStream(Lnet/minecraft/world/level/ChunkPos;)Ljava/io/DataOutputStream;", cancellable = true)
    private void getChunkDataOutputStream_1831947191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831947191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataInputStream(Lnet/minecraft/world/level/ChunkPos;)Ljava/io/DataInputStream;", cancellable = true)
    private void getChunkDataInputStream_778893309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778893309L))
            info.setReturnValue(null);
    }


}
