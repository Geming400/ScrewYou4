package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.PlayerChunkSender.class)
public class PlayerChunkSender1787141267Mixin {
        @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_255483266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(255483266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkBatchReceivedByClient(F)V", cancellable = true)
    private void onChunkBatchReceivedByClient__1296679620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1296679620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNextChunks(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendNextChunks_1017579414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1017579414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPending(J)Z", cancellable = true)
    private void isPending__1292981692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292981692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "markChunkPendingToSend(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void markChunkPendingToSend_424074798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(424074798L))
            info.cancel();
    }


}
