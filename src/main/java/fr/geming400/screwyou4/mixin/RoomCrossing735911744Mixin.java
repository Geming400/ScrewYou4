package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.RoomCrossing.class)
public class RoomCrossing735911744Mixin {
        @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;IIILnet/minecraft/core/Direction;I)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$RoomCrossing;", cancellable = true)
    private static void createPiece__1966162822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966162822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_1452588250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1452588250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_59553424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59553424L))
            info.cancel();
    }


}
