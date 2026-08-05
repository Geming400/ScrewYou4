package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanRuinPieces.class)
public class OceanRuinPieces494626845Mixin {
        @Inject(at = @At("HEAD"), method = "addPieces(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinStructure;)V", cancellable = true)
    private static void addPieces__1810321683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1810321683L))
            info.cancel();
    }


}
