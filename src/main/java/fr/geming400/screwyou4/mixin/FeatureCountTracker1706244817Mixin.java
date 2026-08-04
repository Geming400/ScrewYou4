package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FeatureCountTracker.class)
public class FeatureCountTracker1706244817Mixin {
        @Inject(at = @At("HEAD"), method = "clearCounts()V", cancellable = true)
    private static void clearCounts_1744519804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1744519804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logCounts()V", cancellable = true)
    private static void logCounts_1744519804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1744519804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "featurePlaced(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/levelgen/feature/ConfiguredFeature;Ljava/util/Optional;)V", cancellable = true)
    private static void featurePlaced__1679988045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679988045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chunkDecorated(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void chunkDecorated_727835725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727835725L))
            info.cancel();
    }


}
