package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerChunkCache.class)
public class ServerChunkCache578965776Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1535609653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1535609653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Z)V", cancellable = true)
    private void save_391690122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(391690122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void move__1558121948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1558121948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pollTask()Z", cancellable = true)
    private void pollTask_811903843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811903843L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void getGenerator__739865833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739865833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;Z)V", cancellable = true)
    private void tick_627814488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(627814488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void getLevel__1177355042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177355042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getLevel_244582634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244582634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deactivateTicketsOnClosing()V", cancellable = true)
    private void deactivateTicketsOnClosing__10526112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-10526112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkFuture(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void getChunkFuture_36676184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(36676184L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "onLightUpdate(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void onLightUpdate__1324768297(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1324768297L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkForLighting(II)Lnet/minecraft/world/level/chunk/LightChunk;", cancellable = true)
    private void getChunkForLighting_612666471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612666471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoadedChunksCount()I", cancellable = true)
    private void getLoadedChunksCount_2126747816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126747816L))
            info.setReturnValue(2134630097);
    }

    @Inject(at = @At("HEAD"), method = "removeEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void removeEntity_1631424035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1631424035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicket(Lnet/minecraft/server/level/Ticket;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void addTicket_1472465988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1472465988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void addTicketWithRadius_629061085(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629061085L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayers(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayers__1875825761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1875825761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1267190167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267190167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/server/level/ThreadedLevelLightEngine;", cancellable = true)
    private void getLightEngine__550797230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550797230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnSettings(Z)V", cancellable = true)
    private void setSpawnSettings_1012385353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012385353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats_1798318333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798318333L))
            info.setReturnValue("q\u5EA9bC{.a[\u24F0rNCMBV!p>@BA1%\"\u5E28<\u1047Zb\uA2BB1\uFB69&n\u6A00Q;Qg16Z3!\uFE83\u24FF\u263Fvb\u2A64!z5`>o-\u26D9dUR");
    }

    @Inject(at = @At("HEAD"), method = "getDataStorage()Lnet/minecraft/world/level/storage/SavedDataStorage;", cancellable = true)
    private void getDataStorage_1526379455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1526379455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasEntityWithId(I)Z", cancellable = true)
    private void hasEntityWithId_1612110526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612110526L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasActiveTickets()Z", cancellable = true)
    private void hasActiveTickets__1912029536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912029536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getGeneratorState()Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private void getGeneratorState_1943077744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943077744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkScanner()Lnet/minecraft/world/level/chunk/storage/ChunkScanAccess;", cancellable = true)
    private void chunkScanner_1297825639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297825639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__1904841499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904841499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoiManager()Lnet/minecraft/world/entity/ai/village/poi/PoiManager;", cancellable = true)
    private void getPoiManager__1234319488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234319488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateChunkForced(Lnet/minecraft/world/level/ChunkPos;Z)Z", cancellable = true)
    private void updateChunkForced_963577154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963577154L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getForceLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getForceLoadedChunks__1766946213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766946213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void blockChanged__883371714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-883371714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPositionTicking(J)Z", cancellable = true)
    private void isPositionTicking__1805797773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805797773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPendingTasksCount()I", cancellable = true)
    private void getPendingTasksCount__845329964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845329964L))
            info.setReturnValue(-1238736872);
    }

    @Inject(at = @At("HEAD"), method = "getLastSpawnState()Lnet/minecraft/world/level/NaturalSpawner$SpawnState;", cancellable = true)
    private void getLastSpawnState__1454266861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1454266861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSimulationDistance(I)V", cancellable = true)
    private void setSimulationDistance_1039658202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039658202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setViewDistance(I)V", cancellable = true)
    private void setViewDistance__1726669192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1726669192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk_274940307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274940307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk_1756102292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756102292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity__328572032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-328572032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendToTrackingPlayersAndSelf(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendToTrackingPlayersAndSelf__1970812596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1970812596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicketAndLoadWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void addTicketAndLoadWithRadius_1875817878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875817878L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "removeTicketWithRadius(Lnet/minecraft/server/level/TicketType;Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void removeTicketWithRadius_671716954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(671716954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkReadyToSend(Lnet/minecraft/server/level/ChunkHolder;)V", cancellable = true)
    private void onChunkReadyToSend_1672314788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672314788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkDebugData(Lnet/minecraft/world/level/ChunkPos;)Ljava/lang/String;", cancellable = true)
    private void getChunkDebugData__457131437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457131437L))
            info.setReturnValue("o/}Ind#CFA;xX/\uFD64\u8AB8S&C\u9629\uD78AwRI\u4CAEuh,jv#dX%n\u5617saX9? u.\u6EB3onaX\u054EP%\"\u1C91]\u2347#\u5D3F,\u5116JjV\u4B144-r1E}$A*m! ");
    }

    @Inject(at = @At("HEAD"), method = "getChunkNow(II)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunkNow__1865813130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865813130L))
            info.setReturnValue(null);
    }


}
