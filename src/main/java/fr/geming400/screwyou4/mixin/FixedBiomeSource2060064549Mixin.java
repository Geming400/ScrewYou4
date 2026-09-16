package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.FixedBiomeSource.class)
public class FixedBiomeSource2060064549Mixin {
        @Inject(at = @At("HEAD"), method = "findClosestBiome3d(Lnet/minecraft/core/BlockPos;IIILjava/util/function/Predicate;Lnet/minecraft/world/level/biome/Climate$Sampler;Lnet/minecraft/world/level/LevelReader;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void findClosestBiome3d__244032291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244032291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome_59136470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59136470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1243310075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1243310075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findBiomeHorizontal(IIIIILjava/util/function/Predicate;Lnet/minecraft/util/RandomSource;ZLnet/minecraft/world/level/biome/Climate$Sampler;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void findBiomeHorizontal__2096497149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096497149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomesWithin(IIIILnet/minecraft/world/level/biome/Climate$Sampler;)Ljava/util/Set;", cancellable = true)
    private void getBiomesWithin__1910335468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1910335468L))
            info.setReturnValue(null);
    }


}
