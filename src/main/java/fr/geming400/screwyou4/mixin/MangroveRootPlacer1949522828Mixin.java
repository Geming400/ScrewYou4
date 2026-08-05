package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacer.class)
public class MangroveRootPlacer1949522828Mixin {
        @Inject(at = @At("HEAD"), method = "placeRoots(Lnet/minecraft/world/level/WorldGenLevel;Ljava/util/function/BiConsumer;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/feature/configurations/TreeConfiguration;)Z", cancellable = true)
    private void placeRoots_430271018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430271018L))
            info.setReturnValue(false);
    }


}
