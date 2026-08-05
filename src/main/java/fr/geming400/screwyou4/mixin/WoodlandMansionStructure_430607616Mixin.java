package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.WoodlandMansionStructure.class)
public class WoodlandMansionStructure_430607616Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__714993853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714993853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "afterPlace(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/levelgen/structure/pieces/PiecesContainer;)V", cancellable = true)
    private void afterPlace__1376842962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1376842962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_429938593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429938593L))
            info.setReturnValue(null);
    }


}
