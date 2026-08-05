package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces.FiveCrossing.class)
public class FiveCrossing_1706170473Mixin {
        @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_1951034434(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1951034434L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;I)Lnet/minecraft/world/level/levelgen/structure/structures/StrongholdPieces$FiveCrossing;", cancellable = true)
    private static void createPiece__1884744747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884744747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__514252471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-514252471L))
            info.cancel();
    }


}
