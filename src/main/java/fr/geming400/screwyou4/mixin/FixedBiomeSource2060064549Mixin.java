package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.FixedBiomeSource.class)
public class FixedBiomeSource2060064549Mixin {
        @Inject(at = @At("HEAD"), method = "getBiomesWithin(IIIILnet/minecraft/world/level/biome/Climate$Sampler;)Ljava/util/Set;", cancellable = true)
    private void getBiomesWithin_1150396288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150396288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(IIILnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__855498975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855498975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__832874694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832874694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestBiome3d(Lnet/minecraft/core/BlockPos;IIILjava/util/function/Predicate;Lnet/minecraft/world/level/biome/Climate$Sampler;Lnet/minecraft/world/level/LevelReader;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void findClosestBiome3d__7674834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7674834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findBiomeHorizontal(IIIIILjava/util/function/Predicate;Lnet/minecraft/util/RandomSource;ZLnet/minecraft/world/level/biome/Climate$Sampler;)Lcom/mojang/datafixers/util/Pair;", cancellable = true)
    private void findBiomeHorizontal__1919407410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919407410L))
            info.setReturnValue(null);
    }


}
