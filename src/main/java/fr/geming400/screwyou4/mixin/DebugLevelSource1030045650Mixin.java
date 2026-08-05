package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DebugLevelSource.class)
public class DebugLevelSource1030045650Mixin {
        @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1068307896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068307896L))
            info.setReturnValue(-228688482);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__1533199275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533199275L))
            info.setReturnValue(-251265724);
    }

    @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_1068307896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068307896L))
            info.setReturnValue(-228688482);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_1373698443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1373698443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_1068307896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068307896L))
            info.setReturnValue(-228688482);
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise__1826333252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826333252L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface_1280733574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1280733574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers__488933383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-488933383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo_161014336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(161014336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_1533553767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533553767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyBiomeDecoration(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/StructureManager;)V", cancellable = true)
    private void applyBiomeDecoration__1419020107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1419020107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateFor(II)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getBlockStateFor_195253656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(195253656L))
            info.setReturnValue(null);
    }


}
