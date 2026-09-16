package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkHolder.class)
public class ChunkHolder850704683Mixin {
        @Inject(at = @At("HEAD"), method = "refreshAccessibility()V", cancellable = true)
    private void refreshAccessibility_930286987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(930286987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkToSend()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkToSend_1750309388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1750309388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadyForSaving()Z", cancellable = true)
    private void isReadyForSaving__809701736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809701736L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFullChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getFullChunkFuture_492997395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492997395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTickingChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getTickingChunkFuture_904918505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904918505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSaveSyncFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getSaveSyncFuture__1133882791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133882791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChangesToBroadcast()Z", cancellable = true)
    private void hasChangesToBroadcast__41134331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41134331L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "wasAccessibleSinceLastSave()Z", cancellable = true)
    private void wasAccessibleSinceLastSave__1273085356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1273085356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addSendDependency(Ljava/util/concurrent/CompletableFuture;)V", cancellable = true)
    private void addSendDependency_1240557768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240557768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSendSyncFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getSendSyncFuture_531860004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531860004L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "setTicketLevel(I)V", cancellable = true)
    private void setTicketLevel__1295631891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1295631891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevel()I", cancellable = true)
    private void getTicketLevel__169552465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169552465L))
            info.setReturnValue(-1581945750);
    }

    @Inject(at = @At("HEAD"), method = "getQueueLevel()I", cancellable = true)
    private void getQueueLevel__680858680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680858680L))
            info.setReturnValue(66253062);
    }

    @Inject(at = @At("HEAD"), method = "getTickingChunk()Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getTickingChunk__978484080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978484080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionLightChanged(Lnet/minecraft/world/level/LightLayer;I)Z", cancellable = true)
    private void sectionLightChanged_505771238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505771238L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "broadcastChanges(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void broadcastChanges__585713596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-585713596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void blockChanged__611628963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611628963L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntityTickingChunkFuture()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getEntityTickingChunkFuture__548546004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548546004L))
            info.setReturnValue(null);
    }


}
