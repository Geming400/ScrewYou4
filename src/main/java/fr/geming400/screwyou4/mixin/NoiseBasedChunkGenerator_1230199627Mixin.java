package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator.class)
public class NoiseBasedChunkGenerator_1230199627Mixin {
        @Inject(at = @At("HEAD"), method = "stable(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void stable__1404610816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404610816L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1515459219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515459219L))
            info.setReturnValue(-1595875764);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_525182501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525182501L))
            info.setReturnValue(-409660143);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__507646565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507646565L))
            info.setReturnValue(-693030319);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolatedNoiseValue(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void getInterpolatedNoiseValue__855372410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855372410L))
            info.setReturnValue(5.597474006182253E8D);
    }

    @Inject(at = @At("HEAD"), method = "generatorSettings()Lnet/minecraft/core/Holder;", cancellable = true)
    private void generatorSettings_595499120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595499120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBiomes(Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void createBiomes_1529675603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529675603L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo_1904938436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1904938436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers__63654617(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-63654617L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise_199448641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199448641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface__1723036801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1723036801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/WorldGenerationContext;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/levelgen/blending/Blender;Ljava/util/Set;)V", cancellable = true)
    private void buildSurface_1573805090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1573805090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_1134066654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1134066654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth__2116162553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116162553L))
            info.setReturnValue(-1932710340);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_657805056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657805056L))
            info.setReturnValue(null);
    }


}
