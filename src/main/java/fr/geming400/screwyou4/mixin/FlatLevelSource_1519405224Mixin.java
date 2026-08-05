package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.FlatLevelSource.class)
public class FlatLevelSource_1519405224Mixin {
        @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_814388098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814388098L))
            info.setReturnValue(1885905380);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1804664816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804664816L))
            info.setReturnValue(-1149788271);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_947010653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947010653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface__1433831204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1433831204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createState(Lnet/minecraft/core/HolderLookup;Lnet/minecraft/world/level/levelgen/RandomState;J)Lnet/minecraft/world/level/chunk/ChunkGeneratorStructureState;", cancellable = true)
    private void createState__2128731381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128731381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo__2100823263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2100823263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise_488654238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488654238L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers_225550980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(225550980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_1423272251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423272251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpawnHeight(Lnet/minecraft/world/level/LevelHeightAccessor;)I", cancellable = true)
    private void getSpawnHeight__1159492390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159492390L))
            info.setReturnValue(-785193456);
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings__1955724962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955724962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth__1826956956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826956956L))
            info.setReturnValue(-1345079374);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__218440968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218440968L))
            info.setReturnValue(141504045);
    }


}
