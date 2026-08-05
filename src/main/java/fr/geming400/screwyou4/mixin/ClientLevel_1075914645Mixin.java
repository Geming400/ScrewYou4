package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientLevel.class)
public class ClientLevel_1075914645Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__59545827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59545827L))
            info.setReturnValue("ﯲ;\"{8-攦;uK");
    }

    @Inject(at = @At("HEAD"), method = "update()V", cancellable = true)
    private void update_1114189383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114189383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unload(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void unload__287151825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-287151825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect__825264293(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-825264293L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void tick_1122706777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122706777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(I)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_854673747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854673747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z", cancellable = true)
    private void setBlock__460596306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460596306L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent_1994373932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1994373932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "explode(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;Lnet/minecraft/world/level/ExplosionDamageCalculator;DDDFZLnet/minecraft/world/level/Level$ExplosionInteraction;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/core/particles/ParticleOptions;Lnet/minecraft/util/random/WeightedList;Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void explode__416397868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-416397868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures_1740735142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740735142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPushableEntities(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;", cancellable = true)
    private void getPushableEntities_672529650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672529650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getFluidTicks__1596118179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596118179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getBlockTicks__1596118179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596118179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUncachedNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getUncachedNoiseBiome__1817024599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817024599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_1114176890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114176890L))
            info.setReturnValue(-1469288254);
    }

    @Inject(at = @At("HEAD"), method = "addDestroyBlockEffect(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void addDestroyBlockEffect__1442794934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1442794934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playPlayerSound(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playPlayerSound_1978075800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1978075800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickRateManager()Lnet/minecraft/world/TickRateManager;", cancellable = true)
    private void tickRateManager_1620468601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620468601L))
            info.setReturnValue(new net.minecraft.world.TickRateManager());
    }

    @Inject(at = @At("HEAD"), method = "addAlwaysVisibleParticle(Lnet/minecraft/core/particles/ParticleOptions;ZDDDDDD)V", cancellable = true)
    private void addAlwaysVisibleParticle__203486564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-203486564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAlwaysVisibleParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addAlwaysVisibleParticle__323234788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-323234788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gatherChunkSourceStats()Ljava/lang/String;", cancellable = true)
    private void gatherChunkSourceStats__59545827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-59545827L))
            info.setReturnValue("ﯲ;\"{8-攦;uK");
    }

    @Inject(at = @At("HEAD"), method = "setBlocksDirty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlocksDirty__246937927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-246937927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendBlockUpdated(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;I)V", cancellable = true)
    private void sendBlockUpdated__1250409330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1250409330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dragonParts()Ljava/util/List;", cancellable = true)
    private void dragonParts__1592715836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592715836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonParts()Ljava/util/Collection;", cancellable = true)
    private void dragonParts__737604668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737604668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/client/multiplayer/ClientLevel$ClientLevelData;", cancellable = true)
    private void getLevelData_1303481135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303481135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/world/level/storage/LevelData;", cancellable = true)
    private void getLevelData__364010822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364010822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalLevelEvent(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void globalLevelEvent__445961691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445961691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onBlockEntityAdded(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void onBlockEntityAdded_792217876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792217876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroyBlockProgress(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void destroyBlockProgress__445961691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445961691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFireworks(DDDDDDLjava/util/List;)V", cancellable = true)
    private void createFireworks_1656714360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1656714360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSkyFlashTime(I)V", cancellable = true)
    private void setSkyFlashTime__2005135680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2005135680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPacketToServer(Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void sendPacketToServer_1231578996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1231578996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipeAccess()Lnet/minecraft/world/item/crafting/RecipeAccess;", cancellable = true)
    private void recipeAccess_757698222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757698222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/client/ClientClockManager;", cancellable = true)
    private void clockManager_1481924158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481924158L))
            info.setReturnValue(new net.minecraft.client.ClientClockManager());
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/world/clock/ClockManager;", cancellable = true)
    private void clockManager__662265103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662265103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRespawnData(Lnet/minecraft/world/level/storage/LevelData$RespawnData;)V", cancellable = true)
    private void setRespawnData_1637673042(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1637673042L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "potionBrewing()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void potionBrewing_468953262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468953262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClientLeafTintColor(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getClientLeafTintColor_1244668750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244668750L))
            info.setReturnValue(-923270567);
    }

    @Inject(at = @At("HEAD"), method = "getPrecipitationAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/biome/Biome$Precipitation;", cancellable = true)
    private void getPrecipitationAt__1959778216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959778216L))
            info.setReturnValue(net.minecraft.world.level.biome.Biome.Precipitation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "fillReportDetails(Lnet/minecraft/CrashReport;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void fillReportDetails_1014585795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014585795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void tickNonPassenger_624189984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624189984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V", cancellable = true)
    private void playLocalSound_434921876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(434921876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playLocalSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playLocalSound_1533910623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533910623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addParticle__323234788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-323234788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;ZZDDDDDD)V", cancellable = true)
    private void addParticle__786258916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-786258916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateTick(III)V", cancellable = true)
    private void animateTick_295822240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(295822240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void environmentAttributes_771651014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771651014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes__1465315726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1465315726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder_886414699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886414699L))
            info.setReturnValue(new net.minecraft.world.level.border.WorldBorder());
    }

    @Inject(at = @At("HEAD"), method = "getRespawnData()Lnet/minecraft/world/level/storage/LevelData$RespawnData;", cancellable = true)
    private void getRespawnData_484954764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484954764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard_94669191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94669191L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/world/level/chunk/ChunkSource;", cancellable = true)
    private void getChunkSource_1739731374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739731374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/client/multiplayer/ClientChunkCache;", cancellable = true)
    private void getChunkSource_325442675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325442675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;DDDLnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound__618684879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-618684879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSeededSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/Holder;Lnet/minecraft/sounds/SoundSource;FFJ)V", cancellable = true)
    private void playSeededSound_561148310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561148310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldTickDeath(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void shouldTickDeath_624193828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624193828L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players__1592715836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592715836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void gameEvent__200685199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200685199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk_80039019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80039019L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private void getMapData_1795799598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795799598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fuelValues()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void fuelValues__236951534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236951534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void addEntity_624189984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(624189984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBreakingBlockEffect(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)V", cancellable = true)
    private void addBreakingBlockEffect_1688120103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1688120103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickEntities()V", cancellable = true)
    private void tickEntities_1114189383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114189383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntityCount()I", cancellable = true)
    private void getEntityCount_1114176890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114176890L))
            info.setReturnValue(-1462278754);
    }

    @Inject(at = @At("HEAD"), method = "getServerSimulationDistance()I", cancellable = true)
    private void getServerSimulationDistance_1114176890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114176890L))
            info.setReturnValue(-1462278754);
    }

    @Inject(at = @At("HEAD"), method = "setServerVerifiedBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)V", cancellable = true)
    private void setServerVerifiedBlockState_332729117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(332729117L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirtyWithNeighbors(III)V", cancellable = true)
    private void setSectionDirtyWithNeighbors_295822240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(295822240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGloballyRenderedBlockEntities()Ljava/util/Set;", cancellable = true)
    private void getGloballyRenderedBlockEntities__753120842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753120842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setServerSimulationDistance(I)V", cancellable = true)
    private void setServerSimulationDistance__2005135680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2005135680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerForCleaning(Lnet/minecraft/client/multiplayer/CacheSlot;)V", cancellable = true)
    private void registerForCleaning_1696265083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1696265083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkLoaded(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void onChunkLoaded__1704170445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1704170445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "syncBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void syncBlockState_890574832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(890574832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "endFlashState()Lnet/minecraft/client/renderer/EndFlashState;", cancellable = true)
    private void endFlashState_793551096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793551096L))
            info.setReturnValue(new net.minecraft.client.renderer.EndFlashState());
    }

    @Inject(at = @At("HEAD"), method = "handleBlockChangedAck(I)V", cancellable = true)
    private void handleBlockChangedAck__2005135680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2005135680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destructionProgress()Lit/unimi/dsi/fastutil/longs/Long2ObjectMap;", cancellable = true)
    private void destructionProgress__1336888082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336888082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void getBlockTint_1009751600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009751600L))
            info.setReturnValue(1090683950);
    }

    @Inject(at = @At("HEAD"), method = "setSectionRangeDirty(IIIIII)V", cancellable = true)
    private void setSectionRangeDirty__1445362777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1445362777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "calculateBlockTint(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/ColorResolver;)I", cancellable = true)
    private void calculateBlockTint_1009751600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009751600L))
            info.setReturnValue(1090683950);
    }

    @Inject(at = @At("HEAD"), method = "removeEntity(ILnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void removeEntity_1591323707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1591323707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pollLightUpdates()V", cancellable = true)
    private void pollLightUpdates_1114189383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114189383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cardinalLighting()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void cardinalLighting__1362873222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362873222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doAnimateTick(IIIILnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/BlockPos$MutableBlockPos;)V", cancellable = true)
    private void doAnimateTick_639829962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(639829962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTickingEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void isTickingEntity_624193828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624193828L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearTintCaches()V", cancellable = true)
    private void clearTintCaches_1114189383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114189383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entitiesForRendering()Ljava/lang/Iterable;", cancellable = true)
    private void entitiesForRendering__933835044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933835044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "queueLightUpdate(Ljava/lang/Runnable;)V", cancellable = true)
    private void queueLightUpdate__1762310971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762310971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickWeatherEffects()V", cancellable = true)
    private void tickWeatherEffects_1114189383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114189383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideMapData(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void overrideMapData_387943368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(387943368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTimeFromServer(J)V", cancellable = true)
    private void setTimeFromServer__2004212159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2004212159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackExplosionEffects(Lnet/minecraft/world/phys/Vec3;FILnet/minecraft/util/random/WeightedList;)V", cancellable = true)
    private void trackExplosionEffects__1356963587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1356963587L))
            info.cancel();
    }


}
