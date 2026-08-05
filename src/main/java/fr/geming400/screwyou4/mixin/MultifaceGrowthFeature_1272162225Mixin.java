package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.MultifaceGrowthFeature.class)
public class MultifaceGrowthFeature_1272162225Mixin {
        @Inject(at = @At("HEAD"), method = "placeGrowthIfPossible(Lnet/minecraft/world/level/block/MultifaceSpreadeableBlock;Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/levelgen/feature/configurations/MultifaceGrowthConfiguration;Lnet/minecraft/util/RandomSource;Ljava/util/List;)Z", cancellable = true)
    private static void placeGrowthIfPossible_1990197692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990197692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1448932719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448932719L))
            info.setReturnValue(true);
    }


}
