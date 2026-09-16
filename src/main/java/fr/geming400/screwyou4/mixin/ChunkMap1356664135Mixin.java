package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkMap.class)
public class ChunkMap1356664135Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1800395724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800395724L))
            info.setReturnValue(-2130537129);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__757911294(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-757911294L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void move__780423589(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-780423589L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWork()Z", cancellable = true)
    private void hasWork_1308031251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308031251L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyStep(Lnet/minecraft/server/level/GenerationChunkHolder;Lnet/minecraft/world/level/chunk/status/ChunkStep;Lnet/minecraft/util/StaticCache2D;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void applyStep__485942346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485942346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkToSend(J)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkToSend_865625274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(865625274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareEntityTickingChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareEntityTickingChunk_2052022045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052022045L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "acquireGeneration(J)Lnet/minecraft/server/level/GenerationChunkHolder;", cancellable = true)
    private void acquireGeneration_969900623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969900623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseGeneration(Lnet/minecraft/server/level/GenerationChunkHolder;)V", cancellable = true)
    private void releaseGeneration__631077012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-631077012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareTickingChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareTickingChunk_429528154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429528154L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "prepareAccessibleChunk(Lnet/minecraft/server/level/ChunkHolder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void prepareAccessibleChunk__34211013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34211013L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getLatestStatus(J)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void getLatestStatus_892499852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(892499852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scheduleGenerationTask(Lnet/minecraft/world/level/chunk/status/ChunkStatus;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/server/level/ChunkGenerationTask;", cancellable = true)
    private void scheduleGenerationTask__941220377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941220377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatingChunkIfPresent(J)Lnet/minecraft/server/level/ChunkHolder;", cancellable = true)
    private void getUpdatingChunkIfPresent_395900728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395900728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChunkTracked(Lnet/minecraft/server/level/ServerPlayer;II)Z", cancellable = true)
    private void isChunkTracked_608866997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608866997L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlayersCloseForSpawning(Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private void getPlayersCloseForSpawning_1920838399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1920838399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDebugData(Lnet/minecraft/world/level/ChunkPos;)Ljava/lang/String;", cancellable = true)
    private void getChunkDebugData_320566922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320566922L))
            info.setReturnValue("g\u1014)\u1CEB(zS057',\u6C17*EM/,Q1`H\u0FB8^??}i_7Iq7=<OI\u53FD+\u78226\u641CYu)\u6EDB;G|#BGd7\u4DEFTS d\u948BgN8@\u858A\uD5E5\uBE44\u05D0]K6Vd\u313B7");
    }

    @Inject(at = @At("HEAD"), method = "isTrackedByAnyPlayer(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isTrackedByAnyPlayer__133065875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133065875L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "runGenerationTasks()V", cancellable = true)
    private void runGenerationTasks__903289969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903289969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachBlockTickingChunk(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachBlockTickingChunk_1715458831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1715458831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachReadyToSendChunk(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachReadyToSendChunk__900943403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-900943403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "collectSpawningChunks(Ljava/util/List;)V", cancellable = true)
    private void collectSpawningChunks_266041908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(266041908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachEntityTrackedBy(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachEntityTrackedBy__987855328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-987855328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "waitForLightBeforeSending(Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void waitForLightBeforeSending_1643379808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1643379808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayers(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayers__1098127402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1098127402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughForSpawning(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void anyPlayerCloseEnoughForSpawning_1587912821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587912821L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasEntityWithId(I)Z", cancellable = true)
    private void hasEntityWithId__1905158411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905158411L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDistanceManager()Lnet/minecraft/server/level/DistanceManager;", cancellable = true)
    private void getDistanceManager_484843522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484843522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughTo(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void anyPlayerCloseEnoughTo_2140619053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140619053L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Lnet/minecraft/world/level/ChunkPos;Z)Ljava/util/List;", cancellable = true)
    private void getPlayers__448728547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448728547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkDataFixContextTag(Lnet/minecraft/resources/ResourceKey;Ljava/util/Optional;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getChunkDataFixContextTag__1380480311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380480311L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "resendBiomesForChunks(Ljava/util/List;)V", cancellable = true)
    private void resendBiomesForChunks_1845346250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1845346250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStorageName()Ljava/lang/String;", cancellable = true)
    private void getStorageName_1514445632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514445632L))
            info.setReturnValue(" \uB852zn\u1B57RF2DRfkU}10W(0T+y2Ob@\"31:<D&6/q\u358F\u4AB8\uB6F4c\u509EA)\u21FE7\u171F+RE`tj\u0484^e9ymm\u9047L}YH2YD2`\u7467JRb3");
    }

    @Inject(at = @At("HEAD"), method = "debugFuturesAndCreateReportedException(Ljava/lang/IllegalStateException;Ljava/lang/String;)Lnet/minecraft/ReportedException;", cancellable = true)
    private void debugFuturesAndCreateReportedException__216744022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216744022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayersFiltered(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;Ljava/util/function/Predicate;)V", cancellable = true)
    private void sendToTrackingPlayersFiltered__1686289010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1686289010L))
            info.cancel();
    }


}
