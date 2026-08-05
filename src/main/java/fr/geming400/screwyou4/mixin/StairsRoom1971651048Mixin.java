package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.StairsRoom.class)
public class StairsRoom1971651048Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_1295292728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1295292728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren__1606639742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1606639742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;IIIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$StairsRoom;", cancellable = true)
    private static void createPiece_1072083922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072083922L))
            info.setReturnValue(null);
    }


}
