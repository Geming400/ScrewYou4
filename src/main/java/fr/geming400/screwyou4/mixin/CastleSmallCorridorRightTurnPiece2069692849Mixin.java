package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.CastleSmallCorridorRightTurnPiece.class)
public class CastleSmallCorridorRightTurnPiece2069692849Mixin {
        @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;I)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$CastleSmallCorridorRightTurnPiece;", cancellable = true)
    private static void createPiece__772320394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772320394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren__1508597941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1508597941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_1393334529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1393334529L))
            info.cancel();
    }


}
