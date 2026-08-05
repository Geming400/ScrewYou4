package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.WoodlandMansionPieces.class)
public class WoodlandMansionPieces1598031598Mixin {
        @Inject(at = @At("HEAD"), method = "generateMansion(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Ljava/util/List;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void generateMansion__104297133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-104297133L))
            info.cancel();
    }


}
