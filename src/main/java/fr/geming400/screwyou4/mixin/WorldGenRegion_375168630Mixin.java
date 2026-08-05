package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.WorldGenRegion.class)
public class WorldGenRegion_375168630Mixin {
        @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom__1674456254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674456254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_413431836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413431836L))
            info.setReturnValue(1092045325569770759L);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_1042706629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042706629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getEntities_1766438884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766438884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getEntities__1585984125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585984125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_119280697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119280697L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWithinWriteZone(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isWithinWriteZone_543939072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543939072L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_384645372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384645372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_773794575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(773794575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addFreshEntity__76552187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76552187L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z", cancellable = true)
    private void setBlock__1161342321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161342321L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent_1293627917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293627917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playSound_92419518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(92419518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures_1039989127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039989127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1281503934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281503934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getFluidTicks_1998103102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998103102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomeManager()Lnet/minecraft/world/level/biome/BiomeManager;", cancellable = true)
    private void getBiomeManager__2079952533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079952533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getBlockTicks_1998103102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998103102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUncachedNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getUncachedNoiseBiome_1777196682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777196682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkyDarken()I", cancellable = true)
    private void getSkyDarken_413430875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413430875L))
            info.setReturnValue(-730863990);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_413430875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413430875L))
            info.setReturnValue(-730863990);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/world/level/storage/LevelData;", cancellable = true)
    private void getLevelData__1064885797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064885797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextSubTickCount()J", cancellable = true)
    private void nextSubTickCount_413431836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413431836L))
            info.setReturnValue(1092045325569770759L);
    }

    @Inject(at = @At("HEAD"), method = "isStateAtPosition(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void isStateAtPosition__2117306737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117306737L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isFluidAtPosition(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void isFluidAtPosition__2117306737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117306737L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNearestPlayer(DDDDLjava/util/function/Predicate;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getNearestPlayer_2069275136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2069275136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentDifficultyAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;", cancellable = true)
    private void getCurrentDifficultyAt_16499310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16499310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCurrentlyGenerating(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setCurrentlyGenerating__867247428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-867247428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureCanWrite(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void ensureCanWrite_543939072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543939072L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeBlock(Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void removeBlock_1355069666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355069666L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addParticle__1023980803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1023980803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dimensionType()Lnet/minecraft/world/level/dimension/DimensionType;", cancellable = true)
    private void dimensionType__480698018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480698018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClientSide()Z", cancellable = true)
    private void isClientSide_413447212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413447212L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_2128776595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128776595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;ZLnet/minecraft/world/entity/Entity;I)Z", cancellable = true)
    private void destroyBlock_370228642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370228642L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_372829421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372829421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_1821345402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821345402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder_185668684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185668684L))
            info.setReturnValue(new net.minecraft.world.level.border.WorldBorder());
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/world/level/chunk/ChunkSource;", cancellable = true)
    private void getChunkSource_1038856399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038856399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players_2001505445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001505445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight_1170755655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170755655L))
            info.setReturnValue(-2088891005);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_413430875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413430875L))
            info.setReturnValue(-730863990);
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer__711916949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711916949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void gameEvent__901431214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-901431214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getCenter__513930208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-513930208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_413430875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413430875L))
            info.setReturnValue(-730863990);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(II)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk__1930407418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930407418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk__1347534527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347534527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk__620706996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620706996L))
            info.setReturnValue(true);
    }


}
