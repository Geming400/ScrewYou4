package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientLevel.class)
public class ClientLevel_1075914645Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1846337673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846337673L))
            info.setReturnValue("@X&\u05B74jjj=1.t\u792B70|pK}Lb;3'?yM^4Q<N);x0q");
    }

    @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_449448734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(449448734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unload(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void unload_2112275472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112275472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect__77900481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-77900481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void tick_106268764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(106268764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gameEvent(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void gameEvent__1079951047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079951047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void environmentAttributes__620033008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620033008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_1437967548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437967548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/client/multiplayer/ClientChunkCache;", cancellable = true)
    private void getChunkSource__1380178815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380178815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/world/level/chunk/ChunkSource;", cancellable = true)
    private void getChunkSource__232055748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232055748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder_257642643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257642643L))
            info.setReturnValue(new net.minecraft.world.level.border.WorldBorder());
    }

    @Inject(at = @At("HEAD"), method = "shouldTickDeath(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldTickDeath_970115976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970115976L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;DDDLnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound__154867450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-154867450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound_2045716587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2045716587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addParticle__917740619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-917740619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;ZZDDDDDD)V", cancellable = true)
    private void addParticle__875712139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-875712139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V", cancellable = true)
    private void playLocalSound_386685516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(386685516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playLocalSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playLocalSound_452759207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(452759207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPushableEntities(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;", cancellable = true)
    private void getPushableEntities_1932243325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932243325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard_938656701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938656701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_602933328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602933328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/world/level/storage/LevelData;", cancellable = true)
    private void getLevelData_2066741026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066741026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/client/multiplayer/ClientLevel$ClientLevelData;", cancellable = true)
    private void getLevelData_377852871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377852871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickRateManager()Lnet/minecraft/world/TickRateManager;", cancellable = true)
    private void tickRateManager__222671703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222671703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_370897519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370897519L))
            info.setReturnValue(1097732515);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z", cancellable = true)
    private void setBlock_1754771129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754771129L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntity(I)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1502821588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502821588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explode(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/level/ExplosionDamageCalculator;DDDFZLnet/minecraft/world/level/Level$ExplosionInteraction;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/random/WeightedList;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void explode_1760421365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1760421365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent__559775498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-559775498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fuelValues()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void fuelValues_256374426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256374426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_168376836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(168376836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk__2041916136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2041916136L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void getMapData__721353410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721353410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1091950392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091950392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tickNonPassenger_1069241002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1069241002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateTick(III)V", cancellable = true)
    private void animateTick_504661438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(504661438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getFluidTicks_83368027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83368027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUncachedNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getUncachedNoiseBiome_1618498784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618498784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getBlockTicks__1230776418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230776418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBlockEntityAdded(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void onBlockEntityAdded_183596005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183596005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dragonParts()Ljava/util/List;", cancellable = true)
    private void dragonParts__1126199855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126199855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonParts()Ljava/util/Collection;", cancellable = true)
    private void dragonParts__120682991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-120682991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendBlockUpdated(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;I)V", cancellable = true)
    private void sendBlockUpdated__1899684680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899684680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playPlayerSound(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playPlayerSound__1745114894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1745114894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAlwaysVisibleParticle(Lnet/minecraft/core/particles/ParticleOptions;ZDDDDDD)V", cancellable = true)
    private void addAlwaysVisibleParticle_866772356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(866772356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAlwaysVisibleParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addAlwaysVisibleParticle__1674183628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1674183628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherChunkSourceStats()Ljava/lang/String;", cancellable = true)
    private void gatherChunkSourceStats__1355663793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355663793L))
            info.setReturnValue("\uD764\u1148F\uD3B9_8[[|V|znqe50J5v`y");
    }

    @Inject(at = @At("HEAD"), method = "setRespawnData(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setRespawnData_1420921730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1420921730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlocksDirty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlocksDirty_1784300387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1784300387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDestroyBlockEffect(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void addDestroyBlockEffect_1225009263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1225009263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPacketToServer(Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendPacketToServer_1230918242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230918242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipeAccess()Lnet/minecraft/world/item/crafting/RecipeAccess;", cancellable = true)
    private void recipeAccess__701178304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701178304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFireworks(DDDDDDLjava/util/List;)V", cancellable = true)
    private void createFireworks_906468616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(906468616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroyBlockProgress(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void destroyBlockProgress_1337593381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1337593381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "potionBrewing()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void potionBrewing__147948869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147948869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalLevelEvent(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void globalLevelEvent_2014907166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2014907166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/world/clock/ClockManager;", cancellable = true)
    private void clockManager__1171128272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171128272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/client/ClientClockManager;", cancellable = true)
    private void clockManager__1407932193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407932193L))
            info.setReturnValue(new net.minecraft.client.ClientClockManager());
    }

    @Inject(at = @At("HEAD"), method = "getPrecipitationAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private void getPrecipitationAt__1918705352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918705352L))
            info.setReturnValue(net.minecraft.world.level.biome.Biome.Precipitation.SNOW);
    }

    @Inject(at = @At("HEAD"), method = "getClientLeafTintColor(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getClientLeafTintColor_53129015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53129015L))
            info.setReturnValue(1320296884);
    }

    @Inject(at = @At("HEAD"), method = "fillReportDetails(Lnet/minecraft/CrashReport;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void fillReportDetails_309394606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309394606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSkyFlashTime(I)V", cancellable = true)
    private void setSkyFlashTime_340380798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340380798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityCount()I", cancellable = true)
    private void getEntityCount__1047009916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047009916L))
            info.setReturnValue(-1376207340);
    }

    @Inject(at = @At("HEAD"), method = "tickEntities()V", cancellable = true)
    private void tickEntities_714718345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(714718345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBreakingBlockEffect(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void addBreakingBlockEffect_2092033729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2092033729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServerSimulationDistance()I", cancellable = true)
    private void getServerSimulationDistance__1787427483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787427483L))
            info.setReturnValue(-2111193937);
    }

    @Inject(at = @At("HEAD"), method = "getGloballyRenderedBlockEntities()Ljava/util/Set;", cancellable = true)
    private void getGloballyRenderedBlockEntities_1329699939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329699939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setServerVerifiedBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)V", cancellable = true)
    private void setServerVerifiedBlockState_32824236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(32824236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirtyWithNeighbors(III)V", cancellable = true)
    private void setSectionDirtyWithNeighbors_143277068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143277068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setServerSimulationDistance(I)V", cancellable = true)
    private void setServerSimulationDistance_2100089921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2100089921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerForCleaning(Lnet/minecraft/client/multiplayer/CacheSlot;)V", cancellable = true)
    private void registerForCleaning__191420644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-191420644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkLoaded(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void onChunkLoaded__808064992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-808064992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueLightUpdate(Ljava/lang/Runnable;)V", cancellable = true)
    private void queueLightUpdate_1969064151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1969064151L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "syncBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void syncBlockState_2066334865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2066334865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destructionProgress()Lit/unimi/dsi/fastutil/longs/Long2ObjectMap;", cancellable = true)
    private void destructionProgress_464380909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464380909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "endFlashState()Lnet/minecraft/client/renderer/EndFlashState;", cancellable = true)
    private void endFlashState__2080434500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080434500L))
            info.setReturnValue(new net.minecraft.client.renderer.EndFlashState());
    }

    @Inject(at = @At("HEAD"), method = "handleBlockChangedAck(I)V", cancellable = true)
    private void handleBlockChangedAck__829825638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-829825638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pollLightUpdates()V", cancellable = true)
    private void pollLightUpdates_1538462196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1538462196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTimeFromServer(J)V", cancellable = true)
    private void setTimeFromServer__1677845379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1677845379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entitiesForRendering()Ljava/lang/Iterable;", cancellable = true)
    private void entitiesForRendering_1206612224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206612224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickWeatherEffects()V", cancellable = true)
    private void tickWeatherEffects__313027652(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-313027652L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTickingEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isTickingEntity__1670498430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670498430L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSectionRangeDirty(IIIIII)V", cancellable = true)
    private void setSectionRangeDirty__719464561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-719464561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearTintCaches()V", cancellable = true)
    private void clearTintCaches__130729042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-130729042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__378058042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378058042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackExplosionEffects(Lnet/minecraft/world/phys/Vec3;FILnet/minecraft/util/random/WeightedList;)V", cancellable = true)
    private void trackExplosionEffects_235004565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(235004565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void overrideMapData_2048752002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2048752002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doAnimateTick(IIIILnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos$MutableBlockPos;)V", cancellable = true)
    private void doAnimateTick__1504844003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1504844003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "calculateBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void calculateBlockTint__444372850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444372850L))
            info.setReturnValue(1408844935);
    }

    @Inject(at = @At("HEAD"), method = "removeEntity(ILnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void removeEntity__1747359020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1747359020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_1965235326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965235326L))
            info.setReturnValue(-308990430);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players__2062153098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062153098L))
            info.setReturnValue(null);
    }


}
