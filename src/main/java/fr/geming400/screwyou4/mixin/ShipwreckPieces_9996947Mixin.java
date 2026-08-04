package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.ShipwreckPieces.class)
public class ShipwreckPieces_9996947Mixin {
        @Inject(at = @At("HEAD"), method = "addRandomPiece(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/levelgen/structure/StructurePieceAccessor;Lnet/minecraft/util/RandomSource;Z)Lnet/minecraft/world/level/levelgen/structure/structures/ShipwreckPieces$ShipwreckPiece;", cancellable = true)
    private static void addRandomPiece__747632950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747632950L))
            info.setReturnValue(null);
    }


}
