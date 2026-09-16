package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.OreFeature.class)
public class OreFeature_161113462Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1734985814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734985814L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOre(Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Function;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/feature/configurations/OreConfiguration;Lnet/minecraft/world/level/levelgen/feature/configurations/OreConfiguration$TargetBlockState;Lnet/minecraft/core/BlockPos$MutableBlockPos;)Z", cancellable = true)
    private static void canPlaceOre__499713488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499713488L))
            info.setReturnValue(true);
    }


}
