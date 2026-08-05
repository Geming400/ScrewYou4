package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFossilPieces.class)
public class NetherFossilPieces696034253Mixin {
        @Inject(at = @At("HEAD"), method = "addPieces(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void addPieces_1232529016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1232529016L))
            info.cancel();
    }


}
