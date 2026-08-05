package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.WorldGenRegion.class)
public class WorldGenRegion_375168630Mixin {
        @Inject(at = @At("HEAD"), method = "getRandom()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void getRandom__666674391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666674391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()J", cancellable = true)
    private void getSeed_941652373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941652373L))
            info.setReturnValue(-6407595910071149293L);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void getLevel_254064019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254064019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess__679724581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679724581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1792696407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792696407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1910940563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910940563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__793402025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793402025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkSource()Lnet/minecraft/world/level/chunk/ChunkSource;", cancellable = true)
    private void getChunkSource__932930723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932930723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine_1063264060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1063264060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel__329848496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329848496L))
            info.setReturnValue(1511569629);
    }

    @Inject(at = @At("HEAD"), method = "getSkyDarken()I", cancellable = true)
    private void getSkyDarken__95571407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95571407L))
            info.setReturnValue(908598019);
    }

    @Inject(at = @At("HEAD"), method = "getLevelData()Lnet/minecraft/world/level/storage/LevelData;", cancellable = true)
    private void getLevelData_1365866051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365866051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder__443103372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443103372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUncachedNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getUncachedNoiseBiome_917752769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917752769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomeManager()Lnet/minecraft/world/level/biome/BiomeManager;", cancellable = true)
    private void getBiomeManager_1897304078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897304078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStateAtPosition(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void isStateAtPosition__1326885390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326885390L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "nextSubTickCount()J", cancellable = true)
    private void nextSubTickCount_1567046039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567046039L))
            info.setReturnValue(-1758668575110412092L);
    }

    @Inject(at = @At("HEAD"), method = "isFluidAtPosition(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void isFluidAtPosition__1858072597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858072597L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getBlockTicks__1931522433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931522433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearestPlayer(DDDDLjava/util/function/Predicate;)Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getNearestPlayer__607150807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607150807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidTicks()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private void getFluidTicks__617377988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617377988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentDifficultyAt(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;", cancellable = true)
    private void getCurrentDifficultyAt_1152037725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1152037725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCurrentlyGenerating(Ljava/util/function/Supplier;)V", cancellable = true)
    private void setCurrentlyGenerating__372086830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-372086830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureCanWrite(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void ensureCanWrite_1095152397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095152397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)Z", cancellable = true)
    private void setBlock_1054025114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1054025114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(Lnet/minecraft/world/entity/Entity;ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent__1260521513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1260521513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V", cancellable = true)
    private void playSound_897541689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(897541689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlock(Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void removeBlock__661419559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661419559L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V", cancellable = true)
    private void addParticle__1618486634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1618486634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "environmentAttributes()Lnet/minecraft/world/attribute/EnvironmentAttributeReader;", cancellable = true)
    private void environmentAttributes_737092573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737092573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensionType()Lnet/minecraft/world/level/dimension/DimensionType;", cancellable = true)
    private void dimensionType__104703074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104703074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClientSide()Z", cancellable = true)
    private void isClientSide__586594528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586594528L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;ZLnet/minecraft/world/entity/Entity;I)Z", cancellable = true)
    private void destroyBlock_2111935887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111935887L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/List;", cancellable = true)
    private void players_1532068183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532068183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameEvent(Lnet/minecraft/core/Holder;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/gameevent/GameEvent$Context;)V", cancellable = true)
    private void gameEvent__1780697062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1780697062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServer()Lnet/minecraft/server/MinecraftServer;", cancellable = true)
    private void getServer_376798564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376798564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/levelgen/Heightmap$Types;II)I", cancellable = true)
    private void getHeight__981064182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981064182L))
            info.setReturnValue(2004175356);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1350448546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350448546L))
            info.setReturnValue(1133665773);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void getCenter_1933153387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933153387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_660428222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660428222L))
            info.setReturnValue(1473428597);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(II)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk__914365457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914365457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk_71143160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71143160L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChunk(II)Z", cancellable = true)
    private void hasChunk_1552305145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552305145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1915051221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915051221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFreshEntity(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void addFreshEntity_616429397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616429397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOldChunkAround(Lnet/minecraft/world/level/ChunkPos;I)Z", cancellable = true)
    private void isOldChunkAround_882121142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882121142L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWithinWriteZone(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isWithinWriteZone__1653564938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1653564938L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getEntities_1641195419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1641195419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntities(Lnet/minecraft/world/level/entity/EntityTypeTest;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;", cancellable = true)
    private void getEntities_537620730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537620730L))
            info.setReturnValue(null);
    }


}
