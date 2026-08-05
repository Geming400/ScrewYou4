package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FeaturePlaceContext.class)
public class FeaturePlaceContext2124662416Mixin {
        @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config_422587374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422587374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random__183376774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183376774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void origin__741324373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741324373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void level_177610726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177610726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topFeature()Ljava/util/Optional;", cancellable = true)
    private void topFeature_1391852831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391852831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator_425350368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425350368L))
            info.setReturnValue(null);
    }


}
