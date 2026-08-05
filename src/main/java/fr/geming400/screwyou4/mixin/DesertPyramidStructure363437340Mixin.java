package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.DesertPyramidStructure.class)
public class DesertPyramidStructure363437340Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__1291788646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291788646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "afterPlace(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)V", cancellable = true)
    private void afterPlace__1218658154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1218658154L))
            info.cancel();
    }


}
