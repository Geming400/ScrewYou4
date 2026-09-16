package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FeatureCountTracker.class)
public class FeatureCountTracker1706244817Mixin {
        @Inject(at = @At("HEAD"), method = "chunkDecorated(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void chunkDecorated__231658109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-231658109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logCounts()V", cancellable = true)
    private static void logCounts_991997396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991997396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "featurePlaced(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/levelgen/feature/ConfiguredFeature;Ljava/util/Optional;)V", cancellable = true)
    private static void featurePlaced_921425280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(921425280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearCounts()V", cancellable = true)
    private static void clearCounts_2072087339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2072087339L))
            info.cancel();
    }


}
