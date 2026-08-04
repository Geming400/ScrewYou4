package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftPieces.MineShaftRoom.class)
public class MineShaftRoom_1797064380Mixin {
        @Inject(at = @At("HEAD"), method = "move(III)V", cancellable = true)
    private void move_1016971975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1016971975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren_2041928341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2041928341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__423358564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-423358564L))
            info.cancel();
    }


}
