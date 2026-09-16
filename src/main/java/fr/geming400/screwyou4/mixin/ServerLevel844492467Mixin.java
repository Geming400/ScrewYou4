package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerLevel.class)
public class ServerLevel844492467Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1614915496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614915496L))
            info.setReturnValue("e79}q9\uCA8Ec)ht}>*![M*/.\u116E\uB74DF.}*M{_Y9\u3D1C(q1>5Y");
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1270082962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1270082962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/util/ProgressListener;ZZ)V", cancellable = true)
    private void save__1091275744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1091275744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unload(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void unload_1880853295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880853295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_1410976211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410976211L))
            info.setReturnValue(-6532125521012307901L);
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void tick__125153413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-125153413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_723387857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723387857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void gameEvent__1311373224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1311373224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSleepingPlayerList()V", cancellable = true)
    private void updateSleepingPlayerList_445701491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(445701491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendParticles(Lnet/minecraft/server/level/ServerPlayer;ZDDDLnet/minecraft/network/protocol/Packet;)Z", cancellable = true)
    private void sendParticles__1757613720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757613720L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendParticles(Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I", cancellable = true)
    private void sendParticles__1892769906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892769906L))
            info.setReturnValue(1342726907);
    }

    @Inject(at = @At("HEAD"), method = "sendParticles(Lnet/minecraft/core/particles/ParticleOptions;ZZDDDIDDDD)I", cancellable = true)
    private void sendParticles__853433138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853433138L))
            info.setReturnValue(1074479855);
    }

    @Inject(at = @At("HEAD"), method = "sendParticles(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/core/particles/ParticleOptions;ZZDDDIDDDD)Z", cancellable = true)
    private void sendParticles__107024615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107024615L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Ljava/util/function/Predicate;Ljava/util/List;I)V", cancellable = true)
    private void getEntities__1253098544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1253098544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Ljava/util/function/Predicate;Ljava/util/List;)V", cancellable = true)
    private void getEntities_2022870357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2022870357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getEntities__1206800411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206800411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void environmentAttributes__851455185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851455185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_1206545371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206545371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameRules()Lnet/minecraft/world/level/gamerules/GameRules;", cancellable = true)
    private void getGameRules_452387529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452387529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/server/level/ServerChunkCache;", cancellable = true)
    private void getChunkSource_1052066954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052066954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/world/level/chunk/ChunkSource;", cancellable = true)
    private void getChunkSource__463477925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463477925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder_26220466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26220466L))
            info.setReturnValue(new net.minecraft.world.level.border.WorldBorder());
    }

    @Inject(at = @At("HEAD"), method = "broadcastEntityEvent(Lnet/minecraft/world/entity/Entity;B)V", cancellable = true)
    private void broadcastEntityEvent__1700887447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1700887447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;DDDLnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound__386289627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-386289627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound_1814294410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1814294410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addFreshEntity_1085753235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085753235L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWaypointManager()Lnet/minecraft/server/waypoints/ServerWaypointManager;", cancellable = true)
    private void getWaypointManager__825716669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825716669L))
            info.setReturnValue(new net.minecraft.server.waypoints.ServerWaypointManager());
    }

    @Inject(at = @At("HEAD"), method = "broadcastDamageEvent(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void broadcastDamageEvent__2096932324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2096932324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/server/ServerScoreboard;", cancellable = true)
    private void getScoreboard__809303394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809303394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard_707363484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707363484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextEntityId()I", cancellable = true)
    private void getNextEntityId__254304750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-254304750L))
            info.setReturnValue(1433401104);
    }

    @Inject(at = @At("HEAD"), method = "debugSynchronizers()Lnet/minecraft/util/debug/LevelDebugSynchronizers;", cancellable = true)
    private void debugSynchronizers_98583922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98583922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_371511151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371511151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAllowedToEnterPortal(Lnet/minecraft/world/level/Level;)Z", cancellable = true)
    private void isAllowedToEnterPortal__764096124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764096124L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resetEmptyTime()V", cancellable = true)
    private void resetEmptyTime_2032439067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032439067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDuringTeleport(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addDuringTeleport_1972256716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972256716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayInteract(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void mayInteract__833963222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833963222L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPvpAllowed()Z", cancellable = true)
    private void isPvpAllowed_424924546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424924546L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerImmediately(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void removePlayerImmediately_974017034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(974017034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSleepThroughNights()Z", cancellable = true)
    private void canSleepThroughNights__1787332815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787332815L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickRateManager()Lnet/minecraft/world/TickRateManager;", cancellable = true)
    private void tickRateManager__454093880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454093880L))
            info.setReturnValue(new net.minecraft.world.TickRateManager());
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_139475342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139475342L))
            info.setReturnValue(1739784509);
    }

    @Inject(at = @At("HEAD"), method = "addWithUUID(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addWithUUID__482950267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482950267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFlat()Z", cancellable = true)
    private void isFlat_843909767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843909767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_846122402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846122402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(I)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1734243765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734243765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explode(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/level/ExplosionDamageCalculator;DDDFZLnet/minecraft/world/level/Level$ExplosionInteraction;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/random/WeightedList;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void explode_1528999188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1528999188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNeighborsAtExceptFromFacing(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void updateNeighborsAtExceptFromFacing__1471038020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1471038020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePOIOnBlockStateChange(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void updatePOIOnBlockStateChange__770739636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-770739636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPositionTickingWithEntitiesLoaded(J)Z", cancellable = true)
    private void isPositionTickingWithEntitiesLoaded_961007682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961007682L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tryAddFreshEntityWithPassengers(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void tryAddFreshEntityWithPassengers__1596173939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596173939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughForSpawning(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void anyPlayerCloseEnoughForSpawning_1075741153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075741153L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "anyPlayerCloseEnoughForSpawning(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void anyPlayerCloseEnoughForSpawning__1906999021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906999021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "areEntitiesActuallyLoadedAndTicking(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void areEntitiesActuallyLoadedAndTicking_1422969715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1422969715L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findClosestBiome3d(Ljava/util/function/Predicate;Lnet/minecraft/core/BlockPos;III)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void findClosestBiome3d_1136356504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136356504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent__791197675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791197675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickChunk(Lnet/minecraft/world/level/chunk/LevelChunk;I)V", cancellable = true)
    private void tickChunk__1388642617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1388642617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fuelValues()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void fuelValues_24952249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(24952249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void setMapData_16637771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(16637771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getPlayers__391934992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391934992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers(Ljava/util/function/Predicate;I)Ljava/util/List;", cancellable = true)
    private void getPlayers__1117712931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117712931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDragons()Ljava/util/List;", cancellable = true)
    private void getDragons_1827042413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827042413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRaids()Lnet/minecraft/world/entity/raid/Raids;", cancellable = true)
    private void getRaids_843441413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843441413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRaided(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isRaided_601693425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601693425L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVillage(Lnet/minecraft/core/SectionPos;)Z", cancellable = true)
    private void isVillage_555111864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555111864L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVillage(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isVillage_915770848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915770848L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRaidAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/entity/raid/Raid;", cancellable = true)
    private void getRaidAt__1116207162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116207162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEvent(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;II)V", cancellable = true)
    private void blockEvent__2140923827(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2140923827L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void getMapData__952775587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-952775587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noSave()Z", cancellable = true)
    private void noSave__1749703604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749703604L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1323372569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1323372569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onStructureStartsAvailable(Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void onStructureStartsAvailable_1371081646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1371081646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeCache()Lnet/minecraft/world/level/pathfinder/PathTypeCache;", cancellable = true)
    private void getPathTypeCache_1019540499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019540499L))
            info.setReturnValue(new net.minecraft.world.level.pathfinder.PathTypeCache());
    }

    @Inject(at = @At("HEAD"), method = "waitForEntities(Lnet/minecraft/world/level/ChunkPos;I)V", cancellable = true)
    private void waitForEntities_335363624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335363624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSpawningMonsters()Z", cancellable = true)
    private void isSpawningMonsters__1116641824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116641824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clearBlockEvents(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)V", cancellable = true)
    private void clearBlockEvents__1556241448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1556241448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getForceLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongSet;", cancellable = true)
    private void getForceLoadedChunks__1501419522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501419522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onReputationEvent(Lnet/minecraft/world/entity/ai/village/ReputationEventType;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/ReputationEventHandler;)V", cancellable = true)
    private void onReputationEvent_1362936461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1362936461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAllEntities()Ljava/lang/Iterable;", cancellable = true)
    private void getAllEntities__58151609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58151609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sectionsToVillage(Lnet/minecraft/core/SectionPos;)I", cancellable = true)
    private void sectionsToVillage_925913192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925913192L))
            info.setReturnValue(-458365999);
    }

    @Inject(at = @At("HEAD"), method = "setChunkForced(IIZ)Z", cancellable = true)
    private void setChunkForced__484541640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484541640L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDragonFight()Lnet/minecraft/world/level/dimension/end/EnderDragonFight;", cancellable = true)
    private void getDragonFight_1881457946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881457946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWatchdogStats()Ljava/lang/String;", cancellable = true)
    private void getWatchdogStats__391391208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391391208L))
            info.setReturnValue("fCv%&m*Q\u7C94k!F<Hm%?telP]/FH8>`kIS+|eonc\u2215MEp35V$U,%V>8B\u352B!48E,MaC\u857Cam9S");
    }

    @Inject(at = @At("HEAD"), method = "getFreeMapId()Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void getFreeMapId_224569629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224569629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCloseToVillage(Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void isCloseToVillage__316897204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316897204L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveDebugReport(Ljava/nio/file/Path;)V", cancellable = true)
    private void saveDebugReport_1972514395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972514395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addLegacyChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addLegacyChunkEntities__1051147182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1051147182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addWorldGenChunkEntities(Ljava/util/stream/Stream;)V", cancellable = true)
    private void addWorldGenChunkEntities_1878128349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1878128349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startTickingChunk(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void startTickingChunk_409809860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(409809860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areEntitiesLoaded(J)Z", cancellable = true)
    private void areEntitiesLoaded__1212509314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1212509314L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPositionEntityTicking(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isPositionEntityTicking_1961004173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1961004173L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSpawnerBlockEnabled()Z", cancellable = true)
    private void isSpawnerBlockEnabled_1003325880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003325880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnEntitiesInChunk(Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void canSpawnEntitiesInChunk__275992166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-275992166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCommandBlockEnabled()Z", cancellable = true)
    private void isCommandBlockEnabled__1181132235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1181132235L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDragonFight(Lnet/minecraft/world/level/dimension/end/EnderDragonFight;)V", cancellable = true)
    private void setDragonFight_398704108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(398704108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetWeatherCycle()V", cancellable = true)
    private void resetWeatherCycle__1900267067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1900267067L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickPrecipitation(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void tickPrecipitation__155376992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-155376992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickThunder(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void tickThunder__1545993561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1545993561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEnvironmentAttributes(Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void setEnvironmentAttributes_809949018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809949018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoiManager()Lnet/minecraft/world/entity/ai/village/poi/PoiManager;", cancellable = true)
    private void getPoiManager__968792797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968792797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickCustomSpawners(Z)V", cancellable = true)
    private void tickCustomSpawners_517219401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(517219401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentDifficultyAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;", cancellable = true)
    private void getCurrentDifficultyAt_1621361563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621361563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHandlingTick()Z", cancellable = true)
    private void isHandlingTick_1415760254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415760254L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "updateNeighboursOnBlockSet(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void updateNeighboursOnBlockSet_1533445244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533445244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addNewPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addNewPlayer_1698029238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1698029238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityOrPart(I)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntityOrPart_1549229601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549229601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomPlayer()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getRandomPlayer_782339446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782339446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRespawnedPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addRespawnedPlayer__2036130787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2036130787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPortalForcer()Lnet/minecraft/world/level/portal/PortalForcer;", cancellable = true)
    private void getPortalForcer_605777556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605777556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findNearestMapStructure(Lnet/minecraft/tags/TagKey;Lnet/minecraft/core/BlockPos;IZ)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void findNearestMapStructure__1203610611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203610611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMoonBrightness(Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getMoonBrightness_630724690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630724690L))
            info.setReturnValue(1.114037E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLogicalHeight()I", cancellable = true)
    private void getLogicalHeight__475491841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475491841L))
            info.setReturnValue(132403936);
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tickNonPassenger_837818825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(837818825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpreadFireAround(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void canSpreadFireAround_835450404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835450404L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void neighborChanged_1274657393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1274657393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void neighborChanged_818681366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(818681366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getFluidTicks__147925190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147925190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTicks;", cancellable = true)
    private void getFluidTicks_1393962311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393962311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUncachedNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getUncachedNoiseBiome_1387076607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387076607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getBlockTicks__1462069635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462069635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTicks;", cancellable = true)
    private void getBlockTicks__1995788252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995788252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityInAnyDimension(Ljava/util/UUID;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntityInAnyDimension__451064267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451064267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBlockEntityAdded(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void onBlockEntityAdded__47826172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-47826172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dragonParts()Ljava/util/Collection;", cancellable = true)
    private void dragonParts__352234128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352234128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendBlockUpdated(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;I)V", cancellable = true)
    private void sendBlockUpdated__2131106857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131106857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNeighborsAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void updateNeighborsAt__198751377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-198751377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNeighborsAt(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void updateNeighborsAt_163950157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163950157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldTickBlocksAt(J)Z", cancellable = true)
    private void shouldTickBlocksAt_718640141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718640141L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "gatherChunkSourceStats()Ljava/lang/String;", cancellable = true)
    private void gatherChunkSourceStats__1587085970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587085970L))
            info.setReturnValue("=}jhzPvjRX\"XD*a6Y35KtcK7\uB056q ty#lYrdS-<@ne\u9A9FJY@,.&\u08FDd01<6CY\u27B0\u5E8CiZB(V5z\u6FFB/&dkmt'(\u2BDERH(\u087As`U1\u0D6A]");
    }

    @Inject(at = @At("HEAD"), method = "setRespawnData(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setRespawnData_1189499553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1189499553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInAnyDimension(Ljava/util/UUID;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getPlayerInAnyDimension_1765568623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765568623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeAccess()Lnet/minecraft/world/item/crafting/RecipeAccess;", cancellable = true)
    private void recipeAccess__932471521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932471521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipeAccess()Lnet/minecraft/world/item/crafting/RecipeManager;", cancellable = true)
    private void recipeAccess_931284008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931284008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlockProgress(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void destroyBlockProgress_1106171204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1106171204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "potionBrewing()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void potionBrewing__379371046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379371046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalLevelEvent(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void globalLevelEvent_1783484989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1783484989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/world/clock/ServerClockManager;", cancellable = true)
    private void clockManager_1457176652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457176652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/world/clock/ClockManager;", cancellable = true)
    private void clockManager__1402550449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402550449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillReportDetails(Lnet/minecraft/CrashReport;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void fillReportDetails_77972429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(77972429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeatherData()Lnet/minecraft/world/level/saveddata/WeatherData;", cancellable = true)
    private void getWeatherData_1487554731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487554731L))
            info.setReturnValue(new net.minecraft.world.level.saveddata.WeatherData());
    }

    @Inject(at = @At("HEAD"), method = "getDataStorage()Lnet/minecraft/world/level/storage/SavedDataStorage;", cancellable = true)
    private void getDataStorage_1791906146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791906146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureManager()Lnet/minecraft/world/level/StructureManager;", cancellable = true)
    private void structureManager_2022948645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022948645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void getStructureManager__1553120882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553120882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players_2001392021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001392021L))
            info.setReturnValue(null);
    }


}
