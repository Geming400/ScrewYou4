package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerChunkCache.class)
public class ServerChunkCache578965776Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_617240515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(617240515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Z)V", cancellable = true)
    private void save_1808582605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1808582605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void move__190596077(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-190596077L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pollTask()Z", cancellable = true)
    private void pollTask_617244359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617244359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void getGenerator__1218026630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218026630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;Z)V", cancellable = true)
    private void tick_2072621819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2072621819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getLevel__2085281928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085281928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__1997302292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997302292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState_1139410519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139410519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkFuture(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getChunkFuture_1299430898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299430898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayers(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayers__637785353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-637785353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void addTicketWithRadius__2088958174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2088958174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayersAndSelf(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayersAndSelf__637785353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-637785353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPendingTasksCount()I", cancellable = true)
    private void getPendingTasksCount_617228022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617228022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/server/level/ThreadedLevelLightEngine;", cancellable = true)
    private void getLightEngine__332557356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332557356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1485430041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485430041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk__1143737380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143737380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForceLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getForceLoadedChunks_514079803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514079803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastSpawnState()Lnet/minecraft/world/level/NaturalSpawner$SpawnState;", cancellable = true)
    private void getLastSpawnState__1692596779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692596779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkNow(II)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkNow__346071401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346071401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkForLighting(II)Lnet/minecraft/world/level/chunk/LightChunk;", cancellable = true)
    private void getChunkForLighting__809548247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809548247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkForced(Lnet/minecraft/world/level/ChunkPos;Z)Z", cancellable = true)
    private void updateChunkForced_338777701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338777701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats__556494695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556494695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onLightUpdate(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void onLightUpdate_1756402103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1756402103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLoadedChunksCount()I", cancellable = true)
    private void getLoadedChunksCount_617228022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617228022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnSettings(Z)V", cancellable = true)
    private void setSpawnSettings_1808582605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1808582605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void blockChanged_747732375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747732375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void removeEntity_127241116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127241116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk__416909849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416909849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_127241116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127241116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPoiManager()Lnet/minecraft/world/entity/ai/village/poi/PoiManager;", cancellable = true)
    private void getPoiManager__551126329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551126329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(I)V", cancellable = true)
    private void setViewDistance_1792882748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792882748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(I)V", cancellable = true)
    private void setSimulationDistance_1792882748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792882748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDataStorage()Lnet/minecraft/world/level/storage/SavedDataStorage;", cancellable = true)
    private void getDataStorage_579961476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579961476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deactivateTicketsOnClosing()V", cancellable = true)
    private void deactivateTicketsOnClosing_617240515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(617240515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkReadyToSend(Lnet/minecraft/server/level/ChunkHolder;)V", cancellable = true)
    private void onChunkReadyToSend__14910436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-14910436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkDebugData(Lnet/minecraft/world/level/ChunkPos;)Ljava/lang/String;", cancellable = true)
    private void getChunkDebugData_646932525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646932525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEntityWithId(I)Z", cancellable = true)
    private void hasEntityWithId_1792886592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792886592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkScanner()Lnet/minecraft/world/level/chunk/storage/ChunkScanAccess;", cancellable = true)
    private void chunkScanner__2079480680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079480680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTicketAndLoadWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void addTicketAndLoadWithRadius__1317720850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317720850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGeneratorState()Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private void getGeneratorState__1199727108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199727108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void removeTicketWithRadius__2088958174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2088958174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPositionTicking(J)Z", cancellable = true)
    private void isPositionTicking_1793810113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793810113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasActiveTickets()Z", cancellable = true)
    private void hasActiveTickets_617244359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617244359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void addTicket__1463546697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1463546697L))
            info.cancel();
    }


}
