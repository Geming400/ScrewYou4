package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftPieces.MineShaftCorridor.class)
public class MineShaftCorridor_1200674925Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1019748019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1019748019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findCorridorSize(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void findCorridorSize_496328535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496328535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_1445538886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1445538886L))
            info.cancel();
    }


}
