package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.PlayerChunkSender.class)
public class PlayerChunkSender1787141267Mixin {
        @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk__1447363904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1447363904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendNextChunks(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void sendNextChunks_1233500151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1233500151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markChunkPendingToSend(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void markChunkPendingToSend_548925460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(548925460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkBatchReceivedByClient(F)V", cancellable = true)
    private void onChunkBatchReceivedByClient__578136533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-578136533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPending(J)Z", cancellable = true)
    private void isPending__1191133807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191133807L))
            info.setReturnValue(true);
    }


}
