package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftPieces.MineShaftStairs.class)
public class MineShaftStairs_569504397Mixin {
        @Inject(at = @At("HEAD"), method = "findStairs(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void findStairs__134841993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134841993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1650918547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1650918547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_814368358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(814368358L))
            info.cancel();
    }


}
