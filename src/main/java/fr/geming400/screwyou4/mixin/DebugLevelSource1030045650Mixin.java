package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DebugLevelSource.class)
public class DebugLevelSource1030045650Mixin {
        @Inject(at = @At("HEAD"), method = "getSeaLevel()I", cancellable = true)
    private void getSeaLevel_325028525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325028525L))
            info.setReturnValue(-908935167);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1315305243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315305243L))
            info.setReturnValue(-1407429956);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColumn(IILnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)Lnet/minecraft/world/level/NoiseColumn;", cancellable = true)
    private void getBaseColumn_457651080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457651080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildSurface(Lnet/minecraft/server/level/WorldGenRegion;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void buildSurface__1923190777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1923190777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addDebugScreenInfo(Ljava/util/List;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void addDebugScreenInfo_1704784460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1704784460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillFromNoise(Lnet/minecraft/world/level/levelgen/blending/Blender;Lnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void fillFromNoise__705335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705335L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "applyCarvers(Lnet/minecraft/server/level/WorldGenRegion;JLnet/minecraft/world/level/levelgen/RandomState;Lnet/minecraft/world/level/biome/BiomeManager;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void applyCarvers__263808593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-263808593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnOriginalMobs(Lnet/minecraft/server/level/WorldGenRegion;)V", cancellable = true)
    private void spawnOriginalMobs_933912678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(933912678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyBiomeDecoration(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/StructureManager;)V", cancellable = true)
    private void applyBiomeDecoration_1006480979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1006480979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGenDepth()I", cancellable = true)
    private void getGenDepth_1978650767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978650767L))
            info.setReturnValue(-736395795);
    }

    @Inject(at = @At("HEAD"), method = "getBaseHeight(IILnet/minecraft/world/level/levelgen/Heightmap$Types;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/world/level/levelgen/RandomState;)I", cancellable = true)
    private void getBaseHeight__707800541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707800541L))
            info.setReturnValue(-1411223349);
    }

    @Inject(at = @At("HEAD"), method = "getBlockStateFor(II)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getBlockStateFor__1296695545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296695545L))
            info.setReturnValue(null);
    }


}
