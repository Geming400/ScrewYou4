package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.class)
public class RuinedPortalPiece_1505069875Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_828711554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(828711554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeightMapType(Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void getHeightMapType_461082527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461082527L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Types.OCEAN_FLOOR);
    }


}
