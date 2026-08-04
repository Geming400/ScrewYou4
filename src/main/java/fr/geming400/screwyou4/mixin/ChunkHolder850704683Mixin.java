package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkHolder.class)
public class ChunkHolder850704683Mixin {
        @Inject(at = @At("HEAD"), method = "broadcastChanges(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void broadcastChanges__512361786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-512361786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void blockChanged_1019475126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019475126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityTickingChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getEntityTickingChunkFuture__1730887352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730887352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSendSyncFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getSendSyncFuture__1730887352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730887352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadyForSaving()Z", cancellable = true)
    private void isReadyForSaving_888983266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888983266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshAccessibility()V", cancellable = true)
    private void refreshAccessibility_888979422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(888979422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionLightChanged(Lnet/minecraft/world/level/LightLayer;I)Z", cancellable = true)
    private void sectionLightChanged__143595229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143595229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTicketLevel(I)V", cancellable = true)
    private void setTicketLevel_2064621655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2064621655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTickingChunk()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getTickingChunk__407631406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407631406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFullChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getFullChunkFuture__1730887352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730887352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevel()I", cancellable = true)
    private void getTicketLevel_888966929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888966929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getQueueLevel()I", cancellable = true)
    private void getQueueLevel_888966929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888966929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkToSend()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkToSend__407631406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407631406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTickingChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getTickingChunkFuture__1730887352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730887352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addSendDependency(Ljava/util/concurrent/CompletableFuture;)V", cancellable = true)
    private void addSendDependency__100444100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-100444100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSaveSyncFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getSaveSyncFuture__1730887352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730887352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasAccessibleSinceLastSave()Z", cancellable = true)
    private void wasAccessibleSinceLastSave_888983266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888983266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChangesToBroadcast()Z", cancellable = true)
    private void hasChangesToBroadcast_888983266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888983266L))
            info.setReturnValue(null);
    }


}
