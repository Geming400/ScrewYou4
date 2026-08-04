package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.EndCityPieces.class)
public class EndCityPieces_471759363Mixin {
        @Inject(at = @At("HEAD"), method = "startHouseTower(Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Ljava/util/List;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void startHouseTower__1492873599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1492873599L))
            info.cancel();
    }


}
