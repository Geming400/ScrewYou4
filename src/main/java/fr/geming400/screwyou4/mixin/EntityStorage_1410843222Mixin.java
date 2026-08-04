package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.EntityStorage.class)
public class EntityStorage_1410843222Mixin {
        @Inject(at = @At("HEAD"), method = "flush(Z)V", cancellable = true)
    private void flush__1654507246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1654507246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1449117960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1449117960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeEntities(Lnet/minecraft/world/level/entity/ChunkEntities;)V", cancellable = true)
    private void storeEntities_1059478681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1059478681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadEntities(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void loadEntities__1496057082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496057082L))
            info.setReturnValue(null);
    }


}
