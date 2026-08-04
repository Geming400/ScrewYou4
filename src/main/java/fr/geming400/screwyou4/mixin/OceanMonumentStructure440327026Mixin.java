package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanMonumentStructure.class)
public class OceanMonumentStructure440327026Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__705274442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705274442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_439658004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439658004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "regeneratePiecesAfterLoad(Lnet/minecraft/world/level/ChunkPos;JLnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;", cancellable = true)
    private static void regeneratePiecesAfterLoad_1969825293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969825293L))
            info.setReturnValue(null);
    }


}
