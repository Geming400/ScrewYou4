package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer.class)
public class ForkingTrunkPlacer1641235553Mixin {
        @Inject(at = @At("HEAD"), method = "placeTrunk(Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)Ljava/util/List;", cancellable = true)
    private void placeTrunk_1061105330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061105330L))
            info.setReturnValue(null);
    }


}
