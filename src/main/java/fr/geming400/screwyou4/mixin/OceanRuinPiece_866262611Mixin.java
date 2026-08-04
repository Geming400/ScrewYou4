package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanRuinPieces.OceanRuinPiece.class)
public class OceanRuinPiece_866262611Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/levelgen/structure/structures/OceanRuinPieces$OceanRuinPiece;", cancellable = true)
    private static void create__998225428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998225428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1354160333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1354160333L))
            info.cancel();
    }


}
