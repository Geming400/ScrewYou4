package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.DesertPyramidPiece.class)
public class DesertPyramidPiece1092513495Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1127909448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1127909448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPotentialSuspiciousSandWorldPositions()Ljava/util/List;", cancellable = true)
    private void getPotentialSuspiciousSandWorldPositions__1576116985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576116985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomCollapsedRoofPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRandomCollapsedRoofPos__800873384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800873384L))
            info.setReturnValue(null);
    }


}
