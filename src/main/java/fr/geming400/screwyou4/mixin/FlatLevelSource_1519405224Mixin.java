package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.FlatLevelSource.class)
public class FlatLevelSource_1519405224Mixin {
        @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings__207179717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207179717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1557667469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557667469L))
            info.setReturnValue(45335071);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__1043839702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043839702L))
            info.setReturnValue(-1718398921);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_1557667469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557667469L))
            info.setReturnValue(45335071);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_1863058016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863058016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_1557667469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557667469L))
            info.setReturnValue(45335071);
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise__1336973679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336973679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface_1770093147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1770093147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers_426190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(426190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo_650373909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(650373909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_2022913340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2022913340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createState(Lnet/minecraft/core/HolderLookup;Lnet/minecraft/world/level/levelgen/RandomState;J)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private void createState_2095320726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095320726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnHeight(Lnet/minecraft/world/level/LevelHeightAccessor;)I", cancellable = true)
    private void getSpawnHeight_1843882894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843882894L))
            info.setReturnValue(851595297);
    }


}
