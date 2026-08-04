package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator.class)
public class NoiseBasedChunkGenerator_1230199627Mixin {
        @Inject(at = @At("HEAD"), method = "stable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void stable_1417872773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417872773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generatorSettings()Lnet/minecraft/core/Holder;", cancellable = true)
    private void generatorSettings__1515891898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515891898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__1333045299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333045299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedNoiseValue(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void getInterpolatedNoiseValue_825024726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825024726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBiomes(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void createBiomes_875279908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875279908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers__288779407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-288779407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_1268461872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268461872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_1733707743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1733707743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/levelgen/blending/Blender;Ljava/util/Set;)V", cancellable = true)
    private void buildSurface_1936787937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1936787937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface_1480887550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480887550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise__1626179276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626179276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_1573852419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573852419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo_361168312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361168312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1268461872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268461872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_1268461872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268461872L))
            info.setReturnValue(null);
    }


}
