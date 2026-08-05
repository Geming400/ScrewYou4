package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanMonumentStructure.class)
public class OceanMonumentStructure440327026Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__1214898960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214898960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "regeneratePiecesAfterLoad(Lnet/minecraft/world/level/ChunkPos;JLnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private static void regeneratePiecesAfterLoad__1489409384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489409384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__1480426829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480426829L))
            info.setReturnValue(null);
    }


}
