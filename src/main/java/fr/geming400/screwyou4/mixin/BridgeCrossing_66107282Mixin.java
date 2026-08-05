package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.BridgeCrossing.class)
public class BridgeCrossing_66107282Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_2140651634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2140651634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_310971243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(310971243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;IIILnet/minecraft/core/Direction;I)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$BridgeCrossing;", cancellable = true)
    private static void createPiece__540468597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540468597L))
            info.setReturnValue(null);
    }


}
