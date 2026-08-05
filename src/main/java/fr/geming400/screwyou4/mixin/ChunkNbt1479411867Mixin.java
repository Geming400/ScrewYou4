package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.access.ChunkNbt.class)
public class ChunkNbt1479411867Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__635163562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-635163562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;Ljava/util/function/UnaryOperator;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void updateChunk__1940238942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940238942L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
