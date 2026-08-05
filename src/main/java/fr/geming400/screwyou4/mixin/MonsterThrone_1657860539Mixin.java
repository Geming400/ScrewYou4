package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressPieces.MonsterThrone.class)
public class MonsterThrone_1657860539Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_981502218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(981502218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPiece(Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;IIIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/structures/NetherFortressPieces$MonsterThrone;", cancellable = true)
    private static void createPiece__1407164501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407164501L))
            info.setReturnValue(null);
    }


}
