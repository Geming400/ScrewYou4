package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces.FillerCorridor.class)
public class FillerCorridor_1299730147Mixin {
        @Inject(at = @At("HEAD"), method = "findPieceBox(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;IIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void findPieceBox_595383757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595383757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__920692797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-920692797L))
            info.cancel();
    }


}
