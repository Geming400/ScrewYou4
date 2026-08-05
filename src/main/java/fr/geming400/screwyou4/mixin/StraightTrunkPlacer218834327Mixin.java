package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer.class)
public class StraightTrunkPlacer218834327Mixin {
        @Inject(at = @At("HEAD"), method = "placeTrunk(Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)Ljava/util/List;", cancellable = true)
    private void placeTrunk__361295896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361295896L))
            info.setReturnValue(null);
    }


}
