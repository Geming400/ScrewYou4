package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.EntityStorage.class)
public class EntityStorage_1410843222Mixin {
        @Inject(at = @At("HEAD"), method = "flush(Z)V", cancellable = true)
    private void flush__361553642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-361553642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__703732208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-703732208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadEntities(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadEntities_41615309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(41615309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storeEntities(Lnet/minecraft/world/level/entity/ChunkEntities;)V", cancellable = true)
    private void storeEntities__1311834601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1311834601L))
            info.cancel();
    }


}
