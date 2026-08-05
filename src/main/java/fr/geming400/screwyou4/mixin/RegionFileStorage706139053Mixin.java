package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionFileStorage.class)
public class RegionFileStorage706139053Mixin {
        @Inject(at = @At("HEAD"), method = "flush()V", cancellable = true)
    private void flush__45162020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-45162020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "info()Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void info__2042849664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042849664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void write_1115107550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115107550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1408436376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1408436376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void read__26952965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26952965L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "scanChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/StreamTagVisitor;)V", cancellable = true)
    private void scanChunk_1435920308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1435920308L))
            info.cancel();
    }


}
