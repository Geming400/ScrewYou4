package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftPieces.MineShaftRoom.class)
public class MineShaftRoom_1797064380Mixin {
        @Inject(at = @At("HEAD"), method = "move(III)V", cancellable = true)
    private void move_725917080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(725917080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_1120706059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1120706059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addChildren(Lnet/minecraft/world/level/levelgen/structure/StructurePiece;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void addChildren__1781226411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1781226411L))
            info.cancel();
    }


}
