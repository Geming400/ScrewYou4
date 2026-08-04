package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkMap.class)
public class ChunkMap1356664135Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1394926381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394926381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1394938874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1394938874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void move_587102282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587102282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1394942718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394942718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Lnet/minecraft/world/level/ChunkPos;Z)Ljava/util/List;", cancellable = true)
    private void getPlayers__1345250279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345250279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayersFiltered(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;Ljava/util/function/Predicate;)V", cancellable = true)
    private void sendToTrackingPlayersFiltered__1160389699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1160389699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughForSpawning(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void anyPlayerCloseEnoughForSpawning__1423417110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423417110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugFuturesAndCreateReportedException(Ljava/lang/IllegalStateException;Ljava/lang/String;)Lnet/minecraft/ReportedException;", cancellable = true)
    private void debugFuturesAndCreateReportedException_1076212548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076212548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayers(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayers_139913006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(139913006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyStep(Lnet/minecraft/server/level/GenerationChunkHolder;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void applyStep_1899261660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899261660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "acquireGeneration(J)Lnet/minecraft/server/level/GenerationChunkHolder;", cancellable = true)
    private void acquireGeneration__1583539043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583539043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTickingChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareTickingChunk_1135816427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135816427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareAccessibleChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareAccessibleChunk_1135816427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135816427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareEntityTickingChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareEntityTickingChunk_1135816427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135816427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkToSend(J)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkToSend__1606029900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606029900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseGeneration(Lnet/minecraft/server/level/GenerationChunkHolder;)V", cancellable = true)
    private void releaseGeneration_235666123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(235666123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleGenerationTask(Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/server/level/ChunkGenerationTask;", cancellable = true)
    private void scheduleGenerationTask_2132409011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132409011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLatestStatus(J)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getLatestStatus_1513955707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513955707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataFixContextTag(Lnet/minecraft/resources/ResourceKey;Ljava/util/Optional;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getChunkDataFixContextTag_93078890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(93078890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatingChunkIfPresent(J)Lnet/minecraft/server/level/ChunkHolder;", cancellable = true)
    private void getUpdatingChunkIfPresent__1868183835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1868183835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChunkTracked(Lnet/minecraft/server/level/ServerPlayer;II)Z", cancellable = true)
    private void isChunkTracked_1418904174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418904174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runGenerationTasks()V", cancellable = true)
    private void runGenerationTasks_1394938874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1394938874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkDebugData(Lnet/minecraft/world/level/ChunkPos;)Ljava/lang/String;", cancellable = true)
    private void getChunkDebugData_1424630884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424630884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughTo(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void anyPlayerCloseEnoughTo__1974101981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974101981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTrackedByAnyPlayer(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isTrackedByAnyPlayer_904943319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904943319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waitForLightBeforeSending(Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void waitForLightBeforeSending_1100772359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100772359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectSpawningChunks(Ljava/util/List;)V", cancellable = true)
    private void collectSpawningChunks_577445547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577445547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasEntityWithId(I)Z", cancellable = true)
    private void hasEntityWithId__1724382345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724382345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachEntityTrackedBy(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachEntityTrackedBy_758859604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(758859604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachBlockTickingChunk(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachBlockTickingChunk_2037680548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037680548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayersCloseForSpawning(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private void getPlayersCloseForSpawning__1480546293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480546293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachReadyToSendChunk(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachReadyToSendChunk_2037680548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037680548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDistanceManager()Lnet/minecraft/server/level/DistanceManager;", cancellable = true)
    private void getDistanceManager__532026304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532026304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStorageName()Ljava/lang/String;", cancellable = true)
    private void getStorageName_221203664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221203664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resendBiomesForChunks(Ljava/util/List;)V", cancellable = true)
    private void resendBiomesForChunks_577445547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577445547L))
            info.cancel();
    }


}
