package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.CastleSmallCorridorCrossingPiece.class)
public class CastleSmallCorridorCrossingPiece701094678Mixin {
        @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_945958640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945958640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;IIILnet/minecraft/core/Direction;I)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$CastleSmallCorridorCrossingPiece;", cancellable = true)
    private static void createPiece_1727374184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727374184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1519328265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1519328265L))
            info.cancel();
    }


}
