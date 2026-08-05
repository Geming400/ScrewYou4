package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.FeaturePlaceContext.class)
public class FeaturePlaceContext2124662416Mixin {
        @Inject(at = @At("HEAD"), method = "config()Lnet/minecraft/world/level/levelgen/feature/configurations/FeatureConfiguration;", cancellable = true)
    private void config__1871450708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871450708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random_75037533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75037533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void origin_231275537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231275537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void level_179492074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179492074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunkGenerator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void chunkGenerator_327670010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327670010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topFeature()Ljava/util/Optional;", cancellable = true)
    private void topFeature__1924843458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924843458L))
            info.setReturnValue(null);
    }


}
